import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Main {
    public static void main(String[] args){
        String sent = "Satan, oro te, appare te rosto! Veni, Satano! Ter oro te! Veni, Satano! Oro te pro arte! Veni, Satano! A te spero! Veni, Satano! Opera praestro, ater oro! Veni, Satano! Satan, oro te, appare te rosto! Veni, Satano! Amen.";
        System.out.println("Sentences: "+text.sentences(sent));
        System.out.println("Words: " + text.words(sent));
        var letters = text.letters(sent);
        System.out.println("All letters: "+letters[0] + "; Vowels: "+ letters[1] + "; Consonants: "+ letters[2]);
        //var topWords = text.mostFrequent(sent.replaceAll("[^a-zA-Z ]","").toLowerCase().split("\\s+"),5);
       /* var topWordArray = new ArrayList(topWords.keySet());
        System.out.println("Top words: ");
        for (int i = 0; i < 5; i++)
            System.out.println(i+1 +") " + topWordArray.get(i));*/
        
        System.out.println("longest word: " + text.longest(sent));
    }
}




class text{
    public static int sentences(String str){
        var sentenceArray = str.split("[.!?]+");
        return sentenceArray.length;
    }
    public static int words(String sent){
        var wordsArray = sent.split("\\s+");
        return wordsArray.length;
    }
    public static int[] letters(String sent){
        int count = 0;
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < sent.length(); i++) {
            if (Character.isLetter(sent.charAt(i)))
                count++;
            char l = sent.charAt(i);
            if (l == 'u' || l == 'i' || l == 'a' || l == 'e' || l == 'y' || l == 'o' )
                vowels +=1;
            else if (l >='a' && l <= 'z')
                consonants += 1;
        }
        return new int[] {count, vowels, consonants};
    }
    public static String longest(String str){
        var words = str.replaceAll("[^a-zA-Z ]","").toLowerCase().split("\\s+");
        String longestWord = words[0];
        for(String w:words)
            if(w.length() > longestWord.length()) longestWord = w;
        return longestWord;
    }
    /*public static int mostFrequent(String[] arr, int n)
    {
        Map<Integer, Integer> hp = new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++) {
            //int key = arr[i];
            if(hp.containsKey(key)) {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else {
                hp.put(key, 1);
            }
        }
        int max_count = 0, res = -1;
        for(Entry<Integer, Integer> val : hp.entrySet()) {
            if (max_count < val.getValue()) {
                res = val.getKey();
                max_count = val.getValue();
            }
        }

        return res;
    }*/

}





