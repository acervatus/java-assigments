//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int a = 0; a < 4; a++) {
            for(int c = 0; c < 3-a; c++) {
                System.out.print(" ");
            }
            for(int e = 0; e < a*2 + 1; e++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}