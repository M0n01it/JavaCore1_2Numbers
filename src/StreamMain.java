import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Используем Stream API для выполнения всех операций
        intList.stream()
                .filter(x -> x > 0)          // Отфильтруем положительные числа
                .filter(x -> x % 2 == 0)     // Оставим только четные числа
                .sorted()                    // Отсортируем числа в порядке возрастания
                .forEach(System.out::println); // Выведем результат на экран
    }
}