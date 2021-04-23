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
}
