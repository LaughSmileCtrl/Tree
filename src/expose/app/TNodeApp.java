package expose.app;

import expose.TNode;
import expose.TreeDrawer;

public class TNodeApp {
    
    public static void main(String[] args) {
        case3();
    }

    public static void case1() {
        TNode<Character> tNodeG = new TNode('G', null, null);
        TNode<Character> tNodeH = new TNode('H', null, null);
        TNode<Character> tNodeJ = new TNode('J', null, null);
        TNode<Character> tNodeD = new TNode('D', null, null);
        TNode<Character> tNodeE = new TNode('E', tNodeG, null);
        TNode<Character> tNodeF = new TNode('F', tNodeH, tNodeJ);
        TNode<Character> tNodeB = new TNode('B', tNodeD, tNodeE);
        TNode<Character> tNodeC = new TNode('C', null, tNodeF);
        TNode<Character> tNodeA = new TNode('A', tNodeB, tNodeC);
        System.out.println(TreeDrawer.printTree(tNodeA, 4));
    }

    public static void case2() {
        TNode<Character> tNodeG = new TNode('G', null, null);
        TNode<Character> tNodeH = new TNode('H', null, null);
        TNode<Character> tNodeI = new TNode('I', null, null);
        TNode<Character> tNodeD = new TNode('D', null, tNodeG);
        TNode<Character> tNodeE = new TNode('E', tNodeH, tNodeI);
        TNode<Character> tNodeF = new TNode('F', null, null);
        TNode<Character> tNodeB = new TNode('B', tNodeD, null);
        TNode<Character> tNodeC = new TNode('C', tNodeE, tNodeF);
        TNode<Character> tNodeA = new TNode('A', tNodeB, tNodeC);
        System.out.println(TreeDrawer.printTree(tNodeA, 4));
        
    }

    public static void case3() {
        TNode<Character> tNodec = new TNode('c', null, null);
        TNode<Character> tNoded = new TNode('d', null, null);
        TNode<Character> tNodea = new TNode('a', null, null);
        TNode<Character> tNodeb = new TNode('b', null, null);
        TNode<Character> tNodemin = new TNode('-', tNodec, tNoded);
        TNode<Character> tNodee = new TNode('e', null, null);
        TNode<Character> tNodestar = new TNode('*', tNodea, tNodeb);
        TNode<Character> tNodeslash = new TNode('/', tNodemin, tNodee);
        TNode<Character> tNodeplus = new TNode('+', tNodestar, tNodeslash);
        System.out.println(TreeDrawer.printTree(tNodeplus, 4));
    }
}
