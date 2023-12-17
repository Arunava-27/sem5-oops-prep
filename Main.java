import java.util.ArrayList;

public class Main {
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

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(7);
        List.add(9);
        List.add(-13);

        System.out.println(List);

        
    }
}
