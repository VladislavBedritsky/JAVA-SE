package modul_5.basicsOfOOP.task_2.entity;

public enum Product {

    SHAMPOO(2.3,'$'),
    COKE(1.9,'$'),
    SWEETS(0.7,'$'),
    CHOCOLATE(1.3,'$'),
    CHEESE(3.2,'$'),
    BREAD(1.1,'$'),
    MEAT(4.5,'$'),
    EGGS(1.7,'$'),
    SUGAR(0.5,'$'),
    CRISPS(1.4,'$');

    private double value;
    private char currency;

    Product(double value, char currency) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency) {
        this.currency = currency;
    }
}
