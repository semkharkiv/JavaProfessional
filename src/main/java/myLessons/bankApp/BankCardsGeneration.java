package myLessons.bankApp;

import java.util.Random;

public class BankCardsGeneration {
    private static String generateRandomNumber(int length){
        StringBuilder number = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int numeric = random.nextInt(30);
            number.append(numeric);
        }
        return number.toString();
    }

    public String generateCard(){
        return generateRandomNumber(24);
    }
}
