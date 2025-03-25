package mission.controller;

import mission.model.User_model;
import mission.model.Duplicate_checker;
import mission.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class Get_user {
    public static void register_user(String name, String phone) {
        User_model.save_user_data(name, phone);
    }

    public static List<String> finding_duplicate_coupon(String coupon_number) {
        return Duplicate_checker.get_users_with_duplicate_coupons(coupon_number);
    }

    public static int find_coupon_count(String name, String coupon_number) {
        return User_model.user_database.getOrDefault(coupon_number, new ArrayList<>())
                .stream()
                .filter(user -> user.name.equals(name))
                .map(user -> user.coupon_count)
                .findFirst()
                .orElse(-1);
    }

    public static void save_coupon(String name, String coupon_number, int save_num) {
        User_model.user_database.getOrDefault(coupon_number, new ArrayList<>())
                .stream()
                .filter(user -> user.name.equals(name))
                .findFirst()
                .ifPresent(user -> {
                    user.coupon_count += save_num;
                    System.out.println("쿠폰이 적립되었습니다.");
                    Menu.main();
                });
    }
}
