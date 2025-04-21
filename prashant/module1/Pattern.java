package prashant.module1;

import java.util.Scanner;
public class Pattern {

    static void DiamondSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter character for pattern: ");
        char character = sc.next().charAt(0);
        


        int middleIndex = row / 2;

        for (int iterator = 0; iterator < row; iterator++) {
            for (int position = 0; position < row; position++) {
                if (iterator <= middleIndex) {
                    if (position >= middleIndex - iterator && position <= middleIndex + iterator) {
                        System.out.print(" ");
                    } else {
                        System.out.print(character);
                    }
                }
                else {
                    if (position >= iterator - middleIndex && position < row - (iterator - middleIndex)) {
                        System.out.print(" ");
                    } else {
                        System.out.print(character);
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }

    public static void main(String[] args) {
        DiamondSquare();
    }
}

