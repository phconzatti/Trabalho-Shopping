//Classe Endereço
public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String numero;
    private String complemento;
    private String cep;
    //Método construtor

    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String numero, String complemento, String cep){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    //Métodos de acesso

    public String getNomeDaRua(){
        return nomeDaRua;
    }

    public String getCidade(){
        return cidade;
    }

    public String getEstado(){
        return estado;
    }

    public String getPais(){
        return pais;
    }

    public String getNumero(){
        return numero;
    }

    public String getComplemento(){
        return complemento;
    }

    public String getCep(){
        return cep;
    }

    public void setNomeDaRua(String nomeDaRua){
        this.nomeDaRua = nomeDaRua;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public void setCep(String cep){
        this.cep = cep;
    } 

    @Override

    public String toString(){
        return "Nome da rua: "+nomeDaRua+"\nCidade: "+cidade+"\nEstado: "+estado+"\nPaís: "+pais+"\nNúmero: "+numero+"\nComplemento: "+complemento;
    }
}
