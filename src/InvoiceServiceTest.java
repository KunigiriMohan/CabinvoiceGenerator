import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceServiceTest {
/*
* Test method for testing method is returning total fare or not
* */
    @Test
    public void total_Fare(){
        InvoiceGenerator invoiceGenerator= new InvoiceGenerator();
        double distance = 2.0;
        int time =5;
        double amount =invoiceGenerator.caluculateFare(distance,time);
        assertEquals(25,amount,0);
    }
    /**
     * Test method for testing method is returning minimum fare or not
     * */
    @Test
    public void minimum_Fare(){
        InvoiceGenerator invoiceGenerator= new InvoiceGenerator();
        double distance = 0.1;
        int time =1;
        double amount =invoiceGenerator.caluculateFare(distance,time);
        assertEquals(5,amount,0);

    }

    /**
     * invoice_summary() test method to check returned summary is correct or not
     * */
    @Test
    public void invoice_Summary(){
        InvoiceGenerator invoiceGenerator= new InvoiceGenerator();
        Ride[] ride1 ={new Ride(2.0,5),new Ride(0.1,1)};
        InvoiceSummary summary =invoiceGenerator.caluculateFare(ride1);
        InvoiceSummary invoiceSummary=new InvoiceSummary(2,30.0);
        assertEquals(invoiceSummary,summary);
    }
/**
 * Test method to check return summary is correct or not
 *
 */

    @Test
    public void givenUserId_returnInvoiceSummary() {                                            //
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        InvoiceSummary invoiceSummary = invoiceGenerator.getInvoice(3);
        InvoiceSummary expectedInvoiceSummery = new InvoiceSummary(2, 30);
        assertEquals(expectedInvoiceSummery.getInvoiceSummary(), invoiceSummary.getInvoiceSummary());
    }
}
