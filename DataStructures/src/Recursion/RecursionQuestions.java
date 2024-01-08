package Recursion;

public class RecursionQuestions {
    public static void main(String[] args) {
        System.out.println(productDigits(12345));
        printAsc(5);
    }


    static int productDigits(int n){
        if (n%10  == n){
            return n;
        }

        return (n%10) * productDigits(n/10);

    }
    static int sumDigits(int n){
        if (n == 0){
            return n;
        }

        return (n%10) + sumDigits(n/10);

    }

    static int product(int n){
        if (n == 1){return 1;}
        n = n * product(n-1);
        return n;
    }
    static void printAscDesc(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printAscDesc(n-1);
        System.out.println(n);
    }

    static void printAsc(int n){
        if (n <= 0){
            return;
        }
        printDesc(--n);
        System.out.println(n);
    }

    static void printDesc(int n){
        if (n <= 0){
            return;
        }
        System.out.println(n);
        printDesc(n-1);

    }
}
