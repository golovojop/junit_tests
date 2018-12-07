package edu.barabu.junit_test;

import android.util.Log;

public class RemoteCalculatorManager {
    private RemoteCalculator rcalc;
    private boolean connected;

    private void logIt(String msg) {
        Log.d("CalculatorRelay: ", msg);
    }

    public RemoteCalculatorManager(){
        connect();
    }

    public RemoteCalculatorManager(RemoteCalculator rc) {
        this.rcalc = rc;
        connected = rc != null;
    }

    private boolean connect() {
        rcalc = new RemoteCalculator();
        connected = rcalc != null;
        return isConnected();
    }

    public boolean isConnected() {
        return connected;
    }

    public int add(int a, int b) {
        int result = 0;
        try {
            result = calculate(RemoteCalculator.OP_ADD, a, b);
        }
        catch (NullPointerException e) {
            logIt(e.getMessage());
        }
        return result;
    }
    public int sub(int a, int b) {
        int result = 0;
        try {
            result = calculate(RemoteCalculator.OP_SUB, a, b);
        }
        catch (NullPointerException e) {
            logIt(e.getMessage());
        }
        return result;
    }
    public int mul(int a, int b) {
        int result = 0;
        try {
            result = calculate(RemoteCalculator.OP_MUL, a, b);
        }
        catch (NullPointerException e) {
            logIt(e.getMessage());
        }
        return result;
    }
    public int div(int a, int b) {
        int result = 0;
        try {
            result = calculate(RemoteCalculator.OP_DIV, a, b);
        }
        catch (NullPointerException e) {
            logIt(e.getMessage());
        }
        return result;
    }

    private int calculate(int op, int a, int b) throws NullPointerException {
        if(!isConnected()) throw new NullPointerException();
        return rcalc.responder(op, a, b);
    }




}
