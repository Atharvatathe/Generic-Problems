import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GenericExampleTest {

    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample(5,4,3);
        Integer max = (Integer) generic.findMaximum();
        Assertions.assertEquals(5,max);
    }

    @Test
    public void givenNumber_SecondMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample(4,5,3);
        Integer max = (Integer) generic.findMaximum();
        Assertions.assertEquals(5,max);
    }

    @Test
    public void givenNumber_ThirdMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample(4,3,5);
        Integer max = (Integer) generic.findMaximum();
        Assertions.assertEquals(5,max);
    }

    @Test
    public void givenFloatNumber_FirstMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample(7.8f,4.4f,6.6f);
        Float max = (Float) generic.findMaximum();
        Assertions.assertEquals(7.8f,max);
    }

    @Test
    public void givenFloatNumber_SecondMaximum_returnMaximumNumber() {
        GenericExample generic = new GenericExample(4.4f, 7.8f, 6.6f);
        Float max = (Float) generic.findMaximum();
        Assertions.assertEquals(7.8f, max);
    }

    @Test
    public void givenFloatNumber_ThirdMaximum_returnMaximumNumber() {
        GenericExample generic = new GenericExample(4.4f, 6.6f, 7.8f);
        Float max = (Float) generic.findMaximum();
        Assertions.assertEquals(7.8f, max);
    }

    @Test
    public void givenStringNumber_FirstMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample("Peach","Apple","Banana");
        String max = (String) generic.findMaximum();
        Assertions.assertEquals("Peach",max);
    }

   @Test
    public void givenStringNumber_SecondMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample("Banana","Peach","Apple");
        String max = (String) generic.findMaximum();
        Assertions.assertEquals("Peach",max);
    }

    @Test
    public void givenStringNumber_ThirdMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample("Apple","Banana","Peach");
        String max = (String) generic.findMaximum();
        Assertions.assertEquals("peach",max);
    }


}
