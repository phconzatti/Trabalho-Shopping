//Classe Shopping

import java.text.Normalizer;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    //Método construtor

    public Shopping(String nome, Endereco endereco, int maxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
    }

    //Métodos de acesso

    public String getNome(){
        return nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public Loja[] getLojas(){
        return lojas;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }

    //Método que insere uma loja

    public boolean insereLoja(Loja loja){
        for (int i = 0; i < lojas.length; i++){
            if (lojas[i] == null || lojas[i].getNome().equals("nulo")){
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    //Método que remove uma loja

    public boolean removeLoja(String l){
        for (int i = 0; i< lojas.length; i++){
            if (lojas[i].getNome().equalsIgnoreCase(l) && lojas[i] != null){
                lojas[i] = new Loja ("nulo", 0, 0, null, null, 0);
                return true;
            }
        }
        return false;
    }

    //Método que informa quantas lojas do mesmo tipo existem no shopping

    public int quantidadeLojasPorTipo(String lojaTipo){
        int quantidade = 0;
        lojaTipo = Normalizer.normalize(lojaTipo, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        for (Loja loja : lojas){
            if(loja.getClass().getSimpleName().equalsIgnoreCase(lojaTipo) && loja != null){
                quantidade++;
            }
        }
        return quantidade;
    }

    //Método que retorna a loja de informática que paga o maior valor em seguro e eletrônicos

    public Informatica lojaSeguroMaisCaro(){
        double maiorValor = 0.0;
        Informatica lojaMaiorValor = null;
        for (Loja loja : lojas){
            if (loja instanceof Informatica){
                Informatica informatica = (Informatica) loja;
                double valorSeguro = informatica.getSeguroEletronicos();
                if (valorSeguro > maiorValor){
                    maiorValor = valorSeguro;
                    lojaMaiorValor = informatica;
                }
            }
        }
        return lojaMaiorValor;
    }
      
    @Override
    public String toString(){
        return "Nome do shopping: "+nome+" - Endereço: "+endereco+" - Número máximo de lojas: "+lojas;
    }
}
