public class Fila {

    private int[] fila;
    private int inicio;
    private int fim;
    private int capacidade;
    private int tamanho;
    
    public Fila(int capacidade) {
        this.fila = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.capacidade = capacidade;
        this.tamanho = 0;
    }
    
    void enfileirar (int valor) {
        if (tamanho == fila.length) {
            System.out.println("Não foi possível adicionar, você colocou mais que o tamanho permitido");
        } else {
          if  (fim == fila.length - 1) {
            fim = -1;
          }

          fim++;

          fila[fim] = valor;

          tamanho++;

        }
    }

    Object desenfileirar() {
        if (!isEmpty()) {
            Object temp = fila[inicio];
            fila[inicio] = 0;
            inicio++;
            if (inicio == fila.length) {
                inicio = 0;
            }
            tamanho--;
            return temp;

        } else {
            System.out.println("Fila Vazia");
            return null;
        }
    }
    
    Object frente () {
        if (!isEmpty()) {
            return fila[inicio];
        } else {
            System.out.println("Fila Vazia");
            return null;
        }
    }

    boolean isEmpty() {
        return tamanho == 0;
    }

    int size() {
        System.out.println("Quantidade de pacientes por ordem de chegada " + tamanho);
        return fim;
    }


    public void exibirFila() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Fila de atendimento:");
            int i = this.inicio;
            while (i != this.fim) {
                System.out.println("Paciente " + this.fila[i]);
                i++;
                if (i == this.capacidade) {
                    i = 0;
                }
            }
            System.out.println("Paciente " + this.fila[i]);
        }
    }
}