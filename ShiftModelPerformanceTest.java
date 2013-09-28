import java.util.Random;

/**
 * Класс, проверяющий производительность сравнения в модели со сдвигом
 *
 * @author Zoth
 * @since 28.09.13
 */
public class ShiftModelPerformanceTest {
    public static void main(String[] args) {
        worst();
        average();
        best();
    }

    private static void best() {
        ShiftModel a = new ShiftModel(0);
        ShiftModel b = new ShiftModel(-1);
        ShiftModel.compare(a, b);
        System.out.print("Лучшая производительность алгоритма: " + ShiftModel.counter);
    }

    private static void worst() {
        ShiftModel a = new ShiftModel(0);
        ShiftModel.compare(a, a);
        System.out.println("Худшая производительность алгоритма: " + ShiftModel.counter);
    }

    private static void average() {
        double result = 0;
        int exp = 100000;
        for (int i = 0; i < exp; i++) {
            Random random = new Random();
            ShiftModel a = new ShiftModel(random);
            ShiftModel b = new ShiftModel(random);
            ShiftModel.compare(a, b);
            //System.out.println(ShiftModel.counter);
            result += ShiftModel.counter;
        }
        System.out.println("Средняя производительность алгоритма: " + result / exp);
    }
}
