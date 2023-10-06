import java.util.Scanner;

//This is the second edit, after looking at the solution.
public class WhatToWear {
    public static void main(String[] args) {

//        This ask the user to input the forecast, (sun, rain, cloud)
        System.out.println("What is the forecast today, I don't know what to wear?");
        Scanner reader = new Scanner(System.in);
        String weatherConditions = reader.nextLine();

//        This ask the user to input the temperature (10, 15, 20)
        System.out.println("What is the temperature today?");
        int temperatureToday = reader.nextInt();

//        Afterward, the user will be asked two inputs

        if (weatherConditions.equals("rain") && temperatureToday < 13){
            System.out.println("Too cold, wear a jacket!");
        } else if (weatherConditions.equals("snow") || temperatureToday <= 8) {
            System.out.println("Super cold, stay indoors!");
        } else if (weatherConditions.equals("sun") || temperatureToday >= 16) {
            System.out.println("Weather is perfect, wear comfy clothes");
        }





    }
}

