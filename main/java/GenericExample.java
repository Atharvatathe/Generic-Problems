import java.util.Optional;
import java.util.Comparator;

import static java.util.Arrays.stream;


public class GenericExample<E extends Comparable<E>>{

    E a,b,c;

    public GenericExample(E a,E b,E c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public GenericExample(){}

    public Optional<E> findMaximum(E...element) {
        Optional<E> max;
        max = stream(element).
                sorted(Comparator.reverseOrder()).findFirst();
        printMaximum(max);
        return max;
    }

    public void printMaximum(Optional<E> max) {
        System.out.println("The Maximum is: " + max);
    }


}