package expose;

public class Tree<T extends Comparable> {
    private TNode<T> root;

    private int depth;

    public boolean isEmpty() {
        return (root == null);
    }

    public boolean add(T item) {
        TNode<T> tNode = new TNode<>(item);
        TNode<T> current = root;
        TNode<T> parent = null;
        int tmpDepth = 1;

        while (current != null) {
            parent = current;
            if (tNode.data == current.data) {
                return false;
            } else if (tNode.compareTo(current) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
            tmpDepth++;
        }

        if (parent == null) {
            root = tNode;
        } else if (tNode.compareTo(parent) < 0) {
            parent.left = tNode;
        } else {
            parent.right = tNode;
        }

        depth = (tmpDepth > depth) ? tmpDepth : depth;

        return true;
    }

    public boolean add(TNode<T> tNode) {
        TNode<T> current = root;
        TNode<T> parent = null;
        int tmpDepth = 1;

        while (current != null) {
            parent = current;
            if (tNode.data == current.data) {
                return false;
            } else if (tNode.compareTo(current) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
            tmpDepth++;
        }

        if (parent == null) {
            root = tNode;
        } else if (tNode.compareTo(parent) < 0) {
            parent.left = tNode;
        } else {
            parent.right = tNode;
        }

        depth = (tmpDepth > depth) ? tmpDepth : depth;

        return true;
    }

    public boolean delete(TNode<T> tNode) {
        if (isExist(tNode)) {
            TNode<T> current = root;
            TNode<T> parent = null;
            TNode<T> tmpNode = null;

            while (current != null) {
                int compareResult = tNode.compareTo(current);
                if (compareResult == 0) {
                    break;
                }

                parent = current;
                if (compareResult < 0) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }

            while (current.left != null) {
                parent = current;
                current.data = current.left.data;
                current = current.left;
            }
            tmpNode = current.right;
            current.right = null;

            
            if (parent.left == current) {
                parent.left = null;
            } else {
                parent.right = null;
            }
            
            if(tmpNode != null) {
                add(tmpNode);
            }

            return true;
        }

        return false;
    }

    public TNode<T> findNode(TNode<T> tNode) {
        TNode<T> current = root;

        while (current != null) {
            int compareResult = tNode.compareTo(current);
            if (compareResult == 0) {
                return current;
            } else if (compareResult < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return null;
    }

    public boolean isExist(TNode<T> tNode) {
        return (findNode(tNode) != null);
    }

    public T getMinValue() {
        TNode<T> current = root;
        T minValue = root.data;
        while (current.left != null) {
            current = current.left;
            minValue = current.data;
        }

        return minValue;
    }

    public T getMaxValue() {
        TNode<T> current = root;
        T maxValue = root.data;
        while (current.right != null) {
            current = current.right;
            maxValue = current.data;
        }

        return maxValue;
    }

    public TNode<T> getRoot() {
        return root;
    }

    public int getDepth() {
        return depth;
    }
}
