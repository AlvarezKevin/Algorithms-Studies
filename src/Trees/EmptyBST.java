package Trees;

/**
 * Created by Kevin on 6/3/2017.
 */
public class EmptyBST<D extends Comparable> implements Tree<D>{

    public EmptyBST() {

    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(D elt) {
        return false;
    }

    @Override
    public NonEmptyBST<D> add(D elt) {
        return new NonEmptyBST<D>(elt);
    }
}
