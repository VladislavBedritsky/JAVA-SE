package modul_5.basicsOfOOP.task_2.entity;

import java.util.Objects;

public class Payment {

    private TypeOfPayment typeOfPayment;

    public Payment (TypeOfPayment typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    public TypeOfPayment getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(TypeOfPayment typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return typeOfPayment == payment.typeOfPayment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfPayment);
    }

    @Override
    public String toString() {
        return "Выбраннный способ оплаты: " + typeOfPayment +
                ';';
    }
}
