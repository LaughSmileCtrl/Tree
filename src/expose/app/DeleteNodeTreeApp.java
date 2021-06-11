package expose.app;

import expose.Tree;
import expose.TNode;
import expose.TreeDrawer;
import expose.TreeTranversal;

public class DeleteNodeTreeApp {
    public static void main(String[] args) {
        Integer[] arry = {25,10,37,15,30,65,33};
        nomor1(arry, 25);

        Integer[] arry2 = {40,30,65,25,35,50,26,33,29,34};
        nomor1(arry2, 35);
        nomor1(arry2, 25);
        nomor1(arry2, 50);
        nomor1(arry2, 30);
        

    }

    public static void nomor1(Integer[] arry, int d) {
        System.out.println(d + "   >>>>> ");
        Tree<Integer> tree = new Tree<>();
        for (Integer n : arry) {
            tree.add(n);
        }

        System.out.println(
            TreeDrawer.printTree(tree.getRoot(), tree.getDepth())
        );

        tree.delete(new TNode<Integer>(d));
        
        System.out.println(
            TreeDrawer.printTree(tree.getRoot(), tree.getDepth())
        );
    }
}
