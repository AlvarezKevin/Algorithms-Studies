package Trees;

import java.util.Queue;

/**
 * Created by Kevin on 6/3/2017.
 */
public class NonEmptyBST<D extends Comparable> implements Tree<D> {
    D data;
    Tree<D> left;
    Tree<D>  right;

    public NonEmptyBST(D elt) {
        data = elt;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }

    public NonEmptyBST(D elt, Tree<D> left, Tree<D> right) {
        data = elt;
        this.left = left;
        this.right = right;

    }
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
       return 1 + left.cardinality() + right.cardinality();
    }

    @Override
    public boolean member(D elt) {
        if (data == elt) {
            return true;
        }else {
            if(elt.compareTo(data) < 0) {
                return left.member(elt);
            }else {
                return right.member(elt);
            }
        }
    }

    @Override
    public NonEmptyBST<D> add(D elt) {
        if(data == elt) {
            return this;
        }else {
            if(elt.compareTo(data) < 0) {
                return new NonEmptyBST<D>(data,left.add(elt),right);
            }else {
                return new NonEmptyBST<D>(data,left,right.add(elt));
            }
        }
    }
}
