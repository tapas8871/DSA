package Stacks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Stacks.Nearest_greator_to_left.Left_Greator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Nearest_greator_to_left_Test {
    @Test
    public void TestCase1(){
        int []  arr = {9, 8, 7, 6, 15, 2, 13};
        List<Integer>  expected = new ArrayList<>(Arrays.asList(-1, 9, 8, 7, 6, 15, 2));
        List<Integer> actual = new ArrayList<>();
        actual = Left_Greator(arr);

        assertEquals(expected.size(),actual.size());

        for (int i = 0 ; i < arr.length;i++){
            assertEquals(expected.get(i),actual.get(i));
        }


    }
}
