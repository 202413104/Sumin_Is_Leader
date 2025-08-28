package main;


import java.util.Scanner;

public class App{



    static void showMenu(){

        //기능 : 메뉴 구현

    }


    static void run(){

        //기능: 프로그램 실행
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("운세 게임을 시작합니다! 이름을 입력하세요: ");
        String username = sc.nextLine();
        System.out.println("=============================================");
        System.out.println("보기를 고르세요! ");
        System.out.println(" 1.미용실\n 2. 괴정\n 3. 아샷추\n 4. 고체가글\n 5. 얼박사");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("1: 최고의 하루를 보낼것입니다 \uD83D\uDE0E " + username+"님");
                break;
            case 2:
                System.out.println("2: 최악의 하루가 당신을 기다릴것입니다\uD83D\uDE35 " + username+"님");
                break;
            case 3:
                System.out.println("3: 피곤한 하루가 당신을 기다릴것입니다\uD83E\uDD71 " + username+"님");
                break;
            case 4:
                System.out.println("4: 바쁜 하루가 당신을 기다릴 것입니다⏰"+ username+"님");
                break;
            case 5:
                System.out.println("5: 재밌는 하루가 당신을 기다릴 것입니다\uD83D\uDE06"+ username+"님");
                break;

        }

    }
}
