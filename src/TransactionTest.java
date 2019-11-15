import java.util.Date;

public class TransactionTest {

    public static void main(String[] args){
        Date date = new Date(119,10,14);
        Transaction transaction = new Transaction(date);
        System.out.println(transaction.getTransactionDate());

        date.setDate(15);
        System.out.println(transaction.getTransactionDate());

    }
}
