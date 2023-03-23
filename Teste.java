import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Digite a capacidade da fila:");
        int capacidade = scanner.nextInt();
        Fila fila = new Fila(capacidade);
        
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar paciente à fila");
            System.out.println("2 - Atender próximo paciente");
            System.out.println("3 - Exibir fila de atendimento");
            System.out.println("4 - Sair");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o número que paciente recebeu:");
                    int paciente = scanner.nextInt();
                    fila.enfileirar(paciente);
                    break;
                case 2:
                    fila.desenfileirar();
                    break;
                case 3:
                    fila.exibirFila();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        
        scanner.close();
    }
    }
}
