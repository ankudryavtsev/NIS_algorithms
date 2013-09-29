import java.util.Random;
/**
 * Created with IntelliJ IDEA.
 * User: Andrey Kudryavtsev
 * Date: 29.09.13
 * Time: 17:04
 */
public class ExtraModelTest
{
    public static void main(String[] args)
    {
        Random random = new Random();
        ExtraModel num1 = new ExtraModel(random);
        System.out.println(num1);
        System.out.println(ExtraModel.one());
    }
}
