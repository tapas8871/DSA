package Stacks;

import java.util.Stack;

public class Nearest_Smaller_Left {
   public static int[] nearest_Smaller_Left(int [] arr, int length){
        Stack<Integer> stack = new Stack<>();
        int[]  results = new int[length];
        for(int i = 0 ; i < arr.length;i++){
            if(stack.size()==0){
                results[i] = -1;
            }else if (stack.size()>0 && stack.peek()<=arr[i]){
                results[i] = arr[i];
            }else if(stack.size()>0 && stack.peek()>=arr[i]){
                stack.pop();
            }
              if(stack.size()==0){
                  results[i] = -1;
              }else{
                  results[i] = stack.peek();
              }
                stack.push(arr[i]);
        }
         return results;
    }
}
