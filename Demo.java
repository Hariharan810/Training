import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        int[] temp = Arrays.copyOf(score, score.length);
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));

        String[] result = new String[score.length];

        int count = 1;
        for(int i=temp.length-1;i>=0;i--){
            int index = helper(score,temp[i]);
            if(count<=3){

                if(count==1){
                    result[index] = "Gold Medal";
                }
                else if(count==2){
                    result[index] = "Silver Medal";
                }
                else{
                    result[index] = "Bronze Medal";
                }
            }
            else{
                result[index] = Integer.toString(count);
            }
            count++;
        }
        System.out.println(Arrays.toString(result));
    }
    public static int helper(int[] score,int element){
        for(int i=0;i<score.length;i++){
            if(score[i]==element){
                return i;
            }
        }
        return -1;
    }
}