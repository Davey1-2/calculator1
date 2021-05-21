package Logic;

public class Caculate {

    private int finaleRes = 0;


    public Caculate(int finalRes) {
        this.finaleRes = finalRes;

    }

    public void sum(int num1, int num2) {
        setFinaleRes(num1 + num2);
    }

    public void substract(int num1, int num2) {
        setFinaleRes(num1 - num2);
    }

    public void times(int num1, int num2) {
        setFinaleRes(num1 * num2);
    }

    public void divide(int num1, int num2) {
        setFinaleRes(num1 / num2);
    }

    public void power(int baseNum, int exponent) {
        int momentally;
        momentally = baseNum;

        for (int i = 1; i < exponent; i++) {
            momentally *= baseNum;
        }
        setFinaleRes(momentally);
    }

    public void factorial(int factorialNum) {
        int momentally = 1;

        for (int i = factorialNum; i > 0; i--) {
            momentally *= i;
        }
        setFinaleRes(momentally);
    }


    public int getFinaleRes() {
        return finaleRes;
    }

    public void setFinaleRes(int finaleRes) {
        this.finaleRes = finaleRes;
    }
}
