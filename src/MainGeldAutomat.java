import java.util.Scanner;

public class MainGeldAutomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Внесите купюры по 20р. : ");
        int bank20 = scanner.nextInt();
        System.out.print("Внесите купюры по 50р. : ");
        int bank50 = scanner.nextInt();
        System.out.print("Внесите купюры по 100р. : ");
        int bank100 = scanner.nextInt();

        GeldAutomat geldAutomat = new GeldAutomat(0, 0, 0);

        geldAutomat.AddMoney(bank20, bank50, bank100);
        geldAutomat.Balance();

        System.out.println(" ");
        System.out.print("Введите сумму для снятия денег:   ");
        geldAutomat.OutMoney(scanner.nextInt());

    }
}
