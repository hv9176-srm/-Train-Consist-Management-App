import java.util.LinkedHashSet;
import java.util.Set;

/**
 * =====================================================
 * MAIN CLASS - UseCaseVTrainConsistMgmt
 * =====================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)
 *
 * Description:
 * This class demonstrates how LinkedHashSet maintains
 * insertion order while enforcing uniqueness in the
 * Train Consist Management Application.
 *
 * At this stage, the application:
 * - Creates a LinkedHashSet to store bogies
 * - Adds duplicate bogies intentionally
 * - Demonstrates order preservation with deduplication
 * - Displays the final train formation in insertion order
 *
 * This use case introduces LinkedHashSet for ordered
 * uniqueness enforcement.
 *
 * @author Developer
 * @version 1.0
 */
public class UseCaseVTrainConsistMgmt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=========================================");
        System.out.println("  UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=========================================");

        // Create LinkedHashSet to maintain insertion order
        // and enforce uniqueness simultaneously
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies in order
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Intentional duplicate - will be ignored automatically
        trainFormation.add("Sleeper");

        // Display final train formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        // Note about LinkedHashSet behavior
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}
```

**Output matches exactly:**
```
=========================================
  UC5 - Preserve Insertion Order of Bogies
=========================================

Final Train Formation:
[Engine, Sleeper, Cargo, Guard]

Note:
LinkedHashSet preserves insertion order and removes duplicates automatically.

UC5 formation setup completed...
