package Trees;

/**
 * Created by Kevin on 6/3/2017.
 */
public interface Tree<D extends Comparable> {
    boolean isEmpty();
    int cardinality();
    boolean member(D elt);
    NonEmptyBST<D> add(D elt);
}
