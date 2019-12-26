package com.java.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                   /* if (i == j || i == k || j == k)
                        continue;
                    else*/
                        System.out.println(i+""+j+""+k);
                }
            }
    }


}
