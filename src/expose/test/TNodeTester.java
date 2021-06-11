package expose.test;

import expose.TNode;
import expose.Tree;
import expose.TreeDrawer;

public class TNodeTester {
    public static void main(String[] args) {

        toStringTesting();
    }

    public static void TNodeTesting() {
        TNode<Integer> tNodeA = new TNode<>(1,null, null);
        TNode<Integer> tNodeB = new TNode<>(2,null, null);
        TNode<Integer> tNodeC = new TNode<>(3, tNodeA, tNodeB);
    }

    public static void toStringTesting() {
        TNode<Integer> tNodeA = new TNode<>(1,null, null);
        TNode<Integer> tNodeB = new TNode<>(2,null, null);
        System.out.println(tNodeA + " " + tNodeB + " : " + tNodeA.compareTo(tNodeB));

        tNodeB = new TNode<>(1);
        System.out.println(tNodeA + " " + tNodeB + " : " + tNodeA.compareTo(tNodeB));
    }



    public static void try9() {
        TNode<Character> tNodeC = new TNode<>('C',null, null);
        TNode<Character> tNodeD = new TNode<>('D',null, null);
        TNode<Character> tNodeA = new TNode<>('A',null, null);
        TNode<Character> tNodeB = new TNode<>('B',null, null);
        TNode<Character> tNodeMin = new TNode<>('-', tNodeC, tNodeD);
        TNode<Character> tNodeE = new TNode<>('E',null, null);
        TNode<Character> tNodeStar = new TNode<>('*', tNodeA, tNodeB);
        TNode<Character> tNodeSlash = new TNode<>('/', tNodeMin, tNodeE);
        TNode<Character> tNodePlus = new TNode<>('+', tNodeStar, tNodeSlash);
        System.out.println(TreeDrawer.printTree(tNodePlus, 4));
    }

}
