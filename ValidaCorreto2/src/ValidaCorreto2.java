import java.util.Scanner;

public class ValidaCorreto2 {
    public static void main(String[] args) throws Exception {
        // Para utilizar entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Declaração de variáveis
        double num, raiz;

        //{entrada de dados}
        do
        {
            System.out.print("Digite um número positivo: ");
            num = entrada.nextDouble();
            
            // Exibe mensagem informando valor invalido ou pula uma linha, dependendo da verificação
            System.out.println((num < 0)? "Valor Inválido" : "\n");

        } while (num < 0);

        //{Processamento: Tenta extrair a raiz quadrada do número lido}
        raiz = Math.sqrt(num);

        // Saída dos dados
        System.out.println("Raiz quadrada de " + num + ": " + raiz);

        entrada.close();
    }
}
