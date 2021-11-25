public class InvoiceGenerator {
/*
* caluculateFare() to to caluculate fare of cab
* */
    public double caluculateFare(double distance, int time) {

        int price_per_Kilometer=10;
        int price_per_Minute=1;
        int minimum_Fare=5;
        double total_Fare=(distance*price_per_Kilometer)+(price_per_Minute*time);
        if(total_Fare<minimum_Fare){
            return minimum_Fare;
        }
        else {
            return total_Fare;
        }
    }
/*
* overloding caluculateFare() method to return fare of multiple rides
* */
    public double caluculateFare(Ride[] ride1) {
        double total_Fare= 0;
        for (Ride ride :ride1){
            total_Fare+=caluculateFare(ride.distance,ride.time);
        }
        return total_Fare;
    }
}
