package CodeVita;

public class GoodString {
//    #include <iostream>
//#include <cmath>
//
//    int main() {
//        string good_string, student_name;
//
//        // Input
//        getline(cin, good_string);
//        getline(cin, student_name);
//
//        // Output
//        cout << calculate_distance(good_string, student_name) << endl;
//
//        return 0;
//    }
//
//    using namespace std;
//
//    int calculate_distance(const string& good_string, const string& student_name) {
//        int total_distance = 0;
//        char previous_good_letter = good_string[0];
//
//        for (char current_char : student_name) {
//            if (good_string.find(current_char) != string::npos) {
//                continue;
//            }
//
//            int min_distance = abs(previous_good_letter - good_string[0]);
//            char nearest_good_letter = good_string[0];
//
//            for (char good_letter : good_string) {
//                int distance = abs(current_char - good_letter);
//                if (distance < min_distance || (distance == min_distance && good_letter < nearest_good_letter)) {
//                    min_distance = distance;
//                    nearest_good_letter = good_letter;
//                }
//            }
//
//            total_distance += min_distance;
//            previous_good_letter = nearest_good_letter;
//        }
//
//        return total_distance;
//    }
}
