public class TextCleaning {

    /*public static String cleanText(String content) {
        content = content.toLowerCase();
        content = content.replaceAll("[^a-z0-9\\s]", "");
        return content;
    }*/
    public static String cleanText(String content){
        content = content.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < content.length(); i++){
            char c = content.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= 'g') || (c == ' ')){
                sb.append(c);
            }

        }return sb.toString();
    }

    public static void main(String[] args) {
        String textToClean = "Roses are red. Violets are blue, Sugar is sweet... And so are you.";
        System.out.println("Original Text: " + textToClean);
        String cleanedText = cleanText(textToClean);
        System.out.println("Cleaned Text: " + cleanedText);
    }
}

