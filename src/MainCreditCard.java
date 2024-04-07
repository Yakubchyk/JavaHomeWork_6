import java.util.Scanner;

public class MainCreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard creditCard = new CreditCard();
        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard();

        System.out.print("Введите номер для карты 1: ");
        creditCard.setNumberCard(scanner.nextInt());
        System.out.print("Введите баланс для карты 1: ");
        creditCard.setBalance(scanner.nextDouble());

        System.out.print("Введите номер для карты 2: ");
        creditCard1.setNumberCard(scanner.nextInt());
        System.out.print("Введите баланс для карты 2: ");
        creditCard1.setBalance(scanner.nextDouble());

        System.out.print("Введите номер для карты 3: ");
        creditCard2.setNumberCard(scanner.nextInt());
        System.out.print("Введите баланс для карты 3: ");
        creditCard2.setBalance(scanner.nextDouble());

        int card;

        while (true) {
            System.out.print(" Какую карту вы будете использовать? 1, 2, или 3 :");
            card = scanner.nextInt();
            switch (card) {
                case 1:
                    operationCard(scanner, creditCard);
                    break;
                case 2:
                    operationCard(scanner, creditCard1);
                    break;
                case 3:
                    operationCard(scanner, creditCard2);
                    break;
                default:
                    System.out.println("Неверный выбор карты.");
                    break;
            }
        }
    }

    // по сути тоже можно в отдельный файл.
    // без статического метода не работает моя программка.
    public static void operationCard(Scanner scanner, CreditCard creditCard) {
        System.out.println("\nМеню:");
        System.out.println("1. Информация о карте");
        System.out.println("2. Внести деньги");
        System.out.println("3. Снять деньги");
        System.out.println("4. Выход");
        System.out.print("Выберите действие: ");
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Номер карты: " + creditCard.NumberCard);
                creditCard.setBalance(creditCard.Balance);
                break;
            case 2:
                System.out.print("Укажите сумму, которую хотите внести на карту: ");
                double inDerCatd = scanner.nextDouble();
                creditCard.PlusBalance(inDerCatd);
                break;

            case 3:
                System.out.print("Введите сумму для снятия: ");
                double vonDerCard = scanner.nextDouble();
                creditCard.MinusBalans(vonDerCard);
                break;

            case 4:
                System.out.println("До свидания!");
                System.exit(0); //из книги с примера срисовал. Сам до конца не врубаюсь зачем она нужна,
                break;                // но без этой стор.ексит не работает. точнее, по кругу гоняет цикл.
            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите существующий пункт меню.");
        }
    }
}