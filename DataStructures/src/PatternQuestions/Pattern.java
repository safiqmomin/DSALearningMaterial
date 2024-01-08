package PatternQuestions;

public class Pattern {
    public static void main(String[] args) {
        pattern4();
        System.out.println();
        pattern3();
        System.out.println();
        pattern2();
        System.out.println();
        pattern1();
    }

    /*static void pattern28(int n){
        for(int row = 0; row < 2 * n; row++){
            int c =
            for (int col = 0; col < c ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
*/
    static void pattern4(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
