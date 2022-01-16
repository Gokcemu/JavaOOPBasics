import java.awt.Color;

public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;
    static Color TRUNK_COLOR = new Color(102, 51, 0);

    Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow() {
        this.heightFt += 10.0D;
        ++this.trunkDiameterInches;
    }

    static void announceTree() {
        System.out.println("Look out for that" + TRUNK_COLOR + " tree");
    }

    void announceTallTree() {
        if (this.heightFt > 100.0D) {
            System.out.println("That's a tall " + this.treeType + " tree");
        }

    }
}
