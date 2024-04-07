/*
Задача 1:
Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
выводит текущую информацию о карточке. Напишите программу, которая создает три
объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек
 */

public class CreditCard {
    int NumberCard;
    double Balance;

    public CreditCard() {
        this.NumberCard = 0;
        this.Balance = 0;
    }

    void setBalance(double balance) {
        Balance = balance;
        System.out.println("На карте " + NumberCard + " баланс " + balance + "  рублей. ");
    }

    void setNumberCard(int numberCard) {
        this.NumberCard = numberCard;
        System.out.println("Номер карты установлен: " + numberCard);
    }

    void MinusBalans(double minus) {
        if (Balance < minus) {
            System.out.println("Недостаточно средств.");
        } else {
            Balance -= minus;
            System.out.println("С вашей карты " + NumberCard + " списано " + minus + " рублей.");
        }
    }
    void PlusBalance(double plus) {
        Balance += plus;
        System.out.println("Деньги успешно внесены на карту. ");
    }
}
