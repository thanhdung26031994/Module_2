package ss09_DSA.example.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> mylist1 = new ArrayList<>();
//      add(): thêm phần tử
        mylist1.add("a");
        mylist1.add("b");
        mylist1.add("c");
//      size(): tổng số phần tử của tập hợp
        System.out.println(mylist1.size());
//      addAll(): thêm các phần tử từ collection có sẳn
        List<String> mylist2 = new ArrayList<>();
        mylist2.add("d");
        mylist2.add("f");
        mylist1.addAll(mylist2);
//      get(): lấy giá trị phần tử theo index
        System.out.println(mylist1.get(0));
//      set(): cập nhật lại giá trị của phần tử
        mylist1.set(0, "new element");
//      indexOf(): trả về index của phần tử cần tìm
        System.out.println("vị trị:  "+mylist1.indexOf("b"));
//      LastIndexOf(): trả về index cuối cùng của phần tử cần tìm
        mylist1.add("b");
        System.out.println(mylist1.lastIndexOf("b"));
//      remove(): xoá phần tử khỏi danh sách
        mylist1.remove(2);
//      clear(): xoá toàn bộ phần tử trong tập hợp
//        mylist1.clear();
//      contains(): kiểm tra xem phần tử cần tìm có trong tập hợp hay không
//        trả về kết quả boolean
        System.out.println(mylist1.contains("z"));
//      subList(): tạo tập hợp mới từ tập hợp cho trước
        List<String> newList = mylist1.subList(1, 3);
//      toArray(): chuyển tập hợp ArrayList thành tập hợp Array
        mylist1.toArray();
//      asList(): chuyển Array thành ArrayList
        System.out.println("-----------------------");
        for (String element: mylist1){
            System.out.print(element+"\t");
        }
        System.out.println();
        System.out.println("-----------------------");
        for (String element: newList){
            System.out.print(element+"\t");
        }
    }
}
