public class Main {
    public static void main(String[] args) {
        
        Tree tree1 = new Tree(120, 12, TreeType.OAK);
        Tree tree2 = new Tree(80, 8, TreeType.MAPLE);

        tree1.announceTallTree();
        tree2.announceTallTree();
    }
}
