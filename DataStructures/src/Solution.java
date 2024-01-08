import java.io.FilterOutputStream;
import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
        //System.out.println(reverse(123));
        majorityElement(new int[]{2,2,1,1,1,2,2});
    }
    static int reverse(int x) {
        int ans = 0;
        while(x < 10){
            ans = (ans + (x%10)) * 10;
            x = x / 10;
        }
        ans = ans + x;
        return ans;
    }

    static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> unique = new HashMap<Integer, Integer>();
        for (int num : nums){
            if (unique.containsKey(num)){
                unique.put(num, unique.get(num) + 1);
            }else{
                unique.put(num, 1);
            }
        }


        // Print keys and values
        for (int i : unique.keySet()) {
            System.out.println("key: " + i + " value: " + unique.get(i));
        }

        return -1;
    }
}