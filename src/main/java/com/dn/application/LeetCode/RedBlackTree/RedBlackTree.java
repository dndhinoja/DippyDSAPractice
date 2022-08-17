package com.dn.application.LeetCode.RedBlackTree;

    public class RedBlackTree extends BaseBinaryTree {

        static final boolean RED = false;
        static final boolean BLACK = true;

        //@Override
        public Node searchNode(int key) {
            Node node = root;
            while (node != null) {
                if (key == node.data) {
                    return node;
                } else if (key < node.data) {
                    node = node.left;
                } else {
                    node = node.right;
                }
            }

            return null;
        }

        // -- Insertion ----------------------------------------------------------------------------------

        //@Override
        public void insertNode(int key) {
            Node node = root;
            Node parent = null;

            // Traverse the tree to the left or right depending on the key
            while (node != null) {
                parent = node;
                if (key < node.data) {
                    node = node.left;
                } else if (key > node.data) {
                    node = node.right;
                } else {
                    throw new IllegalArgumentException("BST already contains a node with key " + key);
                }
            }

            // Insert new node
            Node newNode = new Node(key);
            newNode.color = RED;
            if (parent == null) {
                root = newNode;
            } else if (key < parent.data) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
            newNode.parent = parent;

            //fixRedBlackPropertiesAfterInsert(newNode);
        }

        public static void main(String[] args) {

    }
}
