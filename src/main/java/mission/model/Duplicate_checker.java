package mission.model;

import mission.model.User_model;

import java.util.*;

public class Duplicate_checker {
    public static List<String> get_users_with_duplicate_coupons(String coupon_number) {
        List<String> duplicate_users = new ArrayList<>();

        List<User_model.User_data> users = User_model.user_database.get(coupon_number);
        for (User_model.User_data user : users) {
            duplicate_users.add(user.name);
        }
        return duplicate_users;
    }
}
