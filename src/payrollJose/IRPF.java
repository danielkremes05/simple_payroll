package payrollJose;

public class IRPF {
    private double valueIRPF;

    /*  No exercício de 2024 (ano-calendário de 2023)
        Até R$ 24.511,92	-	-
        De R$ 24.511,93 até R$ 33.919,80	7,5%
        De R$ 33.919,81 até R$ 45.012,60	15,0%
        De R$ 45.012,61 até R$ 55.976,16	22,5%
        Acima de R$ 55.976,16	            27,5%
    */

    public double calculateIRPF(double salary) {
        if (salary <= 24511.92) {
            valueIRPF = 0.0;
        } else if (salary <= 33919.80) {
            valueIRPF = (salary - 24511.92) * 0.075;
        } else if (salary <= 45012.60) {
            valueIRPF = (salary - 33919.80) * 0.15 + (33919.80 - 24511.92) * 0.075;
        } else if (salary <= 55976.17) {
            valueIRPF = (salary - 45012.60) * 0.225 + (45012.60 - 33919.80) * 0.15 + (33919.80 - 24511.92) * 0.075;
        } else {
            valueIRPF = (salary - 55976.17) * 0.275 + (55976.17 - 45012.60) * 0.225 + (45012.60 - 33919.80) * 0.15 + (33919.80 - 24511.92) * 0.075;
        }
        return valueIRPF;
    }

    public double getValueIRPF() {
        return valueIRPF;
    }
}
