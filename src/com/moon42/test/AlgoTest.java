package com.moon42.test;

import java.util.Arrays;
import java.util.List;

public class AlgoTest {
    public static void main(String[] args) {
        List<Integer> testData = Arrays.asList(14, 4,20,40);
        for (Integer integer : testData) {
            int rowNumber = findRowInPyramid(integer);
            System.out.println("Row Number Is :"+rowNumber );
        }
    }

    private static int findRowInPyramid(int inputNumber) {
        int num = 1, row, column;
        for ( row = 1 ; row <= inputNumber ; row++ ){
            for ( column = 1 ; column <= row ; column++ ){
                if (num == inputNumber)
                    return row;
//                System.out.print(num+" ");
                num++;
            }
        }
        return 0;
    }

}
