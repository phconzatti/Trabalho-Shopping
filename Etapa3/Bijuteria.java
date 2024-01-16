//Classe Bijuteria (subclasse de Loja)
public class Bijuteria extends Loja {
    private double metaVendas;

    //Método construtor
    public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao);
        this.metaVendas = metaVendas;
    }

    //Métodos de acesso

    public double getMetaVendas(){
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString(){
        return "Nome da loja: "+super.getNome()+"- Meta de vendas mensais da loja: "+metaVendas+" - Quantidade de funcionários: "+super.getQuantidadeFuncionarios()+
        " - Salário base dos funcionários: "+super.getSalarioBaseFuncionario()+"Data de fundação:"+super.getDataFundacao()+"Endereço da loja: "+super.getEndereco();
    }
}
