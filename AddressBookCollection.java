package com.Bridgelabz.Day_22_24;

import java.util.Scanner;

public class AddressBookCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        int choice,count;
        String city, state;
        AddressBookMethods detail = new AddressBookMethods();
        do {
            System.out.println("Enter the choice : ");
            System.out.println("1.Add contact ");
            System.out.println("2.Display contact");
            System.out.println("3.Edit contact");
            System.out.println("4.Delete contact");
            System.out.println("5.Search By State name");
            System.out.println("6.Search By City name");
            System.out.println("7.View By State name");
            System.out.println("8.View By City name");
            System.out.println("9.Count persons by city");
            System.out.println("10.Count persons by state");

            ch= sc.nextInt();
            switch (ch) {
                case 1 -> detail.readData();
                case 2 -> detail.DisplayContacts();
                case 3 -> {
                    System.out.println("\nEnter First Name you want to edit:- ");
                    String name = sc.next();
                    detail.editData(name);
                }
                case 4 -> detail.deleteData();
                case 5 -> {
                    System.out.println("\nEnter the state name to display details :- ");
                    state = sc.next();
                    detail.searchPersonByState(state);
                }
                case 6 -> {
                    System.out.println("\nEnter the city name to display details :- ");
                    city = sc.next();
                    detail.searchPersonByCity(city);
                }
                case 7 -> {
                    System.out.println("\nEnter the state name :- ");
                    state = sc.next();
                    detail.viewPersonByState(state);
                }
                case 8 -> {
                    System.out.println("\nEnter the city name :- ");
                    city = sc.next();
                    detail.viewPersonByCity(city);
                }
                case 9 -> {
                    System.out.println("\nEnter the city name to find person in city :- ");
                    city = sc.next();
                    count = detail.countPersonsByCity(city);
                    System.out.println("Number of persons by city " + city + " is " + count);
                }
                case 10 -> {
                    System.out.println("\nEnter the state name to find person in state  :- ");
                    state = sc.next();
                    count = detail.countPersonsByState(state);
                    System.out.println("Number of persons by state " + state + " is " + count);
                }
            }
            System.out.println("Do you want to continue? if yes press 1");
            choice = sc.nextInt();
        }while(choice == 1);
        sc.close();
    }
}