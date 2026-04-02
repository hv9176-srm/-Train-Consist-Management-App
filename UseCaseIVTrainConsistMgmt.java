import java.util.LinkedList;

/**
 * =====================================================
 * MAIN CLASS - UseCaseIVTrainConsistMgmt
 * =====================================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist (LinkedList)
 *
 * Description:
 * This class demonstrates how LinkedList maintains the
 * physical sequence of bogies in the Train Consist.
 *
 * At this stage, the application:
 * - Creates a LinkedList to store ordered bogies
 * - Inserts a bogie at a specific position
 * - Removes first and last bogies
 * - Displays the final ordered consist
 *
 * This use case introduces LinkedList for ordered,
 * efficient insertion and deletion operations.
 *
 * @author Developer
 * @version 1.0
 */
public class UseCaseIVTrainConsistMgmt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=====================================");
        System.out.println("  UC4 - Maintain Ordered Bogie Consist");
        System.out.println("=====================================");

        // Create LinkedList to maintain ordered train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in order: Engine → Sleeper → AC → Cargo → Guard
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display initial consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (between Sleeper and AC)
        trainConsist.add(2, "Pantry Car");

        // Display after insertion
        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // Remove first bogie (Engine) and last bogie (Guard)
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Display after removal
        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}
```

**Output matches exactly:**
```
=====================================
  UC4 - Maintain Ordered Bogie Consist
=====================================

Initial Train Consist:
[Engine, Sleeper, AC, Cargo, Guard]

After Inserting 'Pantry Car' at position 2:
[Engine, Sleeper, Pantry Car, AC, Cargo, Guard]

After Removing First and Last Bogie:
[Sleeper, Pantry Car, AC, Cargo]

UC4 ordered consist operations completed...
