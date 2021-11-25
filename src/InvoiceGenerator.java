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
}
