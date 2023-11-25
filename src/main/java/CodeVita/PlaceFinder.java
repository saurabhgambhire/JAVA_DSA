package CodeVita;

import java.util.*;

class Device {
    int id;
    Map<Integer, DeviceInfo> neighbors;

    public Device(int id) {
        this.id = id;
        this.neighbors = new HashMap<>();
    }
}

class DeviceInfo {
    int id;
    int distance;
    int angle;

    public DeviceInfo(int id, int distance, int angle) {
        this.id = id;
        this.distance = distance;
        this.angle = angle;
    }
}

public class PlaceFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of devices
        int N = scanner.nextInt();
        scanner.nextLine();

        // Create devices map
        Map<Integer, Device> devices = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            devices.put(i, new Device(i));
        }

        // Read the devices and their capabilities
        for (int i = 1; i <= N; i++) {
            String[] deviceInfo = scanner.nextLine().split(" ");
            int deviceId = Integer.parseInt(deviceInfo[0].split(":")[0]);
            int numDevices = Integer.parseInt(deviceInfo[1]);

            for (int j = 0; j < numDevices; j++) {
                String[] deviceDetails = scanner.nextLine().split(" ");
                int neighborId = Integer.parseInt(deviceDetails[0]);
                int distance = Integer.parseInt(deviceDetails[1]);
                int angle = Integer.parseInt(deviceDetails[2]);

                devices.get(deviceId).neighbors.put(neighborId, new DeviceInfo(neighborId, distance, angle));
            }
        }

        // Read the devices between which distance needs to be found
        int device1 = scanner.nextInt();
        int device2 = scanner.nextInt();

        // Calculate the distance between the given devices
        double distance = calculateDistance(devices, device1, device2);

        if (distance != -1) {
            System.out.printf("%.2f\n", distance);
        } else {
            System.out.println("Devices are not connected");
        }
    }

    private static double calculateDistance(Map<Integer, Device> devices, int device1, int device2) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(device1);
        visited.add(device1);

        while (!queue.isEmpty()) {
            int currentDevice = queue.poll();

            Map<Integer, DeviceInfo> neighbors = devices.get(currentDevice).neighbors;
            if (neighbors != null) {
                for (DeviceInfo neighborInfo : neighbors.values()) {
                    int neighbor = neighborInfo.id;
                    if (!visited.contains(neighbor)) {
                        queue.offer(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }

        if (!visited.contains(device2)) {
            return -1;
        }

        return findDistance(devices, device1, device2);
    }

    private static double findDistance(Map<Integer, Device> devices, int start, int target) {
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Double> distances = new HashMap<>();

        queue.offer(start);
        distances.put(start, 0.0);

        while (!queue.isEmpty()) {
            int currentDevice = queue.poll();
            double currentDistance = distances.get(currentDevice);

            Map<Integer, DeviceInfo> neighbors = devices.get(currentDevice).neighbors;
            if (neighbors != null) {
                for (DeviceInfo neighborInfo : neighbors.values()) {
                    int neighbor = neighborInfo.id;
                    int distance = neighborInfo.distance;
                    double angle = Math.toRadians(neighborInfo.angle);

                    if (!distances.containsKey(neighbor)) {
                        queue.offer(neighbor);
                        distances.put(neighbor, currentDistance + distance * Math.cos(angle));
                    }
                }
            }
        }

        return distances.containsKey(target) ? distances.get(target) : -1;
    }
}

