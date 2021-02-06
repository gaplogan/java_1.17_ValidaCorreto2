import java.util.Scanner;

public class ValidaCorreto2 {
    public static void main(String[] args) throws Exception {
        // Para utilizar entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Declara��o de vari�veis
        double num, raiz;

        //{entrada de dados}
        do
        {
            System.out.print("Digite um n�mero positivo: ");
            num = entrada.nextDouble();
            
            // Exibe mensagem informando valor invalido ou pula uma linha, dependendo da verifica��o
            System.out.println((num < 0)? "Valor Inv�lido" : "\n");

        } while (num < 0);

        //{Processamento: Tenta extrair a raiz quadrada do n�mero lido}
        raiz = Math.sqrt(num);

        // Sa�da dos dados
        System.out.println("Raiz quadrada de " + num + ": " + raiz);

        entrada.close();
    }
}
