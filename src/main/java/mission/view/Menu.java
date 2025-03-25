package mission.view;

import java.util.Scanner;

import mission.controller.App;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void view_menu() {
        System.out.println("쿠폰 적립 시스템입니다. 사용할 기능을 선택해주세요");
        System.out.println("1) 회원 등록, 2) 쿠폰 검색, 3) 쿠폰 적립, 4) 쿠폰 사용 5) 프로그램 종료");
    }

    public static int get_menu_number(){
        return scanner.nextInt();
    }

    public static void main() {
        view_menu();
        int n = get_menu_number();
        App.excute_function(n);
        scanner.close();
    }

}
