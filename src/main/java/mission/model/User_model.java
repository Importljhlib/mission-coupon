package mission.model;

import java.util.HashMap;
import java.util.Map;

public class User_model {
    private static Map<String,User_data> user_database =new HashMap<String,User_data>();

    static class User_data{
        String name;
        String coupon_number;

        public User_data(String name, String coupon_number) {
            this.name = name;
            this.coupon_number = coupon_number;
        }
    }

    public static void save_user_data(String name, String phone) {
        String coupon_number = phone.substring(phone.length()-4);
        user_database.put(phone, new User_data(name, coupon_number));
        System.out.println("회원 정보가 저장되었습니다.");
    }
}
