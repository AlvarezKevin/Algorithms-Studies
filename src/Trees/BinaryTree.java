package Trees;

/**
 * Created by Kevin on 6/4/2017.
 */
class Node<T extends Comparable> {
    T key;
    String name;
    Node left;
    Node right;


    Node(T key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString() {
        return name + " has a key of: " + key;
    }
}

//Second Implementation of BST
public class BinaryTree<T extends Comparable> {
    Node root;

    public void addRoot(T key, String name) {
        Node newNode = new Node(key, name);

        if (root == null) {
            root = newNode;
        } else {
            Node tempNode = root;
            Node parent;

            while(true) {
                parent = tempNode;

                if(key.compareTo(parent.key) < 0) {
                    tempNode = tempNode.left;

                    if(tempNode == null) {
                        parent.left = newNode;
                        return;
                    }
                }else {
                    tempNode = tempNode.right;

                    if(tempNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    /*---------IN ORDER TRAVERSAL--------------------
        Left to Right
        Input root goes down all the way through left path
        Prints that node then right node if available
        Then Goes down right and if left node available goes down left nodes

                    4
                   /  \----
                  2        6
                 / \     /  \
                1   3   5    7
        ===================================
        Order of Traversal ^^^^^
     */
    public void inOrderTraverseTree(Node focusNode) {
        if(focusNode != null) {
            inOrderTraverseTree(focusNode.left);
            System.out.println(focusNode.toString());

            inOrderTraverseTree(focusNode.right);
        }
    }

    /*
        ---------PRE ORDER TRAVERSAL--------------------
        Depth-First-Search DFS

        Starts at top and goes down left till null
        Then goes up parent and goes down right if not null
        Once left side is done, Repeats same procedure on the right side of the tree

                     1
                   /  \----
                  2        7
                 / \     /  \
                3   6   8    9
               / \
              4   5
        ===================================
        Order of Traversal ^^^^^
     */
    public void preOrderTraverseTree(Node focusNode) {
        if(focusNode != null) {
            System.out.println(focusNode.toString());
            preOrderTraverseTree(focusNode.left);

            preOrderTraverseTree(focusNode.right);
        }
    }

    public void postOrderTraverseTree(Node focusNode) {
        if(focusNode != null) {
            postOrderTraverseTree(focusNode.left);

            postOrderTraverseTree(focusNode.right);

            System.out.println(focusNode.toString());
        }
    }

    public Node findNode(T key) {
        Node focusNode = root;

        while(focusNode.key != key) {
            if(key.compareTo(focusNode.key) < 0) {
                focusNode = focusNode.left;
            }else {
                focusNode = focusNode.right;
            }

            if(focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.addRoot(50,"Boss");
        tree.addRoot(25,"Vice Pres");
        tree.addRoot(15,"Office Manager");
        tree.addRoot(30,"Secretary");
        tree.addRoot(85,"Sales Manager");
        tree.addRoot(80,"Sales Manager 2");
        tree.addRoot(95,"Salesman 1");

        System.out.println("InOrder Traversal");

        tree.inOrderTraverseTree(tree.root);

        System.out.println("\n===============================================\nPre Order Traversal");

        tree.preOrderTraverseTree(tree.root);

        System.out.println("\n===============================================\nPost Order Traversal");

        tree.postOrderTraverseTree(tree.root);

        System.out.println("\n===============================================\nSearching for 30");
        System.out.println(tree.findNode(30));
    }
}

