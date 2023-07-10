package tdd;

public class Picture {
    public static void main(String[] args) {
        int[][] picture;
        picture = new int[
                ][] { {0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0}};
        for (int outsideArray = 0; outsideArray < picture.length; outsideArray++) {
            for (int innerArray = 0; innerArray < picture[outsideArray].length; innerArray++) {
                if (picture[outsideArray][innerArray] == 0) {
                    System.out.print(" ");
                } else if (picture[outsideArray][innerArray]  == 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
//    int[][] numbers = new int[7][7];

}
