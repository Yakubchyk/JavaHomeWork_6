/*
Это псевдо калькуляторр. Задание на уроке.
Попробовал самостоятельно.

 */

public class Rechnun {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(20, 50, "Weiß");

        System.out.println(calculator.sub(5, 4));
        System.out.println(calculator.sum(5, 4));
        System.out.println(calculator.mult(5, 4));
        System.out.println(calculator.dev(5, 4));

        System.out.println(calculator.color + " " + calculator.cost + " " + calculator.weight);
    }
}
