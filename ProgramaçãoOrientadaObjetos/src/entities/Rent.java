package entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Rent {
    private String carModel;
    private LocalDateTime datePickup;
    private LocalDateTime dateReturn;

    public Rent(){

    }

    public Rent(String carModel, LocalDateTime datePickup, LocalDateTime dateReturn) {
        this.carModel = carModel;
        this.datePickup = datePickup;
        this.dateReturn = dateReturn;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public LocalDateTime getDatePickup() {
        return datePickup;
    }

    public void setDatePickup(LocalDateTime datePickup) {
        this.datePickup = datePickup;
    }

    public LocalDateTime getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(LocalDateTime dateReturn) {
        this.dateReturn = dateReturn;
    }

    public void payment(Double priceHour, Double priceDay){
        double minutes = Duration.between(getDatePickup(),getDateReturn()).toMinutes();
        double hours = (minutes/60.0);
        System.out.println(hours);
        if(hours<=12){
            Double totalPayment = 0.0;
            Double  a =  Math.ceil(hours)*priceHour;
            System.out.println("Basic payment: "+String.format("%.2f",a));
            Double tax = 0.0;
            if(a<=100.0){
                tax = a*0.2;
                System.out.println("Tax: "+String.format("%.2f",tax));
            }else{
                tax = a*0.15;
                System.out.println("Tax: "+String.format("%.2f",tax));
            }
            totalPayment = a+tax;
            System.out.println("Total payment: "+String.format("%.2f",totalPayment));


        }else{
            double days =  (hours/24);
            Double totalPayment = 0.0;
            Double a = Math.ceil(days)*priceDay;
            System.out.println("Basic payment: "+String.format("%.2f",a));
            Double tax = 0.0;
            if(a<=100.0){
                tax = a*0.2;
                System.out.println("Tax: "+String.format("%.2f",tax));
            }else{
                tax = a*0.15;
                System.out.println("Tax: "+String.format("%.2f",tax));
            }
            totalPayment = a+tax;
            System.out.println("Total payment: "+String.format("%.2f",totalPayment));
        }

    }
}
