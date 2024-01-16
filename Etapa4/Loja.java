// Classe loja
public class Loja{
    private Produto [] estoqueProdutos;
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionarios;
    private Data dataFundacao;
    private Endereco enderecoLoja;

    //Construtores da classe
    //Todos os atributos
    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionarios, Endereco enderecoLoja, Data dataFundacao, int quantProdutos){ 
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.estoqueProdutos = new Produto [quantProdutos];
        this.salarioBaseFuncionarios = salarioBaseFuncionarios;
        this.dataFundacao = dataFundacao;
        this.enderecoLoja = enderecoLoja;
    }
    //Somente nome e salário base 
    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, int quantProdutos){ 
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.estoqueProdutos = new Produto [quantProdutos];
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

    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }

    public int getSalarioBaseFuncionario(){
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

    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionarios){
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

    //Método que imprime a informação de todos os produtos da loja
    public void imprimeProdutos(){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null)
                System.out.println("Informações dos produtos inseridos: "+estoqueProdutos[i].toString());
        }
    }

    //Método que insere um produto no array
    public boolean insereProduto(Produto p){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] == null || estoqueProdutos[i].getNome().equals("nulo")){
                estoqueProdutos[i] = new Produto(p.getNome(), p.getPreco(), p.getDataValidade());
                return true;
            }
        }
        return false;
    }

    //Método que remove o produto do array
    public boolean removeProduto(String nomeProduto){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto) && estoqueProdutos[i] != null){             
                estoqueProdutos[i] = new Produto("nulo", 0.0, null);
                return true;
        } 
    }
        return false;         
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
        return "Nome da loja: "+nome+" - Quantidade de funcionários: "+quantidadeFuncionarios+"- Produtos em estoque: "+estoqueProdutos+
        " - Salário base dos funcionários: "+salarioBaseFuncionarios+"- Data de fundação: "+dataFundacao+"- Endereço da loja: "+enderecoLoja;
    }
}