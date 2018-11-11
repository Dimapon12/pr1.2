import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите текст (exit - закончить ввод): ");
        Scanner in = new Scanner(System.in);
        StringBuilder text = new StringBuilder("");
        String tmp;

        while(true) {
            tmp = in.nextLine();
            if (tmp.equals("exit")) break;
            else text.append(tmp + "\n");
        }
        System.out.println();
        System.out.println("Введенный текст:");
        System.out.println(text.toString());

        System.out.println();
        System.out.println("Измененный текст:");

        changeLastWords(text);
        System.out.println(text.toString());
        System.out.println();
    }

    private static void changeLastWords(StringBuilder text) {
        String word = "";
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == '\n'){
                int j = i;
                word = "";
                j--;
                while(text.charAt(j) != ' ') {
                    if(text.charAt(j) == '.') ;
                    else word += text.charAt(j);
                    j--;
                }
                int f = 0;
                while (f != word.length()) {
                    text.setCharAt(++j, word.charAt(f++));
                }
            }
        }
    }
}