import java.util.ArrayList;
import java.util.Scanner;

public class teste_funcoes {
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            ArrayList<Double> array1 = new ArrayList<>();
            ArrayList<Double> array2 = new ArrayList<>();
            boolean end = false;            
            while (end == false){
                System.out.println("Insira valores inteiros");
                double ultEntrada = entrada.nextDouble();
                if (ultEntrada != 0){
                array1.add(ultEntrada);
                entrada.nextLine();
                }
                else{end = true;}
            }
            end = false;
            while (end == false){
                System.out.println("Insira valores inteiros para o segundo array");
                double ultEntrada = entrada.nextDouble();
                if (ultEntrada != 0){
                array2.add(ultEntrada);
                entrada.nextLine();
                }
                else{end = true;}
            }
            System.out.println("A soma é: " + soma(array1,array2));
        }

    }

    static double soma(ArrayList<Double> i, ArrayList<Double> j){
        double z = i.stream().mapToDouble(Double::doubleValue).sum() + j.stream().mapToDouble(Double::doubleValue).sum();
        return z;
    }
    
    
}
