import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int choise=sc.nextInt();
        
        if (choise<0 || choise>4){System.out.print("Invalid");}
        
        else{System.out.print(menu[choise]);}
    }

}