package Array_test;

import Array_second_min_value.ArrayMinVal;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Array_test {

    @Test
    public void arraySecondMinValueTest (){

        int[] array = {6,4,3,5,2,1};

        int[] ArraySecondMinValue = new ArrayMinVal().arraySecondMinValue(array);

        assertEquals(2, ArraySecondMinValue[1]);



    }

}
