package mission.view;

import mission.controller.Register_user;

import java.util.Scanner;

public class Register_menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main() {
        view_register_menu();
    }

    public static void view_register_menu() {
        System.out.println("이름을 입력해주세요.");
        String name = scanner.nextLine();
        System.out.println("전화번호를 입력해주세요. (ex. 010-1234-1234)");
        String phone = scanner.nextLine();

        Register_user.register_user(name, phone);
  }
}