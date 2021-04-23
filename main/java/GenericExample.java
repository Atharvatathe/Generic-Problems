public class GenericExample {

    public static Integer findMaximumInt(Integer a, Integer b, Integer c) {
        Integer max;
        max = a;
        if (b.compareTo(max) == 1)
            max = b;
        if (c.compareTo(max) == 1)
            max = c;
        printIntMaximum(max);
        return max;
    }

    public static void printIntMaximum(Integer m) {
        System.out.println("Maximum integer Number is: " + m);
    }

    public static Float findMaximumFloat(Float a, Float b, Float c) {
        Float max;
        max = a;
        if (b.compareTo(max) == 1)
            max = b;
        if (c.compareTo(max) == 1)
            max = c;
        printFloatMaximum(max);
        return max;
    }
    public static void printFloatMaximum(Float m) {
        System.out.println("Maximum float Number is: " + m);
    }

}