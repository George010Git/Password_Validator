public class Main {
    public static void main(String[] args) {

        // Task1: Declara o metoda care primeste o parola si returneaza true sau fals
        // Taks2: Verifica daca parola are minim 8 caractere lungime
        // Task3: Verifica daca parola contine cel putin 1 majuscula
        // Task4: Verifica daca parola contine cel putin 1 cifra
        // Task5: Verifica daca parola contine cel putin 1 caracter special

        System.out.println(validatePassword("PassWord123*"));
        System.out.println(validatePassword("PassWord123"));
    }

    public static boolean validatePassword(String password) {
        if (hasMinimum8Length(password) && hasUpperLetter(password) && hasDigits(password) && hasCharacter(password)) {
            return true;
        } else {
            return false;
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
}
