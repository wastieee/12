package Easy;
import java.util.stream.IntStream;

/*
Посчитать сумму четных чисел в промежутке от 1 до 200 включительно и вывести ее на экран.
 */
public class first {
    public static void main(String[] args)
    {
        int sumOfEvenElement = IntStream.range(1,201)
                               .filter(number -> number %2 == 0)
                               .sum();

        System.out.println(sumOfEvenElement);
    }
}

