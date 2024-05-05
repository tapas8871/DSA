package Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Nearest_greator_to_left {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 15, 2, 13};
        System.out.println(Left_Greator(arr).toString());
    }

    public static List<Integer> Left_Greator(int[] arr){

        Stack<Integer>  stack = new Stack<>();
        List<Integer>  results = new ArrayList<>();

        for(int i = 0 ; i < arr.length;i++){
            if(stack.size()==0){
                results.add(-1);
            }else if(stack.size()>0 && stack.peek()>=arr[i]){
                results.add(stack.peek());
            }else if(stack.size()>0 && stack.peek()<=arr[i]){
                while(stack.size()==0 && stack.peek()<=arr[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    results.add(-1);
                }else {
                    results.add(stack.peek());
                }
            }
             stack.push(arr[i]);
        }

           return results;
    }

}
