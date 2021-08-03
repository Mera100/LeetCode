package majd.rectangles_to_form_square_1725;

public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxSquare = 0;
        int amountOfBiggestSquare = 0;
        for (int i = 0; i < rectangles.length; i++) {
            int currentBiggestPossibleSquare = Math.min(rectangles[i][0], rectangles[i][1]);
            if (currentBiggestPossibleSquare == maxSquare) {
                amountOfBiggestSquare++;
            } else if (currentBiggestPossibleSquare > maxSquare) {
                maxSquare = currentBiggestPossibleSquare;
                amountOfBiggestSquare = 1;
            }
        }
        return amountOfBiggestSquare;
    }
}
