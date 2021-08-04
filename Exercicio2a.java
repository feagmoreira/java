import java.util.Scanner;

public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double lado, area;

        System.out.println("Digite o valor do lado do quadrado:");
        lado = teclado.nextDouble();

        area = lado * lado;
        System.out.printf("A area do quadrado e de: %.2f", area);

    }
}