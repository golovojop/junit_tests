package edu.barabu.junit_test;

public class RemoteCalculator {

    static final int OP_ADD = 1;
    static final int OP_SUB = 2;
    static final int OP_MUL = 3;
    static final int OP_DIV = 4;

    private int add(int a, int b) {
        return (a + b);
    }
    private int sub(int a, int b) {
        return (a - b);
    }
    private int mul(int a, int b) {
        return (a * b);
    }
    private int div(int a, int b) {
        return (a / b);
    }

    private int dispatcher(int operationID, int a, int b) {
        switch(operationID) {
            case OP_ADD:
                return add(a, b);
            case OP_SUB:
                return sub(a, b);
            case OP_MUL:
                return  mul(a, b);
            case OP_DIV:
                return div(a, b);
                default:
                    return 0;
        }
    }

    /**
     * TODO: Эмулятор сетевой точки входа
     */
    public int responder(int op, int a, int b) {
        return dispatcher(op, a, b);
    }
}
