import java.util.HashMap;

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
    }
}
