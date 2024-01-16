// Classe loja
public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionarios;

    //Construtores da classe

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios){ //Todos os atributos
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionarios = salarioBaseFuncionarios;
    }

    public Loja(String nome, int quantidadeFuncionarios){ //Somente nome e salário base
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
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

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionarios){
        this.salarioBaseFuncionarios = salarioBaseFuncionarios;
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
        return "Nome da loja: "+nome+" - Quantidade de funcionários: "+quantidadeFuncionarios+" - Salário base dos funcionários: "+salarioBaseFuncionarios;
    }
}