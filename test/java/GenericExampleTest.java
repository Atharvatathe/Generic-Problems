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
<<<<<<< HEAD
        Float max = generic.findMaximumFloat(7.8f,4.4f,5.2f);
=======
        Float max = generic.findMaximumFloat(7.8f,4.4f,6.6f);
>>>>>>> TC2.2_PassingMaxSecond
        Assertions.assertEquals(7.8f,max);
    }

    @Test
<<<<<<< HEAD
    public void givenFloatNumber_SrcondMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        Float max = generic.findMaximumFloat(4.4f,7.8f,5.2f);
        Assertions.assertEquals(7.8f,max);
=======
    public void givenFloatNumber_SecondMaximum_returnMaximumNumber() {
        GenericExample generic = new GenericExample();
        Float max = generic.findMaximumFloat(4.4f, 7.8f, 6.6f);
        Assertions.assertEquals(7.8f, max);
>>>>>>> TC2.2_PassingMaxSecond
    }
}
