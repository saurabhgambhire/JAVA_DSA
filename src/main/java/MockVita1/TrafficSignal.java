package MockVita1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficSignal extends JFrame {
    private Color colorRed, colorYellow, colorGreen;
    private int currentSignal;

    public TrafficSignal() {
        // Initialize colors
        colorRed = Color.RED;
        colorYellow = Color.YELLOW;
        colorGreen = Color.GREEN;

        // Set the default signal to red
        currentSignal = 0;

        // Set frame properties
        setSize(300, 400);
        setTitle("Interactive Traffic Signal Simulation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a Timer for signal changes
        Timer timer = new Timer(3000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeSignal();
            }
        });
        timer.start();

        // Add a panel to handle mouse clicks
        JPanel panel = new JPanel();
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeSignal();
            }
        });

        add(panel);
        setVisible(true);
    }

    public void paint(Graphics g) {
        // Draw the traffic signal
        g.drawRect(100, 50, 100, 300); // Signal box

        // Draw the red light
        g.setColor((currentSignal == 0) ? colorRed : Color.GRAY);
        g.fillOval(150, 75, 20, 20);

        // Draw the yellow light
        g.setColor((currentSignal == 1) ? colorYellow : Color.GRAY);
        g.fillOval(150, 150, 20, 20);

        // Draw the green light
        g.setColor((currentSignal == 2) ? colorGreen : Color.GRAY);
        g.fillOval(150, 225, 20, 20);
    }

    private void changeSignal() {
        // Cycle through red, yellow, and green signals
        currentSignal = (currentSignal + 1) % 3;
        repaint();
    }

    public static void main(String[] args) {
        new TrafficSignal();
    }
}
