package com.geekforgeeks.PythonQuestion;

import java.util.Scanner;

public class AirIndia {
    public static void main(String[] args) {

        

    }
}


class Flight{
    int flightNumber;
    String FromplaceName;
    int fare;
    String destination;
    int distance ;
    int fuelLitre;
    Flight(int flightNumber,String FromplaceName,int fare,String destination,int distance
           ){
        this.flightNumber= flightNumber;
        this.FromplaceName = FromplaceName;
        this.fare = fare;
        this.destination=destination;
        this.distance=distance;

    }
    void FuelQuantity(){
        if(distance<=1000){
            fuelLitre = 500;
//            System.out.println("fuel to be consumed :500 litres");
        } else if (distance <=1500) {
            fuelLitre = 1100;
//            System.out.println("fuel to be consumed :1100 litres");

        }  else if (distance <=2000) {
//            System.out.println("fuel to be consumed :2200 litres");
            fuelLitre = 2200;
        }else {
            fuelLitre = 3100;
//            System.out.println("fuel to be consumed :3100 litres ");
        }
    }
    void calculateFare(){
        if(distance<=1000){
            fare = 4000;
//            System.out.println("fare to be consumed :4000$");
        } else if ( distance <=1500) {
//            System.out.println("fare  to be consumed :6000$");
            fare = 6000;
        } else if ( distance<=2000) {
//            System.out.println("fare to be consumed :7500$");
            fare = 7500;
        }
        else{
//            System.out.println("fare to be consumed :9500$");
            fare = 9500;
        }
    }

     void feedInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the flight number....");
        flightNumber = sc.nextInt();
        System.out.println("choose the destination...");
        destination = sc.nextLine();
        System.out.println("enter the distance in km ...");
        distance = sc.nextInt();

        calculateFare();
        FuelQuantity();





    }
     void  showInfo(){
         System.out.println("flight number :"+flightNumber);
         System.out.println("from place :"+FromplaceName);
         System.out.println("destination :"+destination);
         System.out.println("distance :"+distance);
         System.out.println("fuel quantity :"+fuelLitre);
         System.out.println("fare :"+fare);

     }

     public void SearchFLight(String searchFLightNumber){

     }



}
