package comparator.ejercicio1;

import java.util.Comparator;

class ComparadorDecreciente implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        return num2 - num1;
    }
}
