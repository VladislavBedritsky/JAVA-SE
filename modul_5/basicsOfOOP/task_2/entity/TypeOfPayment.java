package modul_5.basicsOfOOP.task_2.entity;

public enum TypeOfPayment {

    CASH(10.13,'$'),
    CREDIT_CARD(5.9,'$');

    private double amount;
    private char currency;

    TypeOfPayment (double amount, char currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency) {
        this.currency = currency;
    }
}
