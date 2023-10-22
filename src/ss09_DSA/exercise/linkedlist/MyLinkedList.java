package ss09_DSA.exercise.linkedlist;

public class MyLinkedList<E> {
    public class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return data;
        }
    }
    private Node head;
    private int numNodes;
    public MyLinkedList(){}

    public void addFirst(E element){
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element){
        Node temp = head;
        Node holder;
        for (int i=0; i< index - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
    public Object get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.next;
    }
    public int size(){
        return this.numNodes;
    }
    public E remove(int index){
        if (index < 0 || index > numNodes){
            throw new IllegalArgumentException("Index: " + index);
        }
        Node temp = head;
        Object data;
        if (index == 0){
            data = temp.data;
            head = head.next;
            numNodes--;
        }else {
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }
    public boolean remove(E element){
        if (head.data.equals(element)){
            remove(0);
            return true;
        }else {
            Node temp = head;
            while (temp.next != null){
                if (temp.next.data.equals(element)){
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public MyLinkedList<E> clone(){
        if (numNodes == 0){
            throw new NullPointerException("LinkedList Null");
        }
        Node temp =head;
        MyLinkedList<E> returnMyLinkedList = new MyLinkedList<>();
        returnMyLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null){
            returnMyLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnMyLinkedList;
    }

    public boolean contains(E element){
        return indexOf(element) >=0;
    }
    public int indexOf(E element){
        Node temp = head;
        for (int i = 0; i < numNodes; i++){
            if (temp.data.equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    public void clear(){
        Node temp = head;
        head =null;
        while (temp.next != null){
            temp.next = null;
        }
        numNodes = 0;

    }

}
