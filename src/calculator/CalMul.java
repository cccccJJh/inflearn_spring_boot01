package calculator;

public class CalMul implements ICalculator {

    @Override
    public int doOperator(int fNum, int sNum) {
        int result = fNum * sNum;
        return result;
    }

}
