import java.lang.reflect.Array;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args){
        ArrayList names = new ArrayList();
        collectNameTo(names);
        System.out.println("output: ");
        printUpperCase(names);
        System.out.println("get someone: ");
        printGet(names);

    }
    static void collectNameTo(ArrayList names){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("guess name: ");
            String name = scanner.nextLine();
            if(name.equals("quit")){
                break;
            }
            names.add(name);
        }

    }
    static void printUpperCase(ArrayList names){
        for(int i = 0 ; i < names.size() ; i++){
            String name = (String) names.get(i);
            System.out.println(name.toUpperCase());
        }
        System.out.println(names.size());
    }
    static void printGet(ArrayList names){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(names.get(i));
    }
}
