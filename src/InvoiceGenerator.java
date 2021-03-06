import java.util.HashMap;
import java.util.Map;

public class InvoiceGenerator {
    int price_per_Kilometer=10;
    int price_per_Minute=1;
    int minimum_Fare=5;
    int price_premiun=15;
    int price_per_minute_Premium=2;
    int minimum_fare_Premium=20;
/*
* caluculateFare() to to caluculate fare of cab
* */
    public double caluculateFare(double distance, int time) {



        double total_Fare=(distance*price_per_Kilometer)+(price_per_Minute*time);
        if(total_Fare<minimum_Fare){
            return minimum_Fare;
        }
        else {
            return total_Fare;
        }
    }
/*
* caluculateFare() method to return object of InvoiceSummary class
* */
    public InvoiceSummary caluculateFare(Ride[] ride1) {
        double total_Fare= 0;
        for (Ride ride :ride1){
            total_Fare+=caluculateFare(ride.distance,ride.time);
        }
        return new InvoiceSummary(ride1.length, total_Fare);
    }

/*
* getInvoice() return Invoice summary of given user id
* */

    public static InvoiceSummary getInvoice(int userId) {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Map<Integer, Ride[]> map = new HashMap<>();
        Ride[] rides = {new Ride(2.0, 5), new Ride(0.1, 1)};
        Ride[] ride1 = {new Ride(2.0, 5), new Ride(0.1, 1)};

        map.put(3, rides);
        map.put(1, ride1);

        for (Map.Entry<Integer, Ride[]> entry : map.entrySet())
        {
            if (userId == entry.getKey())
            {
                Ride[] ridesArray = entry.getValue();
                return invoiceGenerator.caluculateFare(ridesArray);
            }
        }
        return null;
    }

    /**
    * calucuateFare() method fare for premium
    * */
    public double calculateFare(double distance, int time, String type) {

        if (type.equalsIgnoreCase("Normal")) {
            double totalFare = distance * price_per_Kilometer + time * price_per_Minute;
            return Math.max(totalFare, minimum_Fare);
        } else if (type.equalsIgnoreCase("Premium")) {
            double totalFare = distance * price_premiun + time * price_per_Minute;
            return Math.max(totalFare, minimum_fare_Premium);
        } else {
            return 0;
        }
    }
}
