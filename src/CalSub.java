public class CalSub implements ICalculator {

    @Override
    public int doOperator(int fNum, int sNum) {
        int result = fNum - sNum;
        return result;
    }

}
