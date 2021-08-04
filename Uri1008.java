import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int numero;
        double horas, salario, vhoras;
        
        numero = teclado.nextInt();
        horas = teclado.nextDouble();
        vhoras = teclado.nextDouble();
        salario = horas * vhoras;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}