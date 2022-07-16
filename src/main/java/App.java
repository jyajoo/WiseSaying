import java.util.Scanner;

    /*
    스스로 구현해보기
     */
public class App {

    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 SSG ==");

        outer:
        while(true){
            System.out.print("명령 ) ");

            switch(sc.nextLine().trim()){
                case "종료":
                    break outer;
            }
        }
    }
}
