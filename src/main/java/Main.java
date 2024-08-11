import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nulo = 0;
    System.out.println("Digite o valor de X:");
    int x = sc.nextInt();
    System.out.println("");
    System.out.println("Digite o valor de Y:");
    int y = sc.nextInt();
    System.out.println("");
    while (x != nulo && y != nulo){
    if (x > nulo && y > nulo){
    System.out.println(".............................");
    System.out.println("| Pertence ao 1° Quadrante. |");
    System.out.println(".............................");
    }
    if (x > nulo && y < nulo){
    System.out.println(".............................");
    System.out.println("| Pertence ao 4° Quadrante. |");
    System.out.println(".............................");
    }
    if (x < nulo && y > nulo){
    System.out.println(".............................");
    System.out.println("| Pertence ao 2° Quadrante. |");
    System.out.println(".............................");
    }
    if (x < nulo && y < nulo){
    System.out.println(".............................");
    System.out.println("| Pertence ao 3° Quadrante. |");
    System.out.println(".............................");
    }
    System.out.println("");
    System.out.println("-----------------------------------------------");
    System.out.println("");
    System.out.println("Digite o valor de X:");
    x = sc.nextInt();
    System.out.println("");
    System.out.println("Digite o valor de Y:");
    y = sc.nextInt();
    System.out.println("");
    }
    sc.close();
  }
}