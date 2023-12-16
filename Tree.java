import java.awt.*;
public class Tree {

    // Add the instance variables here
    double heightFt;
    double trunkDiameterIn;
    TreeType treeType; // TreeType is an enum
    static Color TRUNK_COLOR = new Color(102, 51, 0);

    // Add the constructor here
    public Tree(double heightFt, double trunkDiameterIn, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterIn = trunkDiameterIn;
        this.treeType = treeType;
    }

    // Add the grow method here
    void grow() {
        this.heightFt += 9;
        this.trunkDiameterIn += 1;
    }

    static void announceTreeColor(){
        System.out.println("Tree color is "+TRUNK_COLOR+".");
    }

    // Add the announceTallTree method here
    void announceTallTree() {
        if (this.heightFt > 100){
            System.out.println("That's a tall "+this.treeType+" tree!");
        } else {
            System.out.println("That's a short "+this.treeType+" tree!");
        }
    }
}