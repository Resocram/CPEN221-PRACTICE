import java.util.Date;

public class Transaction {
    private final Date transactionDate;

    public Transaction (Date date){
        this.transactionDate = new Date(date.getTime());
    }

    public Date getTransactionDate(){
        return new Date(transactionDate.getTime());
    }
}
