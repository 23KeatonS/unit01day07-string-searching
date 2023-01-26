import java.util.Scanner;
public class FindWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        int letterIndex = phrase.indexOf(scanner.nextLine());
        if (letterIndex != -1){
            int endIndex = phrase.indexOf(" ",letterIndex);
            if (endIndex == -1){
                endIndex = phrase.length();
            }
            String shortPhrase = phrase.substring(0,endIndex-1);
            int startIndex = shortPhrase.lastIndexOf(" ");
            System.out.println(phrase.substring(startIndex+1,endIndex));
        }else{
            System.out.println("letter not in sentence");
        }


    }
}

// javac FindWord.java; cat phrase.txt | java FindWord
