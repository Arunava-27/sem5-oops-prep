public class Main {
    public static void main(String[] args) {
        
        // Create two Tree objects
        Tree tree1 = new Tree(120, 12, TreeType.OAK);
        Tree tree2 = new Tree(80, 8, TreeType.MAPLE);

        // call the announceTallTree method on each Tree object
        tree1.announceTallTree();
        tree2.announceTallTree();

        Tree.announceTreeColor();
    }
}
