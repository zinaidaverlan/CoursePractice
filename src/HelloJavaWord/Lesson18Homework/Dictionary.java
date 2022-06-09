package HelloJavaWord.Lesson18Homework;
/*	Create a program in which you will simulate an English-Romanian dictionary for 10 words.
 Display the corresponding words and translations on the screen */
import java.util.HashMap;


public class Dictionary {

    public static void main(String[] args) {

        HashMap<String, String> wordDictionary = new HashMap<String, String>();
        wordDictionary.put("apple", "mar");
        wordDictionary.put("summer", "vara");
        wordDictionary.put("child", "copil");
        wordDictionary.put("girl", "fata");
        wordDictionary.put("prety", "draguta");
        System.out.println(wordDictionary);

        System.out.println("Key HashMap:");
        for (String i : wordDictionary.keySet()) {
            System.out.println(i);}

        System.out.println("Value HashMap:");
        for(String i: wordDictionary.values()){
            System.out.println(i);
        }
        System.out.println("size HashMap:"+wordDictionary.size());

        for (String i : wordDictionary.keySet()) {
            System.out.println("English: " + i + "--> Romanian: " + wordDictionary.get(i));
        }

    }

    }


