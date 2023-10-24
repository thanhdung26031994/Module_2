package ss12_java_collections_framework.practive.inorder_traversal;

import ss10_dsa_list.exercise.linkedlist.MyLinkedList;

public class BST <E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size;

    public BST(){}

    public BST(E[] object){
        for (int i = 0; i < object.length; i++) {
            insert(object[i]);
        }
    }

    public boolean insert(E e) {
        if (root == null){
            root = createNewNode(e);
        }else {
            /*xác định vị trí nút cha*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Nút trùng lặp không được chèn vào*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    private TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    public int getSize() {
        return size;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
