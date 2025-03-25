package mission.model;

import mission.view.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class User_model {
    //public static ArrayList<User_data> user_database =new ArrayList<>();
    public static Map<String,List<User_data>> user_database =new HashMap<>();

    public static class User_data{
        public String name;
        String phone;
        String coupon_number;
        public int coupon_count;

        public User_data(String name, String phone) {
            this.name = name;
            this.phone = phone;
            this.coupon_number = phone.substring(phone.length()-4);
            this.coupon_count = 0;
        }
    }

    public static void save_user_data(String name, String phone) {
        String coupon_number = phone.substring(phone.length()-4);
        User_data new_user = new User_data(name, phone);

        user_database.computeIfAbsent(coupon_number, k -> new ArrayList<>()).add(new_user);
        System.out.println("회원 정보가 저장되었습니다.");
        Menu.main();
    }
}

