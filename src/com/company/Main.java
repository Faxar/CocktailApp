package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        try{
            DBAccess.createTables();
        }catch (Exception e){
            e.printStackTrace();
        }


        while (!exit){
            System.out.println("1. View cocktails\n" +
                    "2. View used ingredients\n" +
                    "3. Add new cocktail\n" +
                    "4. Add new ingredient");
            int selection = scanner.nextInt();
            switch (selection){
                case 1:
                    controller.announceCocktailList();
                    break;
                case 2:
                    controller.announceIngredientList();
                    break;
                case 3:
                    controller.createCocktail();
                    break;
                case 4:
                    controller.createIngredient();
                    break;
                case 5:
                    exit = true;
                    break;
                case 6:
                    controller.enterEntryToDB();
            }
        }

    }

    private static String returnString(){
        return new Scanner(System.in).nextLine();
    }

}
