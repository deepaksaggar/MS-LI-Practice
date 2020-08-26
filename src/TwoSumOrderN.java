//https://leetcode.com/problems/two-sum/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOrderN {
    public static void main(String[] args) {
        int[] test = new int[]{3, -2, 7, 15, 11};
        System.out.println("\n" + Arrays.toString(test) + " : " + Arrays.toString(twoSum(test, 22)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[2];
        if (len == 0)
            return null;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len - 1; i++) {
            int diff = target - nums[i];
            if (!map.containsKey(diff)) {
                map.put(nums[i], i);
            } else {
                result[0] = map.get(diff);
                result[1] = i;
                return result;
            }
        }
        return result;
    }
}
