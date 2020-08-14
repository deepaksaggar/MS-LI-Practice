import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int[] test = new int[]{3,-2,7,15,11};
        System.out.println("\n" +Arrays.toString(test) +" : "+ Arrays.toString(twoSum(test,9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        if(len==0)
            return null;
        int[] result = new int[2];
        for (int i=0; i<len-1; i++) {
            for (int j=i + 1; j<len; j++) {
                if (nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
