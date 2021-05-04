import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Optional;

public class GenericExampleTest {

    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        Optional<Integer> max = generic.findMaximum(7,4,3,5);
        Assertions.assertEquals(Optional.of(7),max);
    }

    @Test
    public void givenNumber_SecondMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        Optional<Integer> max = generic.findMaximum(7,4,3,5);
        Assertions.assertEquals(Optional.of(7),max);
    }

    @Test
    public void givenNumber_ThirdMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        Optional<Integer> max = generic.findMaximum(3,4,7,5);
        Assertions.assertEquals(Optional.of(7),max);
    }

    @Test
    public void givenFloatNumber_FirstMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        Optional<Float> max = generic.findMaximum(7.8,4.4,5.4,3.3);
        Assertions.assertEquals(Optional.of(7.8),max);
    }

    @Test
    public void givenFloatNumber_SecondMaximum_returnMaximumNumber() {
        GenericExample generic = new GenericExample();
        Optional<Float> max =generic.findMaximum(3.3,7.8,5.4,4.4);
        Assertions.assertEquals(Optional.of(7.8), max);
    }

    @Test
    public void givenFloatNumber_ThirdMaximum_returnMaximumNumber() {
        GenericExample generic = new GenericExample();
        Optional<Float> max =  generic.findMaximum(4.4,3.3,5.4,7.8);
        Assertions.assertEquals(Optional.of(7.8), max);
    }

    @Test
    public void givenStringNumber_FirstMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        Optional<String> max = generic.findMaximum("Peach","Apple","Banana");
        Assertions.assertEquals(Optional.of("peach"),max);
    }

   @Test
    public void givenStringNumber_SecondMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
       Optional<String> max = generic.findMaximum("Banana","Peach","Apple");
        Assertions.assertEquals(Optional.of("peach"),max);
    }

    @Test
    public void givenStringNumber_ThirdMaximum_returnMaximumNumber(){
        GenericExample generic = new GenericExample();
        Optional<String> max =  generic.findMaximum("Apple","Banana","Peach");
        Assertions.assertEquals(Optional.of("peach"),max);
    }



}
