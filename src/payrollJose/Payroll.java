package payrollJose;

public class Payroll {
    private final INSS inss = new INSS();
    private final IRPF irpf = new IRPF();

    public double liquidSalary(double salary) {
        double inssDiscount = inss.calculateINSS(salary);
        double irpfDiscount = irpf.calculateIRPF(salary);
        return salary - inssDiscount - irpfDiscount;
    }

    public double displayINSS() {
        return inss.getValueINSS();
    }

    public double displayIRPF() {
        return irpf.getValueIRPF();
    }
}
