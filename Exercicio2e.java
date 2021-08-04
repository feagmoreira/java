import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double basemaior, basemenor, altura, area;

        System.out.println("Digite o valor da base maior do trapezio:");
        basemaior = teclado.nextDouble();

        System.out.println("Digite o valor da base menor do trapezio:");
        basemenor = teclado.nextDouble();

        System.out.println("Digite o valor da altura do triangulo:");
        altura = teclado.nextDouble();

        area = (basemaior + basemenor) * altura / 2;
        System.out.printf("A area do trapezio e de: %.2f", area);

    }
}