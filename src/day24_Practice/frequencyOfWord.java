package day24_Practice;

public class frequencyOfWord {

    public static void main(String[] args) {

        String sentence = "java java java python python";
        String word = "java";

      int frequencyOfWord = frequencyOfWord(sentence,word);

        System.out.println(frequencyOfWord);

    }



    //1.  create a method named frequencyOfWord that passes two parameters:
    //     string sentence and String word, then returns the frequency of word from the sentence
    public static int frequencyOfWord(String sentence, String word){

        int count = 0;

        while (sentence.contains(word)){

            sentence = sentence.replaceFirst(word," ");
            count++;
        }
     return count;
    }

}
/*
1.  create a method named frequencyOfWord that passes two parameters:
     string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */