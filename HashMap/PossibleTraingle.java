package HashMap;

import java.util.Scanner;

class RightAngledTriangle {
    static double distanceSquared(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }

    static boolean isRightAngledTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        int a2 = (int) distanceSquared(x1, y1, x2, y2);
        int b2 = (int) distanceSquared(x2, y2, x3, y3);
        int c2 = (int) distanceSquared(x3, y3, x1, y1);
        return (a2 + b2 == c2) || (b2 + c2 == a2) || (c2 + a2 == b2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int n = scanner.nextInt();
        int[][] points = new int[n][2];

        System.out.println("Enter the coordinates (x y) of the points:");
        for (int i = 0; i < n; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (isRightAngledTriangle(points[i][0], points[i][1], points[j][0], points[j][1], points[k][0], points[k][1])) {
                        System.out.println("Right-angled triangle found with points: (" + points[i][0] + ", " + points[i][1] + "), (" + points[j][0] + ", " + points[j][1] + "), (" + points[k][0] + ", " + points[k][1] + ")");
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No right-angled triangle found.");
        }
        scanner.close();
    }
}