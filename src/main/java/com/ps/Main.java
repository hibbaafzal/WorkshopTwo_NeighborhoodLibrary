package com.ps;

import java.util.*;


public class Main {
    public static void main(String[] args) { // main method
        // making the array

        Book book1 = new Book(1, "0-2669-9861-5", "Above Ground");
        Book book2 = new Book(2, "0-4819-0231-7", "Against the Currant");
        Book book3 = new Book(3, "0-5174-5537-4", "Age of Vice");
        Book book4 = new Book(4, "0-2468-1180-3", "Bad Kids");
        Book book5 = new Book(5, "0-1655-6144-0", "The Bee Sting");
        Book book6 = new Book(6, "0-8828-7329-6", "Blackouts");
        Book book7 = new Book(7, "0-7506-8816-5", "Eve");
        Book book8 = new Book(8, "0-7996-0835-1", "Do a Power Bomb");
        Book book9 = new Book(9, "0-3754-1207-7", "The Glutton");
        Book book10 = new Book(10, "0-3643-3674-9", "A Guest in the House");
        Book book11 = new Book(11, "0-6938-0774-1", "Knockout");
        Book book12 = new Book(12, "0-4246-7776-8", "The Last One");
        Book book13 = new Book(13, "0-1099-0924-0", "The Maniac");
        Book book14 = new Book(14, "0-7031-1128-0", "Nestlings");
        Book book15 = new Book(15, "0-1610-8913-5", "The New Guy");
        Book book16 = new Book(16, "0-6643-4276-0", "Prophet");
        Book book17 = new Book(17, "0-2785-0777-8", "Red Queen");
        Book book18 = new Book(18, "0-4881-7405-8", "The Seven Year Slip");
        Book book19 = new Book(19, "0-5637-7698-6", "The Talk");
        Book book20 = new Book(20, "0-6078-5613-0", "Thank You For Sharing");



        Book[] bookInventory = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, book14, book15, book16, book17, book18, book19, book20};

        // asking user
                int command;
                do {
                    System.out.println("Please Choose an Option.");
                    System.out.println("\t1. Show Available Books.");
                    System.out.println("\t2. Show Checked Out Books.");
                    System.out.println("\t3. Exit.");

                    Scanner scanner = new Scanner(System.in);

                    command = scanner.nextInt();

                    switch (command) {
                        case 1:
                            System.out.println("Show Available Books: ");
                            for (Book book : bookInventory) {
                                System.out.println(book.toString());
                            }
                            int choice;
                            do {
                                System.out.println("Choose an Option:");
                                System.out.println("\t1. Check Out a Book.");
                                System.out.println("\t2. Exit.");
                                choice = scanner.nextInt();

                                switch (choice) {
                                    case 1:
                                        System.out.println("Selected: Check Out");

                                        String option;
                                        do {
                                            String fname;
                                           System.out.println ("Enter your full name.");

                                            System.out.println ("Click \"B\" to go back");
                                            option = scanner.nextLine();

                                       } while (option != "B");


                                            break;

                                            case 2:

                                                System.out.println("Selected: Exit");
                                                break;
                                            default:
                                                System.out.println("Invalid Choice.");
                                        }
                                } while (choice != 2) ;
                                break;


                        case 2:
                            System.out.println("Show Checked out Books");
                            String bookCommand;

                            do {
                                System.out.println("Choose an Option.");
                                System.out.println("\tClick 'C' to check in a book");
                                System.out.println("\tClick 'X' to exit");
                                bookCommand = scanner.next();

                                switch (bookCommand.toUpperCase()) {
                                    case "C":
                                        System.out.println("Selected: Check in a book");
                                        System.out.println("Enter ID of the book you want to check in.");

                                        break;
                                    case "X":
                                        System.out.println("Selected: Exit");
                                        break;
                                    default:
                                        System.out.println("Command not found.");
                                }
                            } while (!bookCommand.equalsIgnoreCase("X"));
                            break;

                        case 3:
                            System.out.println("Exiting program.");
                            break;

                        default:
                            System.out.println("Invalid Command.");
                    }
                    } while (command != 3) ;
                } }
