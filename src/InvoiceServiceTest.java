import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceServiceTest {

    @Test
    public void total_Fare(){
        InvoiceGenerator invoiceGenerator= new InvoiceGenerator();          //Creating object of InvoiceGenerator class
        double distance = 2.0;
        int time =5;
        double amount =invoiceGenerator.caluculateFare(distance,time);      //giving arguments to caluculateFare() method
        assertEquals(25,amount,0);

    }
    @Test
    public void minimum_Fare(){
        InvoiceGenerator invoiceGenerator= new InvoiceGenerator();          //Creating object of InvoiceGenerator class
        double distance = 0.1;
        int time =1;
        double amount =invoiceGenerator.caluculateFare(distance,time);      //giving arguments to caluculateFare() method
        assertEquals(5,amount,0);

    }
}
