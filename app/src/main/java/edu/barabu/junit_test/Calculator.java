package edu.barabu.junit_test;

import android.util.Log;


public class Calculator {

    public void logIt(String msg) {
        Log.d("Calculator: ", msg);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        if(b == 0) {
            logIt("Divide by 0");
            return 0;
        }
        else return a/b;
    }

    public int mul(int a, int b){
        return a * b;
    }
}
