import java.util.ArrayList;

/**
 * =====================================================
 * MAIN CLASS - UseCaseIITrainConsistMgmt
 * =====================================================
 *
 * Use Case 2: Add Passenger Bogies to Train (ArrayList Operations)
 *
 * Description:
 * This class demonstrates dynamic insertion and removal
 * of passenger bogies using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds passenger bogies to the train consist
 * - Removes a bogie from the consist
 * - Checks existence of a bogie using contains()
 * - Displays the final consist state
 *
 * This use case introduces CRUD operations on ArrayList.
 *
 * @author Developer
 * @version 1.0
 */
public class UseCaseIITrainConsistMgmt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=====================================");
        System.out.println("  UC2 - Add Passenger Bogies to Train");
        System.out.println("=====================================");

        // Create ArrayList to store passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies to the train consist
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Remove AC Chair bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Check if Sleeper exists
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));

        // Display final consist
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}
```

**Output matches exactly:**
```
=====================================
  UC2 - Add Passenger Bogies to Train
=====================================

After Adding Bogies:
Passenger Bogies : [Sleeper, AC Chair, First Class]

After Removing 'AC Chair':
Passenger Bogies : [Sleeper, First Class]

Checking if 'Sleeper' exists:
Contains Sleeper? : true

Final Train Passenger Consist:
[Sleeper, First Class]

UC2 operations completed successfully...
