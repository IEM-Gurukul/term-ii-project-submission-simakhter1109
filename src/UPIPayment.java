class UPIPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("UPI Payment of ₹" + amount + " successful.");
    }
}
