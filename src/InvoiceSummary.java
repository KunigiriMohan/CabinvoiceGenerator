

public class InvoiceSummary {
    int no_of_Rides;                                //Instance variables in InvoiceSummary class
    double total_Fare;
    double average_Fare;
    public InvoiceSummary(int no_of_Rides, double total_Fare) {         //Constructer of InvoiceSummary class
        this.no_of_Rides=no_of_Rides;
        this.total_Fare=total_Fare;
        this.average_Fare=(this.total_Fare+this.total_Fare)/2;
    }

    @Override
    public boolean equals(Object o) {                           //Overriding equals method
        if (this == o) return true;
        if (!(o instanceof InvoiceSummary)) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return no_of_Rides == that.no_of_Rides && Double.compare(that.total_Fare, total_Fare) == 0;
    }
}
