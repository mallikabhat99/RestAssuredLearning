package restassured.interview.collections;

import java.util.ArrayList;
import java.util.List;

public class SubstringSearch {
    public static void main(String[] args) {
        String target = "hero";
        List<String> wordList = List.of("mass", "as", "hero", "superhero");
        List<String> matches = findSubstringMatches(target, wordList);
        System.out.println(matches); // Output: [hero, superhero]
    }

    public static List<String> findSubstringMatches(String target, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.contains(target)) {
                result.add(word);
            }
        }
        return result;
    }
}
