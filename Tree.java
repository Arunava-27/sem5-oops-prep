import java.awt.*;
public class Tree {

    // Add the instance variables here
    protected static Color TRUNK_COLOR = new Color(102, 51, 0);

    private double heightFt;
    private double trunkDiameterIn;
    private TreeType treeType; // TreeType is an enum

    // Add the constructor here
    public Tree(double heightFt, double trunkDiameterIn, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterIn = trunkDiameterIn;
        this.treeType = treeType;
    }

    // Add the grow method here
    public void grow() {
        this.heightFt += 9;
        this.trunkDiameterIn += 1;
    }

    public static void announceTreeColor(){
        System.out.println("Tree color is "+TRUNK_COLOR+".");
    }

    // Add the announceTallTree method here
    public void announceTallTree() {
        if (this.heightFt > 100){
            System.out.println("That's a tall "+this.treeType+" tree!");
        } else {
            System.out.println("That's a short "+this.treeType+" tree!");
        }
    }
}