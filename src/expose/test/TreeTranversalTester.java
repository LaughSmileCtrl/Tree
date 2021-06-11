package expose.test;

import expose.TNode;
import expose.TreeDrawer;
import expose.TreeTranversal;

public class TreeTranversalTester {
    public static void main(String[] args) {
        tryAritmathic();
    }

    public static void tryAritmathic() {
        TNode<Character> tNodeA = new TNode<>('A',null, null);
        TNode<Character> tNodeB = new TNode<>('B',null, null);
        TNode<Character> tNodeStar = new TNode<>('*', tNodeA, tNodeB);
        TNode<Character> tNodeC = new TNode<>('C',null, null);
        TNode<Character> tNodeD = new TNode<>('D',null, null);
        TNode<Character> tNodePow = new TNode<>('^', tNodeC, tNodeD);
        TNode<Character> tNodeMin = new TNode<>('-', tNodeStar, tNodePow);
        TNode<Character> tNodeE = new TNode<>('E',null, null);
        TNode<Character> tNodeF = new TNode<>('F',null, null);
        TNode<Character> tNodeSlash = new TNode<>('/', tNodeE, tNodeF);
        TNode<Character> tNodePlus = new TNode<>('+',tNodeMin, tNodeSlash);
        System.out.println(TreeDrawer.printTree(tNodePlus, 4));
        System.out.println("preorder : " + TreeTranversal.preorder(tNodePlus));
        System.out.println("inorder : " + TreeTranversal.inorder(tNodePlus));
        System.out.println("postorder : " + TreeTranversal.postorder(tNodePlus));
    }


}
