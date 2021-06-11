package expose;

public class TreeTranversal {
    public static String preorder(TNode root) {
        StringBuilder str = new StringBuilder();
        preorderRunning(root, str);
        return str.toString();
    }

    private static void preorderRunning (TNode current, StringBuilder str) {
        if (current != null) {
            str.append(current.toString() + " ");
            preorderRunning(current.left, str);
            preorderRunning(current.right, str);
        }
    }

    public static String inorder(TNode root) {
        StringBuilder str = new StringBuilder();
        inorderRunning(root, str);
        return str.toString();
    }

    private static void inorderRunning (TNode current, StringBuilder str) {
        if (current != null) {
            inorderRunning(current.left, str);
            str.append(current.toString() + " ");
            inorderRunning(current.right, str);
        }
    }

    public static String postorder(TNode root) {
        StringBuilder str = new StringBuilder();
        postorderRunning(root, str);
        return str.toString();
    }

    private static void postorderRunning (TNode current, StringBuilder str) {
        if (current != null) {
            postorderRunning(current.left, str);
            postorderRunning(current.right, str);
            str.append(current.toString() + " ");
        }
    }
}
