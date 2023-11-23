package CodeTeen;
import java.util.ArrayList;
import java.util.Scanner;
public class Activity01 {
    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    return arr;
                }
            }
        } return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int[] arr = new int[]{2,7,11,15};
        System.out.print(twoSum(arr,target));
        input.close();
        }
    }

