import Controller.WiseSayingController;

import java.util.Scanner;

/*
스스로 구현해보기
 */
public class App {

    private final Scanner sc;
    private final WiseSayingController wiseSayingController;

    public App(Scanner sc) {
        this.sc = sc;
        wiseSayingController = new WiseSayingController(sc);
    }

    public void run() {
        System.out.println("== 명언 SSG ==");

        outer:
        while(true){
            System.out.print("명령 ) ");

            switch(sc.nextLine().trim()){
                case "등록":
                    wiseSayingController.save();
                    break;
                case "목록":
                    wiseSayingController.findAll();
                    break;
                case "종료":
                    break outer;
            }
        }
    }
}
