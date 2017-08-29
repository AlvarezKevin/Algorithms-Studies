package DataStructures;

/**
 * Created by Kevin on 6/5/2017.
 */
public class LinkNode<T extends Comparable> {

    public T value;

    public LinkNode next;

    public LinkNode(T value) {
        this.value = value;
    }

    public String toString() {
        return value.toString();
    }
}
