package ss09_DSA.example.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        /*
        implementtation của Set như sau:
            HashSet
            LinkedHashSet
            TreeSet
            EnumSet
         */
        Set<String> mySet = new HashSet<>();
//        add():thêm phần tử
        mySet.add("element 1");
        mySet.add("element 2");
        mySet.add("element 3");
//        duyệt các phần tử bằng Iterator, forEach
        for (String element: mySet){
            System.out.print(element+"\t");
        }
        System.out.println();
        System.out.println("------------------");
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        addAll(): để thêm các phần tử từ tập hợp khác vào trong Set
        Set<String> mySet2 = new HashSet<>();
        mySet2.add("element 4");
        mySet2.add("element 5");
        mySet.addAll(mySet2);
//        covert Set thành List
//        size(): kiểm tra kích thước của tập hợp
        System.out.println("-------------------");
        System.out.println(mySet.size());
//        isEmpty(): kiểm tra Set có rổng hay không
        System.out.println(mySet.isEmpty());
//        contains(): kiểm tra một phần tử có tồn tại trong Set hay chưa
        System.out.println(mySet.contains("a"));


        System.out.println("---------------------------");
        for (String element: mySet){
            System.out.print(element+"\t");
        }
    }
}
