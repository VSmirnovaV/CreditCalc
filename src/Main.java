public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000; //сумма кредита
        double rate = 9.99; // ставка
        double n = 36; // срок в месяцах
        int monthlyPayment = service.calculate(sum, rate, n);
        System.out.println("Ежемесячный платеж:" + monthlyPayment);
    }
}