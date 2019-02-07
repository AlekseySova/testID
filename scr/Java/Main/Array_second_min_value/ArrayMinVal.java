package Array_second_min_value;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMinVal {

    public  int[] arraySecondMinValue(int[] array) {

            Arrays.sort(array);

            System.out.println("Second minimal number in array = " + array[1]);

            return array;

    }
}
