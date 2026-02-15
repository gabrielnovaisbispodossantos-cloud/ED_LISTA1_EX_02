package controller;

public class metodos {
   public metodos() {
	   super();
   }
   
	public int menor(int v[], int tamanho, int menorAtual) {

        // CONDIÇÃO DE PARADA:
        // Quando o tamanho for 0, retorna o menor valor encontrado.
        if (tamanho == 0) {
            return menorAtual;
        }

        // Atualiza o menor valor se necessário
        if (v[tamanho - 1] < menorAtual) {
            menorAtual = v[tamanho - 1];
        }

        // RELAÇÃO RECURSIVA:
        // menor(n) = menor(n - 1)
        return menor(v, tamanho - 1, menorAtual);
    }
}

