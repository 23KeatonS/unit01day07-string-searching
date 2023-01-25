import java.util.Scanner;
public class FindTagContents {
    public static void main(String[] args) {
        System.out.println("Please Enter the HTML you want to scan: ");
        Scanner scanner = new Scanner(System.in);
        String HTML = scanner.nextLine();
        System.out.println("Please Enter the tag you want to search for: ");
        String tag = scanner.nextLine();
        
        int tagpos = HTML.indexOf(("<"+tag+">"));
        if (tagpos != -1){
            int tagBeg = HTML.indexOf(">",tagpos);
            int tagEnd = HTML.indexOf("<",tagBeg+1);
            String word = HTML.substring(tagBeg+1,tagEnd);
            System.out.println(word);
            }else{
                System.out.println("there are no "+ tag+" tags in the entered HTML");
        }
    }
}