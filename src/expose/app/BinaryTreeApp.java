package expose.app;

import expose.Tree;
import expose.TNode;
import expose.TreeDrawer;
import expose.TreeTranversal;

public class BinaryTreeApp {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        Integer[] arry = {10,5,20,2,6,19,25,21};
        for (Integer n : arry) {
            tree.add(n);
        }

        System.out.println(
            TreeDrawer.printTree(tree.getRoot(), tree.getDepth())
        );

        System.out.println(
            TreeTranversal.postorder(tree.getRoot())
        );

        TNode<Integer> node19 = new TNode<>(19);
        if(tree.isExist(node19)) {
            TNode<Integer> current = tree.findNode(node19);
            System.out.println("data : " + current.data);
            System.out.println("left.data : " + current.left);
            System.out.println("right.data : " + current.right);
        }

        TNode<Integer> node55 = new TNode<>(55);
        if(tree.isExist(node55)) {
            TNode<Integer> current = tree.findNode(node55);
            System.out.println("data : " + current.data);
            System.out.println("left.data : " + current.left);
            System.out.println("right.data : " + current.right);
        }

        tree.add(56);

        System.out.println(
            TreeDrawer.printTree(tree.getRoot(), tree.getDepth())
        );

        System.out.println("getMinValue : " + tree.getMinValue());
        System.out.println("getMaxValue : " + tree.getMaxValue());



    }
}
