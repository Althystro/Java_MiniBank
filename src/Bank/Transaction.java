package Bank;

import java.util.Date;

public class Transaction {

    private Date date;
    private String type;
    private double amount;


    public  Transaction(Date date, String type, double amount){

        setAmount(amount);
        setType(type);
        setDate(date);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
