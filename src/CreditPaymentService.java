public class CreditPaymentService {
    public int calculate(int sum, double rate, double n) {
        double termMonthly = rate / 100 / 12; // расчет месячной ставки
        double b = 1 + termMonthly;
        int monthlyPayment = (int) (sum * termMonthly * Math.pow(b, n) / (Math.pow(b, n) - 1)); // формула расчета ежемесячного платежа
        return monthlyPayment;

    }
}
