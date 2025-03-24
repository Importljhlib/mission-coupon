package mission.controller;

import mission.model.User_model;

public class Register_user {
    public static void register_user(String name, String phone) {
        User_model.save_user_data(name, phone);
    }
}
