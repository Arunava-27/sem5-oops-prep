import java.util.ArrayList;
import java.util.Random;

public class Main {

    /**
     * Adds random numbers to the given list.
     * 
     * @param list   the list to add numbers to
     * @param amount the number of random numbers to add
     */
    public static void addRandomNumbers(ArrayList<Integer> list, int amount) {
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            int n = random.nextInt(100);

            if(list instanceof ConditionArrayList) {
                ConditionArrayList conditionList = (ConditionArrayList) list;
                while (!conditionList.isEligible(n)) {
                    n = random.nextInt(100);
                }
            }

            list.add(n);
        }
    }

    public static void main(String[] args) {
        ConditionArrayList oddList = new ConditionArrayList(
                (Integer num) -> num % 2 != 0,
                1, 2, 3, 4, 7, 9, -13);
        ArrayList<Integer> List = new ArrayList<>();

        System.out.println(oddList);
        System.out.println("Size of Odd List : " + oddList.size());
        addRandomNumbers(oddList, 5);
        System.out.println(oddList);
        System.out.println("Size of List after adding random numbers : " + oddList.size());

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(7);
        List.add(9);
        List.add(-13);

        System.out.println(List);
        System.out.println("Size of List : " + List.size());
        addRandomNumbers(List, 5);
        System.out.println(List);
        System.out.println("Size of List after adding random numbers : " + List.size());

    }
}
