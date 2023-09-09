package Chapter_13_3;


import java.util.ArrayList;
import java.util.Random;

class Main {

    public static ArrayList<Number> sort(ArrayList<Number> list) {
        int[] numbers = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            numbers[i] = (int) list.get(i);
        }

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        list.clear();

        for (int i : numbers) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Number> numbers = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            numbers.add(random.nextInt(50));
        }

        System.out.println("Original list: " + numbers);
        System.out.println("Sorted list: " + sort(numbers));
    }
}
