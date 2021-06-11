package expose;

public class TNode<T extends Comparable> implements Comparable<TNode>{
    public T data;

    public TNode<T> left;

    public TNode<T> right;

    public TNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }

    public TNode(T data, TNode left, TNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }

    @Override
    public int compareTo(TNode o) {
        return this.data.compareTo(o.data);
    }
}
