package ss03_array.practive;

import java.util.Scanner;

public class StudentsArray {
    public static void main(String[] args) {
        String[] students = {"Dung", "Hai", "Bao", "Giau", "Lam", "Quang"};
        //khai bao tim kiem và gán giá trị vào
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String input_name = input.nextLine();
        //tìm phần tử có tên vừa nhập
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + " is "+i);
                isExist =true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found"+ input_name + " in the list");
        }
    }
}
