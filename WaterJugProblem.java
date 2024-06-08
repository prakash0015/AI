package Aiexam;
package AI;
public class WaterJugProblem {

    // Function to solve the water jug problem
    public static void solveWaterJugProblem(int jug1Capacity, int jug2Capacity, int target) {
        int jug1 = 0; // Initial amount of water in jug 1
        int jug2 = 0; // Initial amount of water in jug 2

        System.out.println("Steps:");

        // Loop until either of the jugs contains the target amount of water
        while (jug1 != target && jug2 != target) {
            // If jug 1 is empty, fill it
            if (jug1 == 0) {
                jug1 = jug1Capacity;
                System.out.println("Fill jug 1");
            }
            // If jug 2 is full, empty it
            else if (jug2 == jug2Capacity) {
                jug2 = 0;
                System.out.println("Empty jug 2");
            }
            // If jug 1 can pour all its water into jug 2
            else if (jug1 <= jug2Capacity - jug2) {
                jug2 += jug1;
                jug1 = 0;
                System.out.println("Pour all water from jug 1 to jug 2");
            }
            // If jug 1 can only pour some of its water into jug 2
            else {
                jug1 -= (jug2Capacity - jug2);
                jug2 = jug2Capacity;
                System.out.println("Pour water from jug 1 to fill jug 2");
            }
        }

        // Print the final state of the jugs
        System.out.println("Final State:");
        System.out.println("Jug 1: " + jug1 + " liters");
        System.out.println("Jug 2: " + jug2 + " liters");
    }

    // Main method to test the water jug problem
    public static void main(String[] args) {
        int jug1Capacity = 4; // Capacity of jug 1
        int jug2Capacity = 3; // Capacity of jug 2
        int target = 2; // Target amount of water to measure

        // Solve the water jug problem
        solveWaterJugProblem(jug1Capacity, jug2Capacity, target);
    }
}
