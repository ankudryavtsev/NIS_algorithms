import java.util.Random;

/**
 * Модель представления чисел со сдвигом
 */
public class ShiftModel {
    private byte[] value = new byte[1024];

    /**
     * Заполняет массив случайным образом
     *
     * @param random Генератор случайных чисел
     */
    public ShiftModel(Random random) {
        for (int i = 0; i < value.length; i++) {
            value[i] = (byte) random.nextInt(2);
        }
    }
}
