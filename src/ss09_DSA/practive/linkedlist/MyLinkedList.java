package ss09_DSA.practive.linkedlist;

public class MyLinkedList {
    private Node head;
    private int numNodes;
    public MyLinkedList(Object date){
        head = new Node(date);
        numNodes++;
    }
    private class Node {
        private Node next;
        private Object date;
        public Node(Object date) {
            this.date = date;
        }
        public Object getDate(){
            return this.date;
        }
    }
    // thêm đối tượng vào vị trí thứ index trong danh sách
    public void add(int index, Object date){
        Node temp = head;
        Node holder;
        for (int i=0; i< index-1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(date);
        temp.next.next=holder;
        numNodes++;
    }
    // thêm đối tuợng vào vị trí đầu tiên trong danh sách
    public void addFirst(Object date){
        Node temp = head;
        head = new Node(date);
        head.next = temp;
        numNodes++;
    }
    //lấy phần tử ở vị trí index từ danh sách
    public Node get(int index){
        Node temp = head;
        for (int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }
    //hiển thị danh sách các phần tử của danh sách
    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.date);
            temp = temp.next;
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", numNodes=" + numNodes +
                '}';
    }
}
