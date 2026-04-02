import java.util.HashSet;
import java.util.Set;

/**
 * =====================================================
 * MAIN CLASS - UseCaseIIITrainConsistMgmt
 * =====================================================
 *
 * Use Case 3: Track Unique Bogie IDs (Set - HashSet)
 *
 * Description:
 * This class demonstrates how HashSet enforces uniqueness
 * of bogie IDs in the Train Consist Management Application.
 *
 * At this stage, the application:
 * - Creates a HashSet to store unique bogie IDs
 * - Adds duplicate bogie IDs intentionally
 * - Demonstrates automatic deduplication by HashSet
 * - Displays only unique bogie IDs
 *
 * This use case introduces Set interface and HashSet
 * for uniqueness enforcement.
 *
 * @author Developer
 * @version 1.0
 */
public class UseCaseIIITrainConsistMgmt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=====================================");
        System.out.println("  UC3 - Track Unique Bogie IDs");
        System.out.println("=====================================");

        // Create HashSet to store unique bogie IDs
        // HashSet automatically ignores duplicate entries
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs - including intentional duplicates
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");
        bogieIds.add("BG101"); // duplicate - will be ignored
        bogieIds.add("BG102"); // duplicate - will be ignored

        // Display unique bogie IDs after insertion
        System.out.println("\nBogie IDs After Insertion:");
        System.out.println(bogieIds);

        // Note about HashSet behavior
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}
```

**Output matches exactly:**
```
=====================================
  UC3 - Track Unique Bogie IDs
=====================================

Bogie IDs After Insertion:
[BG104, BG103, BG102, BG101]

Note:
Duplicates are automatically ignored by HashSet.

UC3 uniqueness validation completed...
