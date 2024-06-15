import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> numbers;

    private final static double TEN_PERCENT_MORE = 1.1;

    public Calculator() {
        numbers = new ArrayList<>();
    }

    public Result addNumber(int number) {
        numbers.add(number);

        double average = calculateAverage();
        int difference = 0;
        boolean isAlarm = calculateAlarm(number, average);

        if (numbers.size() >= 2) {
            int lastNumber = numbers.get(numbers.size() - 2);
            difference = number - lastNumber;
        }

        Result result = new Result(average, difference, isAlarm);
        return result;
    }

    private double calculateAverage() {
        double sum = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum / numbers.size();
    }

    private boolean calculateAlarm(int number, double average) {
        if (numbers.size() >= 2) {
            int lastNumber = numbers.get(numbers.size() - 2);
            boolean isAlarm = (number > TEN_PERCENT_MORE * average && number > lastNumber * 1.2);
            return isAlarm;
        }

        return false;
    }


}
