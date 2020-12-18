package Curso6;

public class Text3 {
    public static void main(String[] args) {
        addSpace("Yo amo la universidad de Automatización");
    }

    /**
     * Add space before each uppercase  latter
     *
     * @param text jumbled text
     */
    public static void addSpace(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) ;
            {
                modifiedText.insert(i, " ");
                i++;

            }
        }
        System.out.println(modifiedText);
    }
}