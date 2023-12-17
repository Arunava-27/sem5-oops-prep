import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void addRandomNumbers(ArrayList<Integer> list, int amount) {
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            list.add(random.nextInt(100));
        }
    }

    public static void main(String[] args){
        OddArrayList oddList = new OddArrayList();
        ArrayList<Integer> List = new ArrayList<>();


        oddList.add(1);
        oddList.add(2);
        oddList.add(3);
        oddList.add(4);
        oddList.add(7);
        oddList.add(9);
        oddList.add(-13);

        System.out.println(oddList);
        System.out.println("Size of Odd List : "+oddList.size());
        addRandomNumbers(oddList, 5);
        System.out.println(oddList);
        System.out.println("Size of List after adding random numbers : "+oddList.size());


        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(7);
        List.add(9);
        List.add(-13);

        System.out.println(List);
        System.out.println("Size of List : "+List.size());
        addRandomNumbers(List, 5);
        System.out.println(List);
        System.out.println("Size of List after adding random numbers : "+List.size());

        
    }
}
