//Classe Principal
import java.util.Scanner;
public class Principal{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int opcao;   
                
        do{
            System.out.println("Escolha uma das opções a seguir: \n(1) criar produto \n(2) criar loja \n(3) sair");
            //Usuário seleciona a opção desejada.
            opcao = sc.nextInt();
            switch(opcao){
                
                case 1://Selecionou a opção produto
                System.out.println("Digite a data de validade do produto a seguinte ordem: dia, mês e ano.");
                Data d1 = new Data(sc.nextInt(), sc.nextInt(), sc.nextInt());//Recebe a data de validade pelo teclado
                System.out.println("Digite o nome e o preço do produto.");
                Produto p1 = new Produto(sc. nextLine(), sc.nextLine(), sc.nextDouble(), d1);//Recebe o nome do produto e o respectivo preço pelo teclado
                break;
                
                case 2://Opção loja
                System.out.println("Digite a data de fundação da loja na seguinte ordem: dia, mês e ano.");
                Data d2 = new Data(sc.nextInt(), sc.nextInt(), sc.nextInt());//Recebe a data de fundação da loja pelo teclado
                System.out.println("Digite o endereço na loja na seguinte ordem: nome da rua, cidade, estado, país, número, complemento e CEP.");
                Endereco e2 = new Endereco(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());//Recebe o endereço pelo teclado
                System.out.println("Digite o nome da loja e o número de funcionários.");
                Loja l2 = new Loja(sc.nextLine(), sc.nextLine(), sc.nextInt(), e2, d2);//Recebe o nome e a quantidade de funcionários pelo teclado
                break;
                
                case 3://Opção sair
                System.out.println("Operação finalizada!");
                break;
                
                default://Número inválido
                System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
        sc.close();
    }
}
