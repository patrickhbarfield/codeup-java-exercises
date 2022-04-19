import java.util.Random;

public class ServerNameGenerator {


    System.out.println("Your server name is: ");
    System.out.println("getRandomWord(adjectives) + "-" + getRandomWord(nouns));
}

    public static String getRandomWord(String[] wordArr) {
        Random random = new Random();
        int randomIndex = random.nextInt(wordArr.length);
        return wordArr[randomIndex];
    }
}