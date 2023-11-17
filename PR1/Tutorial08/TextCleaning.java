package PR1.Tutorial01.Tutorial02.Tutorial08;
public class TextCleaning {

    public static String cleanText(String content) {
        content = content.toLowerCase();
        content = content.replaceAll("[^a-z0-9\\s]", "");
        return content;
    }

    public static void main(String[] args) {
        String textToClean = "This is a test! It includes some #special characters!!!";
        System.out.println("Original Text: " + textToClean);
        String cleanedText = cleanText(textToClean);
        System.out.println("Cleaned Text: " + cleanedText);
    }
}

