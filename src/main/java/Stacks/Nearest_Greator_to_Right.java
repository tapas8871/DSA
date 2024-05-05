package Stacks;

import java.util.*;

public class Nearest_Greator_to_Right {
    public static void main(String[] args) {
//       int[] arr = {    };
//       int length = arr.length;
//      // List<Integer> results = new ArrayList<>();
//        int[] aar = new int[length];
//        aar= Nearest_Greator_Right(arr,length);
//        System.out.println(Arrays.toString(aar));

    }


//    public static int[] reverse(int[] arr){
//        int n = arr.length;
//        int[] temp = new int[n];
//        int j = n;
//
//        for(int i = 0 ; i < n; i++){
//            temp[j-1] = arr[i];
//            j =j -1;
//
//        }
//         return temp;
//    }




    public static int[] Nearest_Greator_Right(int[] arr, int length){
        Stack<Integer>  stack = new Stack<>();
        int[]  results = new int[length];

        for(int i = length-1; i>= 0 ; i--){
            if(stack.size()==0){
                results[i] = -1;
            }else if(stack.size()>0 && stack.peek()>=arr[i]){
                results[i] = stack.peek();
            }else if(stack.size()>0 && stack.peek()<=arr[i]){
                while(stack.size()>0 && stack.peek()<=arr[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    results[i] = -1;
                }else{
                    results[i] = stack.peek();
                }
            }

             stack.push(arr[i]);
        }
          return results;

    }
}
