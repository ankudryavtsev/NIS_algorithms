import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Andrey Kudryavtsev
 * Date: 29.09.13
 * Time: 17:03
 */
public class ExtraModel extends AbstractModel
{
    /**
     * Заполняет массив случайным образом
     *
     * @param random Генератор случайных чисел
     */
    public ExtraModel(Random random)
    {
        super(random);
    }

    protected ExtraModel()
    {
    }

    private static long counter;
    public static long getCounter()
    {
        return counter;
    }
    public static void increaseCounter(int i)
    {
        counter += i;
    }
    public static void increaseCounter()
    {
        counter += 1;
    }

    /**
     * @return Единица в обратном/прямом коде
     */
    public static ExtraModel one()
    {
        ExtraModel one = new ExtraModel();
        one.value[one.value.length - 1] = 1;
        return one;
    }

    /**
     * Вычитание
     * @param num1 Уменьшаемое
     * @param num2 Вычитаемое
     * @return Разность
     */
    public static ExtraModel subtract(ExtraModel num1, ExtraModel num2)
    {
         return add(num1, num2.inverse());
    }

    /**
     * Сложение
     * @param num1 Слагаемое 1
     * @param num2 Слагаемое 2
     * @return Сумма
     */
    public static ExtraModel add(ExtraModel num1, ExtraModel num2)
    {
        //# BEGIN TODO: Реализовать сложение
        return new ExtraModel();
        //# END TODO
    }

    /**
     * Positive to negative and back
     * @return Инвертированное число
     */
    public ExtraModel inverse()
    {
        increaseCounter();
        if (this.isPositive()) //positive
        {
            inverseBits();
            return add(this, ExtraModel.one());
        }
        else
        {
            ExtraModel result;
            increaseCounter();
            result = subtract(this, one());
            result.inverseBits();
            return result;
        }
    }

    /**
     * Инвертирует биты
     */
    private void inverseBits()
    {
        increaseCounter(3);
        for (int i=0;i<value.length;i++)
        {
            increaseCounter(2);
            value[i]^=1;
        }
    }

    /**
     * Проверка на знак
     * @return {@code true} если положительно
     */
    private boolean isPositive()
    {
        increaseCounter(2);
        return value[0] == 0;
    }
}
