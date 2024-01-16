//Classe Informática (subclasse de Loja)
public class Informatica extends Loja{
    private double seguroEletronicos;

    //Método construtor
    public Informatica(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    //Métodos de acesso
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString(){
        return "Nome da loja: "+super.getNome()+"- Seguro pago mesalmente por ser uma loja de eletrônicos: "+seguroEletronicos+" - Quantidade de funcionários: "+super.getQuantidadeFuncionarios()+
        " - Salário base dos funcionários: "+super.getSalarioBaseFuncionario()+"Data de fundação:"+super.getDataFundacao()+"Endereço da loja: "+super.getEndereco();
    }
}
