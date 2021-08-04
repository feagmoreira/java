import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Digite o valor da base do triangulo:");
        base = teclado.nextDouble();

        System.out.println("Digite o valor da altura do triangulo:");
        altura = teclado.nextDouble();

        area = (base * altura)/2;
        System.out.printf("A area do triangulo e de: %.2f", area);

    }
}