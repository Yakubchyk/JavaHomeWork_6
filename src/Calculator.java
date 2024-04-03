public class Calculator {
    // поля
    int weight, color;
    String cost;

    // мутоды
    int sum(int x, int y) {
        return x + y;
    }

    int sub(int x, int y) {
        return x - y;
    }

    int mult(int x, int y) {
        return x * y;
    }

    double dev(double x, double y) {
        return x / y;
    }

    // конструктор
    public Calculator(int weight, int color, String cost) {
        this.weight = weight;
        this.color = color;
        this.cost = cost;
    }
}

