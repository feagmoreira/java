import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double salario, quebra8, quebra18, quebra28, total;
                
        salario = teclado.nextDouble();
        quebra8 = 0;
        quebra18 = 0;
        quebra28 = 0;
        total = 0;

        if (salario >= 0 && salario <= 2000){
            System.out.println("Isento");
        }
        else if (salario > 2000 && salario <= 3000){
            quebra8 = (salario - 2000) * 0.08;
            total = quebra8 + quebra18 + quebra28;
            System.out.printf("R$ %.2f\n", total);
        }
        else if (salario > 3000 && salario <= 4500){
            quebra18 = (salario - 3000) * 0.18;
            quebra8 = ((salario - 2000)-(salario - 3000)) * 0.08;
            total = quebra8 + quebra18 + quebra28;
            System.out.printf("R$ %.2f\n", total);
        }
        else if (salario > 4500){
            quebra28 = (salario - 4500) * 0.28;
            quebra18 = ((salario - 3000) - (salario - 4500)) * 0.18;
            quebra8 = ((salario - 2000) - ((salario - 3000) - (salario - 4500)) - (salario - 4500)) * 0.08;
            total = quebra8 + quebra18 + quebra28;
            System.out.printf("R$ %.2f\n", total);
        }
    }
}