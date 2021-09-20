public class BST {

    private static boolean found;
    Node deleteNode;

    public static class Node {
        Integer data = null;
        Node right;
        Node left;

    }

    public Node head;

//    public Node insertIntoBinaryRecurrsion(Node node, int value) {
//
//        if (node.data == null || node.left == null || node.right == null) {
//            Node objNode = new Node();
//            node.data = value;
//            node.left = null;
//            node.right = null;
//
//
//        } else if (value < node.data) {
//            node.data = null;
//            node.left = insertIntoBinaryRecurrsion(node, value);
//        } else if (value > node.data) {
//            node.data = null;
//            node.right = insertIntoBinaryRecurrsion(node, value);
//        }
//        return node;
//    }

    public void insert(int value) {
        if (head.data == null) {
            head.data = value;
            Node node = new Node();
        } else if (value < head.data) {
            if (root.left == null) {
                root.data = value;
                return;
            } else insert(root.left, value);

        } else if (value > root.data) {
            if (root.right == null) {
                root.data = value;
                return;
            } else insert(root.right, value);
        }
    }


    public static void printBst(Node node) {
        if (node.left != null) {
            printBst(node.left);
        } else if (node.right != null) {
            printBst(node.right);
        }
        System.out.print(node.data + "   ");
    }


    public static void searchBST(Node node, int value) {
        if (node.data == value) {
            System.out.print(node.data + "Node found\n");
            found = true;
            return;
        }
        if (node.left != null) {
            searchBST(node.left, value);
        } else if (node.right != null) {
            searchBST(node.right, value);
        }
    }

//    public static void predecoessorBST(Node node, int value) {
//
//        if (node.left != null) {
//            if (node.left.data == value) {
//
//
//                searchBST(node.left, value);
//                System.out.print(node.data + "Node parent found\n");
//                found = true;
//
//            }
//
//        } else if (node.right != null) {
//
//            if (node.right.data == value) {
//                searchBST(node.right, value);
//                System.out.print(node.data + "Node parent found\n");
//                found = true;
//
//            }
//
//
//        }
//
//
//        //  public static void delete(Node node, int value) {
//
//    }


    public static void searchPredecessor(Node node, int value) {
//        if (node.data == value) {
//            System.out.print(node.data + "Node found\n");
//            found = true;
//            return;
//        }
        if (node.left != null) {
            System.out.println(node.data);
            if (node.data != value) {
                searchBST(node.left, value);
                System.out.println("found");
                return;
            }

        } else if (node.right != null) {
            if (node.data != value) {
                System.out.println(node.data);
                searchBST(node.right, value);
                System.out.println("found");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Node node = new Node();
        BST bst = new BST();
        bst.insert(node, 5);
        bst.insert(node, 4);
        bst.insert(node, 8);
        bst.insert(node, 3);
        bst.insert(node, 10);
        bst.insert(node, 13);

//        node = bst.insertIntoBinaryRecurrsion(node, 2);
//        node = bst.insertIntoBinaryRecurrsion(node, 3);
//        node = bst.insertIntoBinaryRecurrsion(node, 5);
//        node = bst.insertIntoBinaryRecurrsion(node, 7);
//        node = bst.insertIntoBinaryRecurrsion(node, 9);
        //     searchBST(bst.head, 10);


        searchPredecessor(bst.head, 10);
        if (!found) System.out.println("Not found");

        System.out.println("\nprinting\n");
        printBst(bst.head);


    }


}
