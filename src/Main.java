import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводи 1 число, kurwa: ");
        int num1 = scanner.nextInt();

        System.out.println("Вводи 2 число, kurwa: ");
        int num2 = scanner.nextInt();

        int res;

        System.out.println("Что считаем, kurwa: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res + "Kurwa! ");
                break;

            case "-":
                res = num1 - num2;
                System.out.println("На: " + res);
                break;

            case "*":
                res = num1 - num2;
                System.out.println("От оно:" + res);
                break;

            case "/":
                if (num2 == 0)
                    System.out.println("Мать свою на 0 дели");
                else {
                    res = num1 / num2;
                    System.out.println("Поделили, kurwa: " + res);
                }
                break;
            default:
                System.out.println("нормально себя веди, kurwa: ");
        }
    }}



