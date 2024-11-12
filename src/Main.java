//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//
//public class Main {
//
//    private Map<String, Integer> dice;
//    public Main(){
//        dice = new HashMap<>();
//        initiallizeDictionary();
//    }
//
//    private void initiallizeDictionary(){
//        dice.put("1", 1);
//        dice.put("2", 2);
//        dice.put("3", 3);
//        dice.put("4", 4);
//        dice.put("5", 5);
//        dice.put("6", 6);
//    }
//
//    public int convertToNumber(String numeral) {
//        Integer number = dice.get(numeral);
//        return (number != null) ? number : 0;
//    }
//
//    String [] diceRoll = {"5", "3", "5", "3", "1"};
//
////private void autoHold (){
////        System.out.println("Rolling dice: " + Arrays.toString(diceRoll));
////        boolean foundFive = false;
////        boolean foundFour = false;
////        boolean foundThree = false;
////        boolean foundTwo = false;
////        boolean foundOne = false;
////
////        for (int i = 0; i < diceRoll.length; i++) {
////            int dieValue = Math.abs(Integer.parseInt(diceRoll[i]));
////            if (dieValue == 5 && !foundFive) {
////                diceRoll[i] = String.valueOf(-5); // Hold the Five
////                foundFive = true;
////                System.out.println("Held Five (5)");
////            }
////        }
////
////        for (int i = 0; i < diceRoll.length; i++) {
////            int dieValue = Math.abs(Integer.parseInt(diceRoll[i]));
////            if (dieValue == 4 && !foundFour) {
////                diceRoll[i] = String.valueOf(-4); // Hold the Four
////                foundFour = true;
////                System.out.println("Held Four (4)");
////            }
////        }
////
////        for (int i = 0; i < diceRoll.length; i++) {
////            int dieValue = Math.abs(Integer.parseInt(diceRoll[i]));
////            if (dieValue == 3 && !foundThree) {
////                diceRoll[i] = String.valueOf(-3); // Hold the Three
////                foundThree = true;
////                System.out.println("Held Three (3)");
////            }
////        }
////
////        for (int i = 0; i < diceRoll.length; i++) {
////            int dieValue = Math.abs(Integer.parseInt(diceRoll[i]));
////            if (dieValue == 2 && !foundTwo) {
////                diceRoll[i] = String.valueOf(-2); // Hold the Two
////                foundTwo = true;
////                System.out.println("Held Two (2)");
////            }
////        }
////
////        for (int i = 0; i < diceRoll.length; i++) {
////            int dieValue = Math.abs(Integer.parseInt(diceRoll[i]));
////            if (dieValue == 1 && !foundOne) {
////                diceRoll[i] = String.valueOf(-1); // Hold the One
////                foundOne = true;
////                System.out.println("Held One (1)");
////            }
////        }
////
////}
//
//public void findDice(){
//
//    for (int i = 0; i < diceRoll.length; i++) {
//        int dieValue = Math.abs(Integer.parseInt(diceRoll[i]));
//        if (dieValue == 5) {
//            System.out.println("Found Five (5)");
//        }
//    }
//
//    for (int i = 0; i < diceRoll.length; i++) {
//        int dieValue = Math.abs(Integer.parseInt(diceRoll[i]));
//        if (dieValue == 4) {
//            System.out.println("Found Four (4)");
//        }
//    }
//
//    for (int i = 0; i < diceRoll.length; i++) {
//        int dieValue = Math.abs(Integer.parseInt(diceRoll[i]));
//        if (dieValue == 3) {
//            System.out.println("Found Three (3)");
//        }
//    }
//
//    for (int i = 0; i < diceRoll.length; i++) {
//        int dieValue = Math.abs(Integer.parseInt(diceRoll[i]));
//        if (dieValue == 2) {
//            System.out.println("Found Two (2)");
//        }
//    }
//
//    for (int i = 0; i < diceRoll.length; i++) {
//        int dieValue = Math.abs(Integer.parseInt(diceRoll[i]));
//        if (dieValue == 1) {
//            System.out.println("Found One (1)");
//        }
//    }
//
//}
//
//    public void printDice(){
//        System.out.println("Dice: " + Arrays.toString(diceRoll));
//
//}
//
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.findDice();
//    }
//
//
//}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private Map<String, Integer> dice;

    public Main() {
        dice = new HashMap<>();
    }


    String[] diceRoll = {"5", "3", "5", "3", "1"};

    public void findSameDice() {
        Map<Integer, Integer> diceCount = new HashMap<>();

        for (String die : diceRoll) {
            int dieValue = Integer.parseInt(die);
            diceCount.put(dieValue, diceCount.getOrDefault(dieValue, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : diceCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Value " + entry.getKey() + " appears " + entry.getValue() + " times.");
                System.out.println(entry.getValue() + " Pairs");

            } if (entry.getValue() == 5) {
                System.out.println("Yahtzee");

            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.findSameDice();
    }
}

