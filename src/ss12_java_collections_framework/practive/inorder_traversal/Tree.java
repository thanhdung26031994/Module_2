package ss12_java_collections_framework.practive.inorder_traversal;

public interface Tree<E> {
    //Chèn phần tử e vào cây tìm kiếm nhị phân.
    //Trả về true nếu phần tử được chèn thành công.
    boolean insert(E e);

    //Duyệt theo thứ tự từ gốc
    void inorder();

    //Lấy số nút trong cây
    int getSize();
}
