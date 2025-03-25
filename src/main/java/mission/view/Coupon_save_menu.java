package mission.view;

import mission.controller.Get_user;
import java.util.Scanner;

public class Coupon_save_menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void coupon_save_menu(String name, String coupon_number) {
        System.out.println("적립할 쿠폰 개수를 입력해주세요.");
        int save_num = scanner.nextInt();
        Get_user.save_coupon(name, coupon_number, save_num);
    }
}
