// Classe loja
public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionarios;
    private Data dataFundacao;
    private Endereco enderecoLoja;

    //Construtores da classe
    //Todos os atributos
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios, Endereco enderecoLoja, Data dataFundacao){ 
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionarios = salarioBaseFuncionarios;
        this.dataFundacao = dataFundacao;
        this.enderecoLoja = enderecoLoja;
    }
    //Somente nome e salário base 
    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao){ 
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.dataFundacao = dataFundacao;
        this.enderecoLoja = enderecoLoja;
        salarioBaseFuncionarios = -1;
    }

    //Métodos de acesso

    public String getNome(){
        return nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionarios;
    }

    public Data getDataFundacao(){
        return dataFundacao;
    }

    public Endereco getEndereco(){
        return enderecoLoja;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionarios){
        this.salarioBaseFuncionarios = salarioBaseFuncionarios;
    }

    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }

    public void setEndereco(Endereco enderecoLoja){
        this.enderecoLoja = enderecoLoja;
    }

    //Método que calcula os gastos com salários
    public double gastosComSalario(){
        return salarioBaseFuncionarios * quantidadeFuncionarios;
    }

    //Método que mostra o tamanho da loja

    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10)
            return 'P';
        else if (quantidadeFuncionarios > 31)
            return 'G';    
        else 
            return 'M';
    }

    
    @Override

    public String toString(){
        return "Nome da loja: "+nome+" - Quantidade de funcionários: "+quantidadeFuncionarios+" - Salário base dos funcionários: "+salarioBaseFuncionarios+"Data de fundação: "
        +dataFundacao+"Endereço da loja: "+enderecoLoja;
    }
}