
public class Main {
    public static void main(String[] args) {
        Tree oak = new Tree(100, 10, TreeType.OAK);

        // System.out.println("Tree height is "+oak.heightFt+" feet."); // This line will not compile because heightFt is private
    }
}
