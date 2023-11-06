package org.example;
import java.security.SecureRandom;

public class PasswordGenerate {
    private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lower = "abcdefghijklmnopqrstuvwxyz";
    private static final String number = "0123456789";
    private static final String specialCha = "!@#$%^&*()_+{}|:<>?-=[]\\;',./`~";
    private static final int length = 8;

    public static String generateSecurePassword(){

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);
        password.append(upper.charAt(random.nextInt(upper.length())));
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(number.charAt(random.nextInt(number.length())));
        password.append(specialCha.charAt(random.nextInt(specialCha.length())));

        String allCharacters = upper + lower + number + specialCha;
        for (int i = 4; i < length; i++ ) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }
        return password.toString();
    }
}
