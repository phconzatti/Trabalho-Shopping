//Classe Produto
public class Produto {
    private String nome;
    private double preco;
    private Data validade;

    //Construtor

    public Produto(String nome, double preco, Data validade){
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }

    //Métodos de acesso

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public Data getDataValidade(){
        return validade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setDataValidade(Data validade){
        this.validade = validade;
    }

    //Método que verifica a validade do produto
    
    public boolean estaVencido(Data validade){
        if (validade.getAno() < 2023){
            return true;        
        } else if(validade.getAno() == 2023 && validade.getMes() < 10){
            return true;
        } else if(validade.getAno() == 2023 && validade.getMes() == 10 && validade.getDia() < 20){
            return true;
        } else{
            return false;
        }
    }

    @Override

    public String toString(){
        return "Nome do produto: "+nome+" - Preço do produto: "+preco+"Data de validade: "+validade;
    }
}


