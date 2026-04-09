public class CalAssembler {

    MyCalculator calculator;
    CalAdd calAdd;
    CalSub calSub;
    CalMul calMul;
    CalDiv calDiv;

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
