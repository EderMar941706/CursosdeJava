package Curso6;

public class Text1 {
    public static void main(String[] args){
        countWords("Yo amo la universidad de Automatización");
    }

    /**
     * splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text){
        var words=text.split("");
        int numeberOfWords=words.length;
        String message = String.format("Your text containds %d words:", numeberOfWords);
        System.out.println(message);
        for (int i=0; i<numeberOfWords; i++){
            System.out.println(words[i]);
        }

    }
}
