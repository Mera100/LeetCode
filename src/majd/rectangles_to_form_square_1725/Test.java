package majd.rectangles_to_form_square_1725;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] test = new int[5][5];
        for (int i=0 ; i<5; i++){
            test[i] = new int[]{i, i};
        }
        System.out.println(Arrays.deepToString(test));
    }
}
