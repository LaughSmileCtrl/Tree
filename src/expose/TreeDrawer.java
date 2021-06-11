package expose;

public class TreeDrawer {

    public static String printTree(TNode root, int depth) {
        StringBuilder str = new StringBuilder();
        int prefSpace = 5;
        int level = 1;
        TNode current = root;

        for (int i = 0; i < depth-1; i++) {
            prefSpace *= 2;
            prefSpace++;
        }

        for (int i = 0; i <= depth*2; i++) {
            str.append((i%10) + "\n");
        }

        printElement(str, depth, level, current, prefSpace, " ");
        printElementFinishing(str, depth, level, prefSpace/2);
        return str.toString();
    }

    public static String printTree(Tree tree, int depth) {
        StringBuilder str = new StringBuilder();
        int prefSpace = 5;
        int level = 1;
        TNode current = tree.getRoot();

        for (int i = 0; i < depth-1; i++) {
            prefSpace *= 2;
            prefSpace++;
        }

        for (int i = 0; i <= depth*2; i++) {
            str.append((i%10) + "\n");
        }

        printElement(str, depth, level, current, prefSpace, " ");
        printElementFinishing(str, depth, level, prefSpace/2);
        return str.toString();
    }

    private static void addSpace(String data, StringBuilder str, int level, StringBuilder space) {
        int lastLine = 0;
        for (int i = 0; i < level*2; i++) {
            lastLine = str.indexOf("\n", lastLine+1);
        }

        str.insert(lastLine, space.toString() + data);
    }

    private static void printElement(StringBuilder str, int depth, int level, TNode current, int prefSpace, String flag) {
        if(level <= depth) {
            StringBuilder space = new StringBuilder();
            int lastLine = 0;

            for (int i = 0; i < prefSpace; i++) {
                space.append(" ");
            }

            for (int i = 0; i < level*2-1; i++) {
                lastLine = str.indexOf("\n", lastLine+1);
            }

            if(current != null) {
                str.insert(lastLine, space.toString() + flag);
                addSpace(current.toString(), str, level, space);
                printElement(str, depth, (level+1), current.left, (prefSpace/2), "/");
                printElement(str, depth, (level+1), current.right, (prefSpace/2), "\\");
            } else {
                str.insert(lastLine, space.toString() + " ");
                addSpace(" ", str, level, space);
                printElement(str, depth, (level+1), null, (prefSpace/2), "/");
                printElement(str, depth, (level+1), null, (prefSpace/2), "\\");
            }
        }
    }

    private static void printElementFinishing(StringBuilder str, int depth, int level, int nChar) {
        if(level <= depth) {
            int lastLine = 0;

            for (int i = 0; i < level*2-1; i++) {
                lastLine = str.indexOf("\n", lastLine+1);
            }

            lastLine += 2;
            str.delete(lastLine, lastLine+nChar+1);

            lastLine = 0;
            for (int i = 0; i < level*2; i++) {
                lastLine = str.indexOf("\n", lastLine+1);
            }

            lastLine += 3;
            str.delete(lastLine, lastLine+(nChar/2)+1);
            printElementFinishing(str, depth, level+1, nChar/2);
        }
    }
}
