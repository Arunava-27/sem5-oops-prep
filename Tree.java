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
        this.heightFt += 10;
        this.trunkDiameterIn += 1;
    }
}