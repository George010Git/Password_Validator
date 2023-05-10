import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Task1: Declare a method that receives a password and returns true or false
         * Task2: Check if the password is at least 8 characters long
         * Task3: Check if the password contains at least 1 capital letter
         * Task4: Check if the password contains at least 1 digit
         * Task5: Check if the password contains at least 1 special character
         * Task6: Ask the user for a password, save it in a variable and then pass the variable in the method call
         */

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter password");
            String password = sc.nextLine();
            validatePassword(password);
            if (hasMinimum8Length(password) && hasUpperLetter(password) && hasDigits(password) && hasCharacter(password) && isWithoutSpace(password)) {
                System.out.println("Correct Password ");
                break;
            }
        }
    }

    public static void validatePassword(String password) {

        if (!hasMinimum8Length(password)) {
            System.out.println("The password does not have at least 8 characters");
        }
        if (!hasUpperLetter(password)) {
            System.out.println("The password does not contain capital letters");
        }
        if (!hasDigits(password)) {
            System.out.println("The password does not contain numbers");
        }
        if (!hasCharacter(password)) {
            System.out.println("The password does not contain special characters");
        }
        if (!isWithoutSpace(password)){
            System.out.println("The password must not contain any spaces");
        }
    }

    public static boolean hasMinimum8Length(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasUpperLetter(String password) {

        boolean flag = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean hasDigits(String password) {
        boolean flag = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean hasCharacter(String password) {
        boolean flag = false;
        String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        for (int i = 0; i < password.length(); i++) {
            if (specialCharacters.contains(String.valueOf(password.charAt(i)))) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean isWithoutSpace(String password) {
        if (!password.contains(" ")) {
            return true;
        } else {
            return false;
        }
    }
}