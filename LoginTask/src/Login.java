import java.util.Scanner;  // Import the Scanner class


public class Login {






    public static void main(String[] args) {


        String username = "Admin";
        Scanner Scanner1 = new Scanner(System.in);  // Create a Scanner object
        int input = 0;

        do {
            System.out.println("Enter Username: ");
            String userInput1 = Scanner1.nextLine();
            input++;


            if(userInput1.equals(username)){
                System.out.println("Correct");
                break;

            }
            if (input >=3){
                System.out.println("Details incorrect! locked out!");
                System.exit(0);
            }

        }
        while (input < 3);
        String password = "PaSSword!!!";






            int attempts = 0;
            while (attempts < 3) {

                Scanner Scanner2 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter Password: ");
                String userInput2 = Scanner2.nextLine();// Read user input


                if (userInput2.equals(password)) {
                    System.out.println("Correct! you are now logged in! ");
                    System.exit(0);


                } else if (attempts < 2) {
                    attempts++;
                    System.out.println("Error! Incorrect login details! ");

                } else {
                    System.out.println("you are now locked out!!!");
                    System.exit(0);
                }
            }
        }

    }
