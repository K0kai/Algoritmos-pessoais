//Este é o meu primeiro código que uso um metodo separado para fazer uma operação
//é um codigo basico feito apenas para duas operações: somar os elementos das arrays obtendo uma nova array e somar o total da soma dos elementos das duas arrays
//@K0kai

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class teste_funcoes {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            ArrayList<Double> array1 = new ArrayList<>();
            ArrayList<Double> array2 = new ArrayList<>();
            boolean end = false;
            System.out.println("Insira numeros para o primeiro array, para parar digite 0");
            while (end == false) {
                try {
                    double ultEntrada = entrada.nextDouble();
                    if (ultEntrada != 0) {
                        array1.add(ultEntrada);
                        entrada.nextLine();
                    } else {
                        end = true;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Numero não identificado, tente novamente");
                    entrada.nextLine();
                }
            }
            end = false;
            System.out.println("Insira numeros para o segundo array, para parar digite 0");
            while (end == false) {
                try {
                    double ultEntrada = entrada.nextDouble();
                    if (ultEntrada != 0) {
                        array2.add(ultEntrada);
                        entrada.nextLine();
                    } else {
                        end = true;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Numero não identificado, tente novamente");
                    entrada.nextLine();
                }
            }
            System.out.println("Digite um dos numeros abaixos para realizar as operações:\n0: Realiza a soma dos totais de cada array\n1: Realiza a soma entre os elementos das duas arrays e retorna uma nova array");
            int ultEntrada = entrada.nextInt();
            if (ultEntrada == 0) {
                entrada.nextLine();
                System.out.println("A soma dos totais é: " + somaTotal(array1, array2));
            } else if (ultEntrada == 1) {
                entrada.nextLine();
                System.out.println("A soma dos elementos é: " + somaElementos(array1, array2));
            }
        }

    }

    static double somaTotal(ArrayList<Double> i, ArrayList<Double> j) {
        double sm = i.stream().mapToDouble(Double::doubleValue).sum() + j.stream().mapToDouble(Double::doubleValue).sum();
        return sm;
    }

    static ArrayList<Double> somaElementos(ArrayList<Double> x, ArrayList<Double> y) {
        ArrayList< Double> arraio = new ArrayList<>();
        if (x.size() > y.size()) {
            while (x.size() != y.size()) {
                y.add(0.0);
            }
        } else if (x.size() < y.size()) {
            while (x.size() != y.size()) {
                x.add(0.0);
            }
        }
        for (int i = 0; i < x.size(); i++) {
            arraio.add(x.get(i) + y.get(i));
        }
        return arraio;
    }

}
