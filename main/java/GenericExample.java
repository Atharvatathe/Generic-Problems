public class GenericExample<E extends Comparable<E>>{

    E a,b,c;

    public GenericExample(E a,E b,E c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public E findMaximum(){
        return findMaximum(a,b,c);
    }

    public static <E extends Comparable<E>> E findMaximum(E a,E b,E c) {
        E max;
        max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        printMaximum(max);
        return max;
    }

    public static <T> void printMaximum(T m) {
        System.out.println("The Maximum is: " + m);
    }

}