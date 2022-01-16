import java.awt.*;

public class Main {
    public static void main(String[] args){
       Tree myFavoriteOakTree = new Tree(120, 5, TreeType.OAK); // This tree instance of Tree class, created by a constructor.
       System.out.println(myFavoriteOakTree.treeType);
       myFavoriteOakTree.announceTallTree();

       Tree myFavoriteMapleTree = new Tree (90,
               30, TreeType.MAPLE);
       System.out.println(myFavoriteMapleTree.treeType);
       myFavoriteMapleTree.announceTallTree();
       System.out.println(Tree.TRUNK_COLOR);
       Tree.announceTree();
    }



}
