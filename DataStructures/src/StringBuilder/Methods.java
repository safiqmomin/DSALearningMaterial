package StringBuilder;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Safiq Momin";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
        int a = 123454321;
        System.out.println(isPalindrome(String.valueOf(a)));
    }

    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
