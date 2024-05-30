package payrollJose;

public class INSS {
    private double valueINSS = 0.0;

    /*Salário de Contribuição (R$) 	Alíquota progressiva para fins de recolhimento ao INSS
    Até R$ 1.412,00	7,5%
    De R$ 1.412,01 a R$ 2.666,68	9%
    De R$ 2.666,69 até R$ 4.000,03	12%
    De R$ 4.000,04 até R$ 7.786,02	 14%
    */


    public double calculateINSS(double salary) {
        if (salary <= 1320) {
            valueINSS = salary * 0.075;
        } else if (salary <= 2571.29) {
            valueINSS = 1320 * 0.075 + (salary - 1320) * 0.09;
        } else if (salary <= 3856.94) {
            valueINSS = 1320 * 0.075 + (2571.29 - 1320) * 0.09 + (salary - 2571.29) * 0.12;
        } else if (salary <= 7507.49) {
            valueINSS = 1320 * 0.075 + (2571.29 - 1320) * 0.09 + (3856.94 - 2571.29) * 0.12 + (salary - 3856.94) * 0.14;
        } else {
            valueINSS = 908.56;
        }
        return valueINSS;
    }

    public double getValueINSS() {
        return valueINSS;
    }
}
