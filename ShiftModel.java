import java.util.Random;

/**
 * Модель вычислений со сдвигом
 *
 * @author Zoth
 * @since 28.09.13
 */
public class ShiftModel extends AbstractModel {
    /**
     * Заполняет массив случайным образом
     *
     * @param random Генератор случайных чисел
     */
    public ShiftModel(Random random) {
        super(random);
    }

    /**
     * Создаёт числа в модели со сдвигом
     *
     * @param i Число
     *
     * @throws IllegalArgumentException, если число не -1, 0 или 1
     *                                   //TODO: Сделать, чтобы можно было создавать любые числа
     */
    public ShiftModel(int i) {
        switch (i) {
            case -1:
                for (int j = 1; j < value.length; j++) {
                    value[j] = 1;
                }
                break;
            case 0:
                value[0] = 1;
                break;
            case 1:
                value[0] = 1;
                value[value.length - 1] = 1;
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    /**
     * Сравнивает два числа
     *
     * @param a Первое число
     * @param b Второе число
     *
     * @return {@code 1}, если первое число больше второго числа;
     *         {@code 0}, если первое число равно второму числу;
     *         {@code -1}, если первое число меньше второго числа.
     */
    public static ShiftModel compare(ShiftModel a, ShiftModel b) {
        counter = 0;
        int i = 0;
        counter++;
        while (i < a.value.length) {  // for заменён на while для облегчения подсчёта сложности
            counter++; //сравнение, которое привело в тело цикла
            counter++; //сравнение ниже
            if (a.value[i] > b.value[i]) {
                return new ShiftModel(1);
            } else {
                counter++; //сравнение ниже
                if (a.value[i] < b.value[i]) {
                    return new ShiftModel(-1);
                }
            }
            i++;
            counter++;
        }
        counter++; //сравнение, которое вывело из цикла
        return new ShiftModel(0);
    }

    /**
     * Счётчик операций, нарушающий инкапсуляцию
     * TODO: Убрать нарушение инкапсуляции
     */
    public static double counter;
}
