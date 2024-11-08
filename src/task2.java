import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("оцените работу нашего приложения от 1 до 5!");
            int evaluation = sc.nextInt();
            if (evaluation == 1) {
                System.out.println("очень жаль,что вы недовольны.пожалуйста,обратитесь в поддержку с жалобами,мы обязательно всё исправим.стараемся становиться лучше для вас!");
                break;
            } else if (evaluation == 2) {
                System.out.println("наша команда учтёт вашу оценку и пострарается исправить недочёты,спасибо!");
                break;
            } else if (evaluation == 3) {
                System.out.println("видимо,вам что-то не нравится в нашем приложении.пожалуйста,обратитесь в поддержку с советами о том,что можно улучшить!");
                break;
            } else if (evaluation == 4) {
                System.out.println("спасибо за вашу оценку!видимо в нашем приложении есть недочёты");
                break;
            } else if (evaluation == 5) {
                System.out.println("рады стараться!");
                break;
            } else {
                System.out.println("это не 1-5");
                continue;
            }
        }
    }
}
