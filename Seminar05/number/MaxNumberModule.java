package Seminar05.number;

import java.util.ArrayList;

public class MaxNumberModule {
    public Integer maxValue(ArrayList<Integer> list) {
        Integer max=list.get(0);
        for (Integer element : list) {
            if(element > max){
                max= element;
            }
        }
        return max;
    }
}
