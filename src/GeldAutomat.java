public class GeldAutomat {

    int Naml20;
    int Naml50;
    int Naml100;

    public GeldAutomat(int naml20, int naml50, int naml100) {
        this.Naml20 = naml20;
        this.Naml50 = naml50;
        this.Naml100 = naml100;
    }

    public void Balance() {
        System.out.println("В банкомате сейчас: ");
        System.out.println("Банкноты по 20р. : " + Naml20 + " шт.");
        System.out.println("Банкноты по 50р. : " + Naml50 + " шт.");
        System.out.println("Банкноты по 100р. : " + Naml100 + " шт.");

    }

    void AddMoney(int naml20, int naml50, int naml100) {
        Naml20 += naml20;
        Naml50 += naml50;
        Naml100 += naml100;
        System.out.println("Деньги внесены в банкомат.");
    }

    public void OutMoney(int sumUser) {
        int c100 = 0;
        int c50 = 0;
        int c20 = 0;

        while (sumUser >= 100 && Naml100 > 0) {
            sumUser -= 100;
            Naml100--;
            c100++;
        }

        if (sumUser == 0) {
            System.out.println("Все прошло успешно.");
            System.out.println("Выплачено: 100р - " + c100);
            return;
        }

        while (sumUser >= 50 && Naml50 > 0) {
            sumUser -= 50;
            Naml50--;
            c50++;
        }

        while (sumUser >= 20 && sumUser % 20 == 0 && Naml20 > 0) {
            sumUser -= 20;
            Naml20--;
            c20++;
        }

        if (sumUser == 0) {
            System.out.println("Все прошло успешно.");
            System.out.println("Выплачено: ");
            System.out.println("100р - " + c100 + " шт.");
            System.out.println("50р - " + c50 + " шт.");
            System.out.println("20р - " + c20 + " шт.");
            System.out.println(" ");
            Balance();
        } else {
            System.out.println("Невозможно выдать указанную сумму. Нет денег! ");
        }
    }
}
