package mission.controller;

import mission.view.Register_menu;

import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    public static void excute_function(int choice) {
        switch (choice){
            case 1:
                Register_menu.main();
        }
    }
}
