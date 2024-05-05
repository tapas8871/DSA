package Stacks;


import org.junit.jupiter.api.Test;

import static Stacks.Nearest_Greator_to_Right.Nearest_Greator_Right;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Nearest_Greator_to_Right_Test {
    @Test
    public void TestCase1(){
        int[] arr = {9, 8, 7, 6, 5, 4,3};
        int[] expected  = {-1, -1, -1, -1, -1,-1, -1};

        int[] actual = Nearest_Greator_Right(arr, arr.length);
        assertEquals(expected.length,actual.length);

        for(int i = 0 ;i <arr.length;i++){
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void TestCase2(){
        int[] arr = {9};
        int[] expected  = {-1};
        int[]  actual =  Nearest_Greator_Right(arr, arr.length);


        for (int i = 0;i < expected.length;i++)
        assertEquals(expected[i],actual[i]);
    }

    @Test
    public void TestCase3(){
        int[]  arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[]  expected = {2, 3, 4,5 ,6, 7, 8,9,-1};

        int[]  actual = Nearest_Greator_Right(arr,arr.length);

        for (int i = 0 ; i < expected.length;i++){
            assertEquals(expected[i],actual[i]);
        }
    }
}
