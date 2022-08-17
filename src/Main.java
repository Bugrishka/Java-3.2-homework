public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int adding = 2000;
        if (adding >= 1001) {
            int bonus = adding / 100;
            int result = balance + adding + bonus;
            System.out.println("Баланс: " + result + " руб. В том числе " + bonus + " бонусных рублей.");
        } else {
            int bonus = 0;
            int result = balance + adding + bonus;
            System.out.println("Баланс: " + result + " руб.");
        }


    }
}
