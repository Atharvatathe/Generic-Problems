import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GenericExampleTest {

    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        Integer max = generic.findMaximumInt(5,4,3);
        Assertions.assertEquals(5,max);
    }

    @Test
    public void givenNumber_SecondMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        Integer max = generic.findMaximumInt(4,5,3);
        Assertions.assertEquals(5,max);
    }

    @Test
    public void givenNumber_ThirdMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        Integer max = generic.findMaximumInt(4,3,5);
        Assertions.assertEquals(5,max);
    }

    @Test
    public void givenFloatNumber_FirstMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        Float max = generic.findMaximumFloat(7.8f,4.4f,6.6f);
        Assertions.assertEquals(7.8f,max);
    }

    @Test
    public void givenFloatNumber_SecondMaximum_returnMaximumNumber() {
        GenericExample generic = new GenericExample();
        Float max = generic.findMaximumFloat(4.4f, 7.8f, 6.6f);
        Assertions.assertEquals(7.8f, max);
    }

    @Test
    public void givenFloatNumber_ThirdMaximum_returnMaximumNumber() {
        GenericExample generic = new GenericExample();
        Float max = generic.findMaximumFloat(4.4f, 6.6f, 7.8f);
        Assertions.assertEquals(7.8f, max);
    }

    @Test
    public void givenStringNumber_FirstMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        String max = generic.findMaximumString("Banana","Apple","Peach");
        Assertions.assertEquals("Banana",max);
    }

<<<<<<< HEAD
=======
    @Test
    public void givenStringNumber_SecondMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        String max = generic.findMaximumString("Apple","Banana","Peach");
        Assertions.assertEquals("Banana",max);
    }


>>>>>>> TC3.2_PassingMaxSecond
}
