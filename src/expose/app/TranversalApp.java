package expose.app;

import expose.TNode;
import expose.TreeDrawer;
import expose.TreeTranversal;

public class TranversalApp {
    public static void main(String[] args) {
        case4();
    }

    public static void case1() {
        TNode<Character> tNodeA = new TNode<>('A', null, null);
        TNode<Character> tNodeB = new TNode<>('B', null, null);
        TNode<Character> tNodeC = new TNode<>('C', null, null);
        TNode<Character> tNodeD = new TNode<>('D', null, null);
        TNode<Character> tNodep1 = new TNode<>('+', tNodeA, tNodeB);
        TNode<Character> tNodep2 = new TNode<>('+', tNodeC, tNodeD);
        TNode<Character> tNodem = new TNode<>('-', tNodep1, tNodep2);
        System.out.println(TreeDrawer.printTree(tNodem, 3));
        System.out.println("preorder : " + TreeTranversal.preorder(tNodem));
        System.out.println("inorder : " + TreeTranversal.inorder(tNodem));
        System.out.println("postorder : " + TreeTranversal.postorder(tNodem));
    }

    public static void case2() {
        TNode<Character> tNodeA = new TNode<>('A', null, null);
        TNode<Character> tNodeB = new TNode<>('B', null, null);
        TNode<Character> tNodeC = new TNode<>('C', null, null);
        TNode<Character> tNodeD = new TNode<>('D', null, null);
        TNode<Character> tNodePlus = new TNode<>('+', tNodeA, tNodeB);
        TNode<Character> tNodeMin = new TNode<>('-', tNodeC, tNodeD);
        TNode<Character> tNodeStar = new TNode<>('*', tNodePlus, tNodeMin);
        System.out.println(TreeDrawer.printTree(tNodeStar, 3));
        System.out.println("preorder : " + TreeTranversal.preorder(tNodeStar));
        System.out.println("inorder : " + TreeTranversal.inorder(tNodeStar));
        System.out.println("postorder : " + TreeTranversal.postorder(tNodeStar));
    }

    public static void case3() {
        TNode<Character> tNodeB = new TNode<>('B', null, null);
        TNode<Character> tNodeC = new TNode<>('C', null, null);
        TNode<Character> tNodeMin = new TNode<>('-', tNodeB, tNodeC);
        TNode<Character> tNodeA = new TNode<>('A', null, null);
        TNode<Character> tNodeD = new TNode<>('D', null, null);
        TNode<Character> tNodeE = new TNode<>('E', null, null);
        TNode<Character> tNodeSlash = new TNode<>('/', tNodeMin, tNodeD);
        TNode<Character> tNodeStar = new TNode<>('*', tNodeSlash, tNodeE);
        TNode<Character> tNodePlus = new TNode<>('+', tNodeA, tNodeStar);
        System.out.println(TreeDrawer.printTree(tNodePlus, 5));
        System.out.println("preorder : " + TreeTranversal.preorder(tNodePlus));
        System.out.println("inorder : " + TreeTranversal.inorder(tNodePlus));
        System.out.println("postorder : " + TreeTranversal.postorder(tNodePlus));
        
    }

    public static void case4() {
        TNode<Character> tNodeA = new TNode<>('A', null, null);
        TNode<Character> tNodeB = new TNode<>('B', null, null);
        TNode<Character> tNodeC = new TNode<>('C', null, null);
        TNode<Character> tNodeD = new TNode<>('D', null, null);
        TNode<Character> tNodeE = new TNode<>('E', null, null);
        TNode<Character> tNodeF = new TNode<>('F', null, null);
        TNode<Character> tNodeStar = new TNode<>('*', tNodeA, tNodeB);
        TNode<Character> tNodePow = new TNode<>('^', tNodeC, tNodeD);
        TNode<Character> tNodeSlash = new TNode<>('/', tNodeE, tNodeF);
        TNode<Character> tNodeMin = new TNode<>('-', tNodeStar, tNodePow);
        TNode<Character> tNodePlus = new TNode<>('+', tNodeMin, tNodeSlash);
        System.out.println(TreeDrawer.printTree(tNodePlus, 4));
        System.out.println("preorder : " + TreeTranversal.preorder(tNodePlus));
        System.out.println("inorder : " + TreeTranversal.inorder(tNodePlus));
        System.out.println("postorder : " + TreeTranversal.postorder(tNodePlus));
    }

}
