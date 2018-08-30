import java.util.Scanner;

public class OX_lab1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String [][] arr = new String[3][3];

        System.out.println("  0 1 2");


        for(int i=0;i<3;i++){
            System.out.print(i+" ");
            for(int j=0;j<3;j++){
                arr[i][j] = "-";

                //System.out.print("-"+" ");
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("player1");
        System.out.print("X  (COl): ");
        int col = kb.nextInt();
        System.out.print("X  (ROW): ");
        int row = kb.nextInt();
        arr[row][col] = "x";
        for(int i=0;i<3;i++){
            System.out.print(i+" ");
            for(int j=0;j<3;j++){
                //System.out.print("-"+" ");
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }System.out.println("player2");
        System.out.print("X  (COl): ");
        int col2 = kb.nextInt();
        System.out.print("X  (ROW): ");
        int row2 = kb.nextInt();
        arr[row2][col2] = "O";
        for(int i=0;i<3;i++){
            System.out.print(i+" ");
            for(int j=0;j<3;j++){


                //System.out.print("-"+" ");
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
}
