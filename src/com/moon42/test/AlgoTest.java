package com.moon42.test;

import java.util.Arrays;
import java.util.List;

public class AlgoTest {
    public static void main(String[] args) {
        List<Integer> testData = Arrays.asList(14, 4);
        for (Integer integer : testData) {
            int rowNumber = findRowInPyramid2(integer);
            System.out.println("Row Number Is :"+rowNumber );
        }
    }

    private static int findRowInPyramid2(int input) {
        int num = 1, c, d;
        for ( c = 1 ; c <= input ; c++ ){
            for ( d = 1 ; d <= c ; d++ ){
                if (num == input)
                    return c;
//                System.out.print(num+" ");
                num++;
            }
        }
        return 0;
    }

}
