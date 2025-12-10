import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class RobustReverseMap {
    public static void main(String[] args) {
        // 1. Setup Original Map with Duplicate Values
        final Map<String, Integer> ogMap = new HashMap<>();
        ogMap.put("A", 1);
        ogMap.put("B", 2);
        ogMap.put("C", 1); // <-- Duplicate value 1
        ogMap.put("D", 3);
        ogMap.put("E", 3); // <-- Duplicate value 3

        // 2. Define the Reversed Map Structure
        // Key: The original Integer value
        // Value: A List of String keys that mapped to that Integer
        Map<Integer, List<String>> robustRevMap = new HashMap<>();

        // 3. Iterate and Build the Robust Reversed Map
        for (Map.Entry<String, Integer> entry : ogMap.entrySet()) {
            String originalKey = entry.getKey();
            Integer originalValue = entry.getValue();

            // Use the originalValue as the key for the robustRevMap
            // If the key (originalValue) is not present, compute a new ArrayList for it
            // If the key is present, get the existing list and add the originalKey to it
            
            // This is a common pattern using getOrDefault or computeIfAbsent in modern Java
            // A more explicit way (pre-Java 8) is:
            
            List<String> keysList = robustRevMap.get(originalValue);
            
            if (keysList == null) {
                // First time we've seen this value, create a new list
                keysList = new ArrayList<>();
                robustRevMap.put(originalValue, keysList);
            }
            
            // Add the original key to the list associated with the value
            keysList.add(originalKey);
        }
        
        System.out.println("Original Map: " + ogMap);
        System.out.println("Robust Reversed Map: " + robustRevMap);
    }
}
