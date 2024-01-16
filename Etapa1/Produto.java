//Classe Produto
public class Produto {
    private String nome;
    private double preco;

    //Construtor

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    //Métodos de acesso

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override

    public String toString(){
        return "Nome do produto: "+nome+" - Preço do produto: "+preco;
    }
}


