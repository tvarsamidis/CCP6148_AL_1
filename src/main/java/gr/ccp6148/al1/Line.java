package gr.ccp6148.al1;

public class Line {

    // should return a y point based on the equation of a line: y = ax + b
    public int linePoint(int a, int x, int b) {
        // write your code here.....
        throw new RuntimeException("write your code here");
    }

    // calculates several y coordinates by taking as parameter
    // the corresponding of x coordinates and coefficients
    public int[] calculate(int a, int[] x_points, int b) {
        int[] results = new int[x_points.length];
        for (int i = 0; i < x_points.length; i++) {
            results[i] = linePoint(x_points[i], a, b);
        }
        return results;
    }

}
