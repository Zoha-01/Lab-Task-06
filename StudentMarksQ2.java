import java.util.HashMap;
import java.util.Map;

public class StudentMarksQ2 {
    public static void main(String[] args) {
        // Initial setup
        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Ali", 85);
        studentMap.put("Ahmed", 90);
        studentMap.put("Sara", 78);
        studentMap.put("Usman", 92);
        studentMap.put("Zainab", 88);

        // 1. Search student
        String searchName = "Usman";
        if (studentMap.containsKey(searchName)) {
            System.out.println("[Search] " + searchName + " exists with marks: " + studentMap.get(searchName));
        } else {
            System.out.println("[Search] " + searchName + " not found.");
        }
        // 2. Remove student
        String removeName = "Ahmed";
        studentMap.remove(removeName);
        System.out.println("\n[Remove] Successfully removed record for: " + removeName);

        // 3. Display remaining students
        System.out.println("\n--- Remaining Students List ---");
        for (String student : studentMap.keySet()) {
            System.out.println("Student: " + student + " | Marks: " + studentMap.get(student));
        }
        // 4. Find highest scorer
        String topStudent = "";
        int maxMarks = -1;

        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            if (entry.getValue() > maxMarks) {
                maxMarks = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        System.out.println("\nTop Scorer: " + topStudent + " with " + maxMarks + " marks.");
    }
}
