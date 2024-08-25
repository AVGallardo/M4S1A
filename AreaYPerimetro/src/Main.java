import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero1, numero2, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Favor ingresar el 1er lado del rectangulo o cuadrado en metros (m)");
        numero1=sc.nextInt();
        System.out.println("Favor ingresar el 2do lado del rectangulo o cuadrado en  metros (m)");
        numero2=sc.nextInt();

        resultado=(numero1*2)+(numero2*2);
        System.out.println("El resultado del PERIMETRO es: " + resultado);
        resultado=(numero1*numero2);
        System.out.println("El resultado del AREA es: " + resultado);
    }
}