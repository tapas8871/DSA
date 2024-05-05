package Stacks;

import org.junit.jupiter.api.Test;

import static Stacks.Nearest_Smaller_Left.nearest_Smaller_Left;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Nearest_Smaller_Left_Test {
    @Test
    void TestCase1(){
        int[] arr = {2, 3, 4, 6, 6, 8};
        int[]  expected = {-1,2,3,4,6,6};

        int[] actual = nearest_Smaller_Left(arr,arr.length);

        assertEquals(expected.length,actual.length);
        for(int i = 0 ; i < arr.length;i++){
            assertEquals(expected[i],actual[i]);
        }

    }
}
