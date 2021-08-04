import java.util.Scanner;

public class Exercicio5{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double tempo, velocidade, distancia, litros;

        System.out.println("Digite o tempo gasto na viagem:");
        tempo = teclado.nextDouble();

        System.out.println("Digite a velocidade media usada na viagem:");
        velocidade = teclado.nextDouble();

        distancia = velocidade * tempo;
        litros = distancia / 12;
        System.out.printf("A distancia total percorrida na viagem foi de: %.2f km\n", distancia);
        System.out.printf("O total de litros de combustivel consumidos foi de: %.2f litros\n", litros);

    }
}