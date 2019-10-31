package modul_4.simpleClassesAndObjs.task_8.entity;

import java.math.BigInteger;

/*
8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Customer {

    private int id;
    private String name;
    private String adress;
    private BigInteger cardNumber;
    private String bankAccount;

    public Customer(int id, String name, String adress, BigInteger cardNumber, String bankAccount) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void setCardNumber(BigInteger cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAdress() {
        return adress;
    }
    public BigInteger getCardNumber() {
        return cardNumber;
    }
    public String getBankAccount() {
        return bankAccount;
    }
    @Override
    public boolean equals (Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Customer other = (Customer) obj;
        return id == other.id &&
                name.equals(other.name) &&
                adress.equals(other.adress) &&
                cardNumber.equals(other.cardNumber) &&
                bankAccount.equals(other.bankAccount);
    }
    @Override
    public int hashCode () {
        int result = 1;
        result = 31*result + id;
        result = 31*result + (name == null ? 0 : name.hashCode());
        result = 31*result + (adress == null ? 0 : adress.hashCode());
        result =  31*result + (cardNumber == null ? 0 : cardNumber.hashCode());
        result = 31*result + (bankAccount == null ? 0 : bankAccount.hashCode());
        return result;
    }
    @Override
    public String toString () {
        return "Customer { name: "+name+"; id: "+id+"; adress: "+adress+"; cardnumber: "+cardNumber+"; bankaccount: "+bankAccount+ " }";
    }
}
