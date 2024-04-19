# Neighborhood Library

Shown below is the home screen of the menu. 

<img width="844" alt="Screenshot 2024-04-19 at 11 43 14 AM" src="https://github.com/hibbaafzal/WorkshopTwo_NeighborhoodLibrary/assets/166542360/26020c58-6b9e-4a14-8294-b6b5b1cd6f4e">

## All Avaliable Books
Shown below are all the avaliable books in the library

<img width="977" alt="Screenshot 2024-04-18 at 7 33 33 PM" src="https://github.com/hibbaafzal/WorkshopTwo_NeighborhoodLibrary/assets/166542360/58c86de0-0ce0-433b-85dd-c5f080266c66">

## Errors

When an invalid command is put in, then the output is "Invalid"

<img width="342" alt="Screenshot 2024-04-18 at 7 34 32 PM" src="https://github.com/hibbaafzal/WorkshopTwo_NeighborhoodLibrary/assets/166542360/768c1016-957d-48f9-9c92-beb31c280517">


### Interesting Piece of Code

An interesting piece of Code were the nested do while loops. 

switch (bookCommand.toUpperCase()) {
                                    case "C":
                                        System.out.println("Selected: Check in a book");
                                        System.out.println("Enter ID of the book you want to check in.");

                                        for (Book book : bookInventory) {
                                        System.out.println(book.toString());
                                    }
                                        break;
                                    case "X":
                                        System.out.println("Selected: Exit");
                                        break;
                                    default:
                                        System.out.println("Command not found.");
                                }
                            } while (!bookCommand.equalsIgnoreCase("X"));
                            break;
