package com.techxtor.Miscellaneous;

public class CheckIfCoordinateInsideRectangle {
    public static void main(String[] args) {
        if(checkForCoordinate(2,2,8,6, 5,4)){
            System.out.println("Is Inside");
        } else {
            System.out.println("Is Outside");
        }
    }

    static boolean checkForCoordinate(int x1, int y1, int x2, int y2, int x, int y) {
        return x > x1 && x < x2
                && y > y1 && y < y2;
    }
}
