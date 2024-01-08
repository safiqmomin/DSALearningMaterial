package BitwiseOperator;

public class BitManipulation {
    public static void main(String[] args) {
        //oddEven(0);
        int[] nums = {2, 3, 4, 3, 2, 6, 4};
        System.out.println(findUnique(nums));
    }



    static int findUnique(int[] nums){
        int unique = 0;
        for (int n : nums){
            unique ^= n;
        }
        return unique;
    }

    static void oddEven(int n){
        if ((n & 1) == 1){
            System.out.println("Odd number");
        }else{
            System.out.println("Even Number");
        }
    }

    static void findBit(int n){

    }
}
