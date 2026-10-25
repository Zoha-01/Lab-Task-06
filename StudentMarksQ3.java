import java.util.HashMap;
import java.util.Map;

public class StudentMarksQ3 {
    public static void main(String[] args) {
        // Initial setup
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
    }
}
// --- NAYA CODE (Step 2 ke liye) ---
        // Search student and update marks
        String searchName = "Ali";
        if (studentMap.containsKey(searchName)) {
            studentMap.put(searchName, 95); // Updating Ali's marks to 95
            System.out.println("\n[Updated] " + searchName + "'s new marks: " + studentMap.get(searchName));
        }