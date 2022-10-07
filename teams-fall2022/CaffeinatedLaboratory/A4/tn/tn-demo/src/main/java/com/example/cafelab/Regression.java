package com.example.cafelab;

import org.apache.commons.math3.stat.regression.SimpleRegression;

public class Regression {

    public static void main(String[] args) {

        SimpleRegression simpleRegression = new SimpleRegression(true);

        simpleRegression.addData(new double[][] {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5},
                {5, 6}
        });

        System.out.println("slope = " + simpleRegression.getSlope());
        System.out.println("intercept = " + simpleRegression.getIntercept());

        System.out.println("prediction for 1.5 = " + simpleRegression.predict(1.5));

    }

}