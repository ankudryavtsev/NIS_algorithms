import java.util.Random;

/**
 * Абстрантная модель. Остальные модели рекомендуется наследовать от неё
 */
public abstract class AbstractModel {
    protected byte[] value = new byte[1024];

    /**
     * Заполняет массив случайным образом
     *
     * @param random Генератор случайных чисел
     */
    public AbstractModel(Random random) {
        for (int i = 0; i < value.length; i++) {
            value[i] = (byte) random.nextInt(2);
        }
    }

    protected AbstractModel() {
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (byte b : value) {
            builder.append(b);
        }
        return builder.toString();
    }
}
