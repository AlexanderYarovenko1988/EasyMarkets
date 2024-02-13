package util;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    private static final Random random = new Random();

    public static String getRandomString(int len) {

        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }



    public static String getRandomPhone() {
        StringBuilder phoneBuilder = new StringBuilder("+");
        for (int i = 0; i < 10; i++) {
            phoneBuilder.append(random.nextInt(10));
        }
        return phoneBuilder.toString();
    }

    public static String getRandomEmail() {
        String[] emailDomains = {"@gmail.com", "@yahoo.com", "@hotmail.com", "@outlook.com", "@aol.com"};
        String domain = emailDomains[random.nextInt(emailDomains.length)];
        return getRandomString(10) + domain;
    }

    public static String getRandomPassword() {
        // Генерация случайного пароля длиной 8 символов
        StringBuilder passwordBuilder = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            passwordBuilder.append(characters.charAt(index));
        }
        return passwordBuilder.toString();
    }
}
