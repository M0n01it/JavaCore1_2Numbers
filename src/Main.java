import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumbers = new ArrayList<>();

        // Отфильтруем положительные числа
        for (Integer number : intList) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }

        // Найдем четные числа среди положительных
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : positiveNumbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        // Отсортируем четные числа в порядке возрастания
        Collections.sort(evenNumbers);

        // Выведем результат на экран
        for (Integer number : evenNumbers) {
            System.out.println(number);
        }
    }
}