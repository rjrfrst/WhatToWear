import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {

        System.out.println("What's your ideal temperature, I don't know what to wear?");

        Scanner reader = new Scanner(System.in);
        int temperature = reader.nextInt();
        int temperatureToday = 16;

        if (temperature == temperatureToday){
            System.out.println("Wear casual clothes");
        } else if (temperature>temperatureToday || temperature >= 25) {
            System.out.println("It's too hot, maybe a vest");
        } else {
            System.out.println("It's too cold, maybe bring a coat?");
        }

    }
}
// Ask  the user to input Today's temperature
// If user input the same ideal temp, output = wear casual clothes
// If user input no the ideal temp, output = think about your outfit
