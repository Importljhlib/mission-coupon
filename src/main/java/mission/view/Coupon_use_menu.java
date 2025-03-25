package mission.view;

import mission.controller.Get_user;
import java.util.Scanner;

public class Coupon_use_menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void coupon_use_menu(String name, String coupon_number) {
        System.out.println("사용할 쿠폰 개수를 입력해주세요.");
        int save_num = scanner.nextInt();
        Get_user.use_coupon(name, coupon_number, save_num);
    }
}
