import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {
        // Step 1: Basic setup
        System.out.println("Starting StudentMarks Program...");
    }
}
// Step 2: HashMap banayein aur 5 records dalein
        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Ali", 85);
        studentMap.put("Ahmed", 90);
        studentMap.put("Sara", 78);
        studentMap.put("Usman", 92);
        studentMap.put("Zainab", 88);
        // Step 3: All records print karein
        System.out.println("--- All Student Records ---");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Step 4: Sara ke marks update karein[cite: 1]
        studentMap.put("Sara", 84);
        System.out.println("\nUpdated Sara's marks to: " + studentMap.get("Sara"));
        // Step 5: Retrieve and total count[cite: 1]
        System.out.println("Ali's Marks: " + studentMap.get("Ali"));
        System.out.println("Total students in map: " + studentMap.size());
    }
}
