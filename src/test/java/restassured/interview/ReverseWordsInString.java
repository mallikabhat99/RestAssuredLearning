package restassured.interview;

public class ReverseWordsInString {
    public static void main(String[] args) {

        String sentence = "Mallika Bhat And Kumud Kini";
        String[] words = sentence.split(" ");
        StringBuffer reverseSentence = new StringBuffer();

        for(String word : words){
            StringBuffer reverseWord = new StringBuffer(word);
            reverseWord.reverse().append(" ");
            reverseSentence.append(reverseWord);

        }
        System.out.println(reverseSentence);

    }
}