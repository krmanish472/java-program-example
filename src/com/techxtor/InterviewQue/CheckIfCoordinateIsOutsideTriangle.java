package com.techxtor.InterviewQue;

class CheckIfCoordinateIsOutsideTriangle {
    static double area(int x1, int y1,
                       int x2, int y2,
                       int x3, int y3) {
        return Math.abs(
                (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0
        );
    }

    static boolean isInside(int x1, int y1,
                            int x2, int y2,
                            int x3, int y3,
                            int x, int y) {

        double ABC = area(x1, y1, x2, y2, x3, y3);

        double PAB = area(x, y, x1, y1, x2, y2);
        double PBC = area(x, y, x2, y2, x3, y3);
        double PAC = area(x, y, x3, y3, x1, y1);

        return (ABC == PAB + PBC + PAC);
    }

    public static void main(String[] args) {
        if (isInside( 2, 1, 4, 5,6, 1, 5, 4))
            System.out.println("Inside");
        else
            System.out.println("Not Inside");

    }
}

