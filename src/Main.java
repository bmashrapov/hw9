import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] costs = generateRandomArray();
        System.out.println(Arrays.toString(costs));
        int sum = 0;
        for (int i = 0; i <= costs.length - 1; i++) {
            sum += costs[i];
        }
        System.out.println("Сумма трат за месяц " + sum + " рублей");
        // Задание 2
        int maxCost = 99_000;
        int minCost = 201_000;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] > maxCost) {
                maxCost = costs[i];
            }
            if (costs[i] < minCost) {
                minCost = costs[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCost + " рублей. Максимальная сумма трат за день составила " + maxCost + " рублей");
        //Задание 3
        int averageCosts = sum / costs.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCosts + " рублей");
        //Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    int[] costs = generateRandomArray();
}