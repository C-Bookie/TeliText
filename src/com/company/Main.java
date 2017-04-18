package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int length = 32;
        int height = 1000;
        long[] t1 = new long[length];
        long[] t2 = new long[length];
        
        Random rand = new Random();
        
        for (int i=0; i<length; i++) {
            double a = (Math.pow(2, i)/Math.pow(2, length));
            float b = ((float)(i+1)/length);
            float c  = (float)(Math.pow(2, i)/Math.pow(2, length-1) * ((float)(i+1)/length));
            t1[i] = (long)((float)(Math.pow(2, i)/Math.pow(2, length-1) * ((float)(i+1)/length))*(float)height);
            t2[i] = (long)(((float)i/length)*(height/2));
        }

        System.out.print(TeliText.graph(t1, t2, height, 10));
    }
}
