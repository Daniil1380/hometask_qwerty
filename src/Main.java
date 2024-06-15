import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    //1) Пользователь бесконечно вводит числа в программу - температуру ядерного реактора.
    //2) После КАЖДОГО введеного числа сообщите пользователю информацию:
    //2.1) Среднее значение температуры ядерного за ВСЕ время (сложить числа и поделить на количество чисел)
    //2.2) Насколько текущая введеная температура отличается от предыдущей
    //2.3) Если введеная температура превышает среднюю на 10% и повысилась относительно предыдущего значения более, чем на 20%,
    //    То напишите на экран собщение "Тревога, превышение температуры"
    //
    //Усложненное задание:
    //3.1) Рассчитайте также среднюю температуру за 10 последних измерений и среднюю температуру каждого 100ого измерения
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        while (true) {
            int number = scanner.nextInt();
            Result result = calculator.addNumber(number);

            if (result.isAlarm()) {
                System.out.println("Тревога, превышение температуры");
            }

            System.out.println("Среднее значение: " + result.getAverage());
            System.out.println("Разница: " + result.getDifference());
        }
    }
}
