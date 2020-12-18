package Curso6;

public class Text2 {
    public static void main(String[] args){
        reverseString("Yo amo la universidad de Automatización");
    }

    /**
     * Prints a string in reserve order
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for (int i=text.length()-1;i>0; i--){
            System.out.print(text.charAt(i));
        }
    }
}

