public class GenericExample {
    private static  Integer max;
    public static Integer findMaximum(Integer a,Integer b,Integer c){
        max = a;
        if(b.compareTo(max) == 1)
            max = b;
        if(c.compareTo(max) == 1)
            max = c;
        return max;
    }

    public static void main(String [] args){

        GenericExample generic = new GenericExample();
        Integer max = generic.findMaximum(4,3,2);
        System.out.println("Maximum Number is: " +max);
    }


}
