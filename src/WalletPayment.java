class WalletPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Wallet Payment of ₹" + amount + " successful.");
    }
}
