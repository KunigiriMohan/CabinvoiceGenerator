public class InvoiceGenerator {
/*
* caluculateFare() to to caluculate fare of cab
* */
    public double caluculateFare(double distance, int time) {

        int price_per_Kilometer=10;
        int price_per_Minute=1;
        distance = 2.0;
        time =5;
        return ((distance*price_per_Kilometer)+(price_per_Minute*time));
    }
}
