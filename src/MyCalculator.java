public class MyCalculator {

    public void cal(int fNum, int sNum, ICalculator calculator) {
        int result = calculator.doOperator(fNum, sNum);
        System.out.println("result: " + result);
    }

    /*
    public void calAdd(int fNum, int sNum, CalAdd calAdd) {
        // int result = fNum + sNum;
        // ICalculator calculator = new CalAdd();
        int result = calAdd.doOperator(fNum, sNum);
        System.out.println("result: " + result);
    }

    public void calSub(int fNum, int sNum, CalSub calSub) {
        // int result = fNum - sNum;
        // ICalculator calculator = new CalSub();
        int result = calSub.doOperator(fNum, sNum);
        System.out.println("result: " + result);
    }

    public void calMul(int fNum, int sNum, CalMul calMul) {
        // int result = fNum * sNum;
        // ICalculator calculator = new CalMul();
        int result = calMul.doOperator(fNum, sNum);
        System.out.println("result: " + result);
    }

    public void calDiv(int fNum, int sNum, CalDiv calDiv) {
        // int result = (sNum != 0) ? fNum / sNum : 0;
        // ICalculator calculator = new CalDiv();
        int result = calDiv.doOperator(fNum, sNum);
        System.out.println("result: " + result);
    }
    */

}
