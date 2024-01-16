//Classe Vestuário (subclasse de Loja)
public class Vestuario extends Loja {
    private boolean produtosImportados;

//Método construtor
public Vestuario(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, boolean produtosImportados, int quantProdutos){
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, quantProdutos);
    this.produtosImportados = produtosImportados;
}

//Métodos de acesso
public boolean getProdutosImportados(){
    return produtosImportados;
}

public void setProdutosImportados(boolean produtosImportados){
    this.produtosImportados = produtosImportados;
}

@Override
public String toString(){
    return "Nome da loja: "+super.getNome()+"- Produtos importados: "+produtosImportados+" - Quantidade de funcionários: "+super.getQuantidadeFuncionarios()+
    " - Salário base dos funcionários: "+super.getSalarioBaseFuncionario()+"Data de fundação:"+super.getDataFundacao()+"Endereço da loja: "+super.getEndereco();
    }
}
