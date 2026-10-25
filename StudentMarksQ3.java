import java.util.HashMap;
import java.util.Map;

public class StudentMarksQ3 {
    public static void main(String[] args) {
        // Step 1: Initial setup
        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Ali", 85);
        studentMap.put("Ahmed", 90);
        studentMap.put("Sara", 78);
        studentMap.put("Usman", 92);
        studentMap.put("Zainab", 88);

        System.out.println("--- Initial Student Records ---");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Step 2: Search and update logic
        String searchName = "Ali";
        if (studentMap.containsKey(searchName)) {
            studentMap.put(searchName, 95);
            System.out.println("\n[Updated] " + searchName + "'s new marks: " + studentMap.get(searchName));
        }

        // Step 3: Remove record and average calculation
        studentMap.remove("Sara");
        System.out.println("\n[Removed] Sara's record removed.");

        int totalMarks = 0;
        for (int marks : studentMap.values()) {
            totalMarks += marks;
        }
        double average = (double) totalMarks / studentMap.size();
        System.out.println("Average Marks of Remaining Students: " + average);
    }
}