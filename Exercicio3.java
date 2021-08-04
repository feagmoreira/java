import java.util.Scanner;

public class Exercicio3{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double salario, valorkw, totalkw, total;

        System.out.println("Digite o valor do salario minimo para calculo:");
        salario = teclado.nextDouble();

        System.out.println("Digite o valor do consumo em kw para calculo:");
        totalkw = teclado.nextDouble();

        valorkw = (salario / 7) / 100;
        total = valorkw * totalkw;
        System.out.printf("O valor de 1 kw e de: %.2f reais\n", valorkw);
        System.out.printf("O valor total a ser pago e de: %.2f reais\n", total);

        total = total * 0.9;
        System.out.printf("O valor total a ser pago com desconto a vista(10%%) e de: %.2f reais\n", total);

    }
}