public class CreditPaymentService {
    public int calculate(int sum, double rate, double term) {
        double rateMonthly = rate / 100 / 12; // расчет месячной ставки
        double rateСalculation = 1 + rateMonthly;
        int monthlyPayment = (int) (sum * rateMonthly * Math.pow(rateСalculation, term) / (Math.pow(rateСalculation, term) - 1)); // формула расчета ежемесячного платежа
        return monthlyPayment;

    }
}
