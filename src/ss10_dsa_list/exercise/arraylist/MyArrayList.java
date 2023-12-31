package ss10_dsa_list.exercise.arraylist;


import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyArrayList(){
        System.out.println("Khởi tạo thành công MyArrayList có kích thước là: ");
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int capacity){
        if (capacity > 0){
            System.out.println("Khởi tạo thành công với kích thước là: " +capacity);
            elements = new Object[capacity];
        }else {
            System.out.println("Lỗi thông báo với tham số truyền vào.");
            throw new IllegalArgumentException("capacity: "+ capacity);
        }
    }
    //thêm 1 phần tử
    public boolean add(E element){
        if (elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }
    public void add(E element, int index){
        if (index > elements.length){
            throw new IllegalArgumentException("index: " + index);
        }else if (elements.length ==size){
            this.ensureCapacity(5);
        }

        if (elements[index] == null){
            elements[index] = element;
            size++;
        }else {
            for (int i = size + 1; i >= index; i--){
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }
    //phuong thuc tang kich thuoc cua mylist
    public void ensureCapacity(int minCapacity){
        if (minCapacity >=0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements,newSize);
            System.out.println("Khởi tạo thành công với kích thước là: " + elements.length);

        }else {
            throw new IllegalArgumentException("minCapacity: "+minCapacity);
        }
    }
    //phương thức trả về số luượng phần tử
    public int size(){
        return this.size;
    }
    //phương thức clear 1 arraylist
    public void clear(){
        size = 0;
        for (int i = 0; i< elements.length; i++){
            elements[i] = null;
        }
    }
    //phương thức lấy 1 element tại vị trí index
    public E get(int index){
        return (E) elements[index];
    }
    public int indexOf(E element){
        int index = -1;
        for (int i=0; i <size;i++){
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }
    // phương thức kiểm tra 1 phần tử có tại trong mảng hay không
    public boolean contains(E element){
        return indexOf(element) >= 0;
    }

    //Phương thức tạo ra 1 bản sao của MyArrayList
    public MyArrayList<E> clone(){
        MyArrayList<E> obj = new MyArrayList<>();
        obj.elements = Arrays.copyOf(this.elements, this.size);
        obj.size = this.size;
        return obj;
    }
    //Phương thức xoá phần tử tại vị trí index
    public E remove(int index){
        if (index < 0 || index > elements.length){
            throw new IllegalArgumentException("index: "+index);
        }
        E element = (E) elements[index];
        for (int i=index; i< size - 1; i++){
            this.elements[i] = this.elements[i+1];
        }
        this.elements[size-1] = null;
        size--;
        return element;
    }




}
