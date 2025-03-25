package mission.view;

import mission.controller.Get_user;
import mission.model.Duplicate_checker;

import java.util.Scanner;
import java.util.List;

public class coupon_search_menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main() {
        view_coupon_search_menu();
    }

    public static void view_coupon_search_menu() {
        System.out.println("전화번호 뒤 네자리를 입력해주세요.");
        String coupon_number = scanner.nextLine();
        List<String> names = Get_user.finding_duplicate_coupon(coupon_number);

        if (names.size() == 1){
            not_duplicating(names.get(0), coupon_number);
        }
        else if (names.size() > 1){
            duplicating(names, coupon_number);
        }
        System.out.println(names);
    }

    public static void not_duplicating(String name, String coupon_number) {
        System.out.println(name + " 회원님 맞으신가요? (Y/N)");
        String input = scanner.nextLine();
        int cnt = 0;
        if (input.equalsIgnoreCase("Y")) {
            cnt = Get_user.find_coupon_count(name, coupon_number);
        }
        System.out.println("현재 적립된 쿠폰은 "+cnt+"개 입니다.");
        Menu.main();
    }

    public static void duplicating(List<String> names, String coupon_number) {
        System.out.println("이름을 입력해 주세요? "+names);
        String input = scanner.nextLine();
        int cnt = Get_user.find_coupon_count(input, coupon_number);
        System.out.println("현재 적립된 쿠폰은 "+cnt+"개 입니다.");
        Menu.main();
    }
}
