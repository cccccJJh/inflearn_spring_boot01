public class CalDiv implements ICalculator {

    @Override
    public int doOperator(int fNum, int sNum) {
        int result = (sNum != 0) ? fNum / sNum : 0;
        return result;
    }

}
