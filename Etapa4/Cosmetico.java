//Classe Cosmético (subclasse de Loja)
public class Cosmetico extends Loja {
    private int taxaComercializacao;

    //Método construtor
    //Todos os atributos
    public Cosmetico(String nome, int quantidadeFuncionarios,  int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao,  int taxaComercializacao, int quantProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao,  quantProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    //Sem salário base dos funcionários
    public Cosmetico(String nome, int quantidadeFuncionarios, int quantProdutos, Endereco enderecoLoja, Data dataFundacao, int taxaComercializacao){
        super(nome, quantidadeFuncionarios, enderecoLoja, dataFundacao, quantProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    //Métodos de acesso da subclasse
    public int getTaxaComercializacao(){
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(int taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override

    public String toString(){
        return "Nome da loja: "+super.getNome()+" - Quantidade de funcionários: "+super.getQuantidadeFuncionarios()+" - Salário base dos funcionários: "+super.getSalarioBaseFuncionario()+
        "- Taxa de comercialização: "+taxaComercializacao+"Data de fundação:"+super.getDataFundacao()+"Endereço da loja: "+super.getEndereco();
      
    }
}
