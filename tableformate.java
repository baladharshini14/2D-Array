import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];

        for(int i = 0; i < a.length; i++) {

            for(int j = 0; j < a[0].length; j++) {

                a[i][j] = sc.nextInt();
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}