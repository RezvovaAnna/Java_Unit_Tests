package Seminar05.number;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumberModule {
    public ArrayList<Integer> numbers(int count) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(10));
        }
        return list;
    }
}
