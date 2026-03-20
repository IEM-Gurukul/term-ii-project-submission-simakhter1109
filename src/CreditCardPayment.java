class CreditCardPayment extends Payment {
  @Override
  void processPayment(double amount){
    System.out.println ("Credit Card Payment of rupees " + amount + "successful.");
  }
}
