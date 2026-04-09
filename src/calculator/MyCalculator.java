package calculator;

public class MyCalculator {

    public void cal(int fNum, int sNum, ICalculator calculator) {
        int result = calculator.doOperator(fNum, sNum);
        System.out.println("result: " + result);
    }

    /*
    public void calAdd(int fNum, int sNum, calculator.CalAdd calAdd) {
        // int result = fNum + sNum;
        // calculator.ICalculator calculator = new calculator.CalAdd();
        int result = calAdd.doOperator(fNum, sNum);
        System.out.println("result: " + result);
    }

    public void calSub(int fNum, int sNum, calculator.CalSub calSub) {
        // int result = fNum - sNum;
        // calculator.ICalculator calculator = new calculator.CalSub();
        int result = calSub.doOperator(fNum, sNum);
        System.out.println("result: " + result);
    }

    public void calMul(int fNum, int sNum, calculator.CalMul calMul) {
        // int result = fNum * sNum;
        // calculator.ICalculator calculator = new calculator.CalMul();
        int result = calMul.doOperator(fNum, sNum);
        System.out.println("result: " + result);
    }

    public void calDiv(int fNum, int sNum, calculator.CalDiv calDiv) {
        // int result = (sNum != 0) ? fNum / sNum : 0;
        // calculator.ICalculator calculator = new calculator.CalDiv();
        int result = calDiv.doOperator(fNum, sNum);
        System.out.println("result: " + result);
    }
    */

}
