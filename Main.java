
public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree(100, 10, TreeType.OAK);

        System.out.println("The tree type is "+tree1.getTreeType()+".");
        System.out.println("The tree height was "+tree1.getHeightFt()+" feet.");
        System.out.println("The tree trunk diameter is "+tree1.getTrunkDiameterInches()+" inches.");
        // above we can see that the tree type is an enum, and the other two are doubles which cannot be changed

        tree1.grow(); // except for here, where we can change the height and trunk diameter

        System.out.println("The tree height is now "+tree1.getHeightFt()+" feet.");
    }
}
