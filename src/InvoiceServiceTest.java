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
    @Test
    public void multipleFare(){
        InvoiceGenerator invoiceGenerator= new InvoiceGenerator();
                                                                        //Creating object of InvoiceGenerator class
        Ride[] ride1 ={new Ride(2.0,5),new Ride(0.1,1)};
        double fare =invoiceGenerator.caluculateFare(ride1);
        assertEquals(30,fare,0);
    }
}
