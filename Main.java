public class Main {
    public static void main(String[] args) {
        ModArrayList<Integer> listy = new ModArrayList<>();

        listy.add(0);
        listy.add(1);
        listy.add(2);
        listy.add(3);
        listy.add(4);
        listy.add(5);
        listy.add(6);

        System.out.println(listy.getUsingMod(40));
        System.out.println(listy.getUsingMod(1));
        System.out.println(listy.getUsingMod(-2));
    }
}
