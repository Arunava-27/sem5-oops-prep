public class Tree {
    double heightFt;
    double trunkDiameterIn;
    TreeType treeType;

    public Tree(double heightFt, double trunkDiameterIn, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterIn = trunkDiameterIn;
        this.treeType = treeType;
    }

    void grow() {
        this.heightFt += 9;
        this.trunkDiameterIn += 1;
    }

    void announceTallTree() {
        if (this.heightFt > 100){
            System.out.println("That's a tall "+this.treeType+" tree!");
        } else {
            System.out.println("That's a short "+this.treeType+" tree!");
        }
    }
}