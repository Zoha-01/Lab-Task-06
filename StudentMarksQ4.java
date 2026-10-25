import java.util.Map;

public class StudentMarksQ4 {
    public static void main(String[] args) {
        // Step 1: Initial HashMap Setup
        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Ali", 85);
        studentMap.put("Ahmed", 90);
        studentMap.put("Sara", 78);
        studentMap.put("Usman", 92);
        studentMap.put("Zainab", 88);
        System.out.println("--- All Student Records ---");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
// Step 2: Assign Grades Based on Marks
        System.out.println("\n--- Student Grades ---");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            int marks = entry.getValue();
            char grade;
            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else {
                grade = 'F';
            }
            System.out.println(entry.getKey() + " (Marks: " + marks + ") -> Grade: " + grade);
        }