public class Exam2 {
    public static void main(String[] args) {


        int y = 3;
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= y - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        y = 5;
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= y - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        y = 7;
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= y - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}


