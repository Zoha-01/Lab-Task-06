import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {
        // 1. HashMap create karein aur 5 records insert karein
        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Ali", 85);
        studentMap.put("Ahmed", 90);
        studentMap.put("Sara", 78);
        studentMap.put("Usman", 92);
        studentMap.put("Zainab", 88);

        // 2. Tamam student records display karein
        System.out.println("--- All Student Records ---");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 3. Ek student ke marks update karein
        studentMap.put("Sara", 84);
        System.out.println("\nUpdated Sara's marks to: " + studentMap.get("Sara"));

        // 4. Retrieve and display specific student marks
        System.out.println("\nAli's Marks: " + studentMap.get("Ali"));

        // 5. Display total number of students
        System.out.println("Total students in map: " + studentMap.size());
    }
}