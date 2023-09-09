package Chapter_13_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Main {

    public static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Number> numbers = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            numbers.add(random.nextInt(50));
        }

        System.out.println("Original list: " + numbers);
        shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);
    }
}

