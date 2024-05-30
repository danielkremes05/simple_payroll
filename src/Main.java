import payrollJose.Payroll;

public class Main {
    public static void main(String[] args) {
        Payroll payrollJose = new Payroll();
        double resultJose = payrollJose.liquidSalary(100000);
        System.out.println("Information's Jose ");
        System.out.println(String.format("Salary liquid is R$ %.2f", resultJose));
        System.out.println(String.format("Discount INSS is R$ %.2f", payrollJose.displayINSS()));
        System.out.println(String.format("Discount IRPF is R$ %.2f", payrollJose.displayIRPF()));
        System.out.println(" ");

        Payroll payrollEduarda = new Payroll();
        double resultEduarda = payrollEduarda.liquidSalary(50000);
        System.out.println("Information's Eduardo ");
        System.out.println(String.format("Salary liquid is R$ %.2f", resultEduarda));
        System.out.println(String.format("Discount INSS is R$ %.2f", payrollEduarda.displayINSS()));
        System.out.println(String.format("Discount IRPF is R$ %.2f", payrollEduarda.displayIRPF()));
    }
}
