public interface OnlinePaymentService {

    abstract double paymentFee(double amount);
    abstract double interest(double amount, int months);
}
