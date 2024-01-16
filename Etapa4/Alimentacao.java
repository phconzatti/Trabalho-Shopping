//Classe Alimentação (subclasse de Loja)
public class Alimentacao extends Loja {
    private Data dataAlvara;

    //Método construtor
    public Alimentacao(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, Data dataAlvara,  int quantProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao,  quantProdutos);
        this.dataAlvara = dataAlvara;
    }

    //Métodos de acesso
    public Data getDataAlvara(){
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString(){
        return "Nome da loja: "+super.getNome()+"- Data de recebimento do alvará de funcionamento: "+dataAlvara+" - Quantidade de funcionários: "+super.getQuantidadeFuncionarios()+
        " - Salário base dos funcionários: "+super.getSalarioBaseFuncionario()+"Data de fundação:"+super.getDataFundacao()+"Endereço da loja: "+super.getEndereco();
    }
}
