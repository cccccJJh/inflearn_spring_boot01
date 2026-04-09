package calculator;

public class CalAssembler {

    MyCalculator calculator;
    CalAdd calAdd;
    CalSub calSub;
    CalMul calMul;
    CalDiv calDiv;

    // 객체가 생성되는순간 모두 초기화..
    // 객체가 생성되는 순간 '외부에서' 모두 받아옴 (이게 바로 DI!)
    public CalAssembler() {
        this.calculator = new MyCalculator();
        this.calAdd = new CalAdd();
        this.calSub = new CalSub();
        this.calMul = new CalMul();
        this.calDiv = new CalDiv();


        assembler();
    }

    public void assembler() {
        calculator.cal(20, 10, calAdd);
        calculator.cal(20, 10, calSub);
        calculator.cal(20, 10, calMul);
        calculator.cal(20, 10, calDiv);
    }

}
