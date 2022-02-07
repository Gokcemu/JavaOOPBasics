package list;

import java.util.ArrayList;

public class EvenArrayList extends ArrayList<Integer> {

    @Override
    public void add(int index, Integer element){
        if(isEven(element)){
            super.add(index, element);
        }
    }

    @Override
    public boolean add(Integer element){
        if(isEven(element)){
           return super.add(element);
        } else
            return false;
    }

    public static boolean isEven(Integer element){
       return Math.abs(element) % 2 == 1;
        }
}


