package tree;

import java.awt.Color;

public class Tree {
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;
    static Color TRUNK_COLOR = new Color(102, 51, 0);

    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    public double getHeightFt(){
        return heightFt;
    }

    public double getTrunkDiameterInches(){
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches){
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public TreeType getTreeType(){
        return treeType;
    }

    public void grow() {
        this.heightFt += 10.0D;
        ++this.trunkDiameterInches;
    }

    static void announceTree() {
        System.out.println("Look out for that" + TRUNK_COLOR + " tree");
    }

    public void announceTallTree() {
        if (this.heightFt > 100.0D) {
            System.out.println("That's a tall " + this.treeType + " tree");
        }

    }
}
