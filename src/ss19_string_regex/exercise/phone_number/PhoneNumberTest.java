package ss19_string_regex.exercise.phone_number;

import java.util.Scanner;

public class PhoneNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneNumber phoneNumber = new PhoneNumber();
        System.out.println("Nhap so dien thoai: ");
        String phone = scanner.nextLine();

        boolean isValid = phoneNumber.validate(phone);
        System.out.println(isValid);
    }
}
