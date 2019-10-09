import lab_3.TextManipulation;

public class Main {
    public static void main(String[] args) {

        TextManipulation text = new TextManipulation();

        text.data = "Text aici text.";
        System.out.println("Nr de propozitii:");
        System.out.println(text.getNoOfSentences());
        System.out.println("Nr de litere:");
        System.out.println(text.getNoOfLetters());
        System.out.println("Nr de vocale:");
        System.out.println(text.getNoOfVowels());
        System.out.println("Nr de consoane:");
        System.out.println(text.getNoOfConsonants());
        text.showAllWords();
        text.showFiveMostUsedWords();
    }
}
