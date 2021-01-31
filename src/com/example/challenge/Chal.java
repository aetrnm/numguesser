package com.example.challenge;

import java.util.Random;
import java.util.Scanner;

public class Chal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Now You will play a game where you should guess a number");
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("Start a game?");
        String gameChecker = scanner.next();
        if(gameChecker.equals("Yes") || gameChecker == "yes"){
            Game();
        }
    }

    static void Game(){
        int mistakesCounter = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int genNum = random.nextInt(100)+1;
        System.out.println("NUM TO GUESS " + genNum);
        while(true){
            System.out.println("What do you think the number is?");
            int getNum = scanner.nextInt();
            if(getNum == genNum){
                System.out.println("You won!");
                System.exit(0);
            }
            if(getNum != genNum){
                mistakesCounter++;
                if(mistakesCounter == 5){
                    System.out.println("You lost!");
                    System.exit(0);
                }
            }
            if(mistakesCounter > 0){
                if(genNum > getNum){
                    System.out.println("Higher!");
                }
                else{
                    System.out.println("Lower!");
                }
            }
        }
    }
}
