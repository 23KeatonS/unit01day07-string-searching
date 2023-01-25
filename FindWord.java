import java.util.Scanner;
public class FindWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a prhase: ");
        String phrase = scanner.nextLine();
        System.out.println("Enter the letter you want to search for: ");
        String letter = scanner.nextLine();
        int letterIndex = phrase.indexOf(letter);
         
        if (letterIndex != -1){
            boolean notFound = true;
            int indexDif = 1;
            char space = ' ';
            int begIndex = 0;
            int endIndex = 0;

            while(notFound){
                if (phrase.charAt(letterIndex-indexDif)==space || (letterIndex-indexDif)<0){
                    begIndex = (letterIndex-indexDif+1);
                    notFound = false;
                }else{
                    indexDif ++;
                }
            }
            indexDif = 1;
            while(notFound){
                if (phrase.charAt(letterIndex+indexDif)==space){
                    endIndex = (letterIndex+indexDif);
                    notFound = false;
                }else{
                    indexDif ++;
                }
            }
            String finalString = phrase.substring(begIndex,endIndex);
            System.out.println(finalString);



        }else{
            System.out.println("letter not in sentence");
        }

    }
}
