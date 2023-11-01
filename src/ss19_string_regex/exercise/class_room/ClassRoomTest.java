package ss19_string_regex.exercise.class_room;

import java.util.Scanner;

public class ClassRoomTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassRoom classRoom = new ClassRoom();
        System.out.println("Nhap ten lop: ");
        String name = scanner.nextLine();

        boolean isValid = classRoom.validate(name);
        System.out.println(isValid);
    }
}
