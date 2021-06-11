package expose.test;

import expose.TNode;
import expose.Tree;
import expose.TreeDrawer;

public class TreeTester {

    private static Tree<Integer> tree = new Tree<>();

    public static void main(String[] args) {

        addTesting();
        System.out.println(TreeDrawer.printTree(tree, tree.getDepth()));
        System.out.println("delete : " + tree.delete(new TNode<Integer>(25)));;
        System.out.println(TreeDrawer.printTree(tree, tree.getDepth()));

    }

    public static void addTesting(){
        int[] arry = {25,10,37,15,30,65,33};
        for (int a: arry) {
            tree.add(a);
        }

        TNode<Integer> tNodeA = new TNode<>(1);
        TNode<Integer> tNodeB = new TNode<>(3);
        TNode<Integer> tNodeC = new TNode<>(2, tNodeA, tNodeB);

        System.out.println(TreeDrawer.printTree(tNodeC, 2));
    }
}
