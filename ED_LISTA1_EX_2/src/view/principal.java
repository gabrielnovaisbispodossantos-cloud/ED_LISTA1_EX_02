// 2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
// tamanho do vetor e o valor da úl�ma posição do vetor como o primeiro menor valor, retorne o menor
// valor con�do neste vetor.

package view;
import controller.metodos;

public class principal {

	public static void main(String[] args) {
		
        metodos m = new metodos();

        int vetor[] = {8, 3, 9, 7, 5};

        int resultado = m.menor(vetor, vetor.length, vetor[vetor.length - 1]);

        System.out.println("Menor valor = " + resultado);
   
	}

}
