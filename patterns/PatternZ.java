import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Write your code here
    for (int firstRow = 0; firstRow < 5; firstRow++) {//5 star in first row
            System.out.print("*");
        }

        System.out.println();

        for (int row = 0; row < 3; row = row+1) {
            int spaceStarRow = 3-row;//rows with single star require 3 spaces, 2 spaces, & 1 space resp.

            while(spaceStarRow > 0) {//space is req before single star in three lines
                System.out.print(" ");
                spaceStarRow -= 1;
            }
            System.out.print("*");
            System.out.println();//need to move to next line for printing next star & final for last star row
        }

        for (int lastRow = 0; lastRow < 5; lastRow++) {//5 star in last row
            System.out.print("*");
        }
  }
}