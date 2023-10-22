package ss10_dsa_list.practive.list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
    //thêm một phần tử vào cuối của danh sách
    //Tham số đầu vào: phần tử cần thêm vào danh sách
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    // tăng gấp đôi kích thước mảng chứa các phần tử
    private void ensureCapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }
    //Phương thức get() trả về phần tử vừa ở vị trí thứ i trong danh sách.
    public E get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index" + i + " , Size " + i);
        }
        return (E) elements[i];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
