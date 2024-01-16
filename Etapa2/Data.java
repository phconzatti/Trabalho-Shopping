//Classe Data
public class Data {
    private int dia;
    private int mes;
    private int ano;    

    //Construtor

    public Data(int dia, int mes, int ano){
        //Validador da data. Procura verificar se a data inserida é válida.
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;       
        if (ano < 0 || mes < 1 || mes > 12){
            setAno(2000);
            setDia(1);
            setMes(1);
            System.out.println("Data inválida.");
        }
        int diaFinal;//Variável criada para determinar qual o dia final do mês inserido
        switch (mes){//Meses com trinta dias
            case 4:
            case 6:
            case 9:
            case 11:
                diaFinal = 30;
                break;
            case 2://Verificação de dias de fevereiro 
                if(ano % 4 == 0){
                    diaFinal = 29;
                } else{
                    diaFinal = 28;
                }
                break;
            default://Meses com trinta e um dias
                diaFinal= 31;
        }
        if (dia < 1 || dia > diaFinal){
            setAno(2000);
            setDia(1);
            setMes(1);
            System.out.println("Data inválida."); 
        }
    }

    
        
    

    //Método que verifica se o ano é bissexto

    public boolean verificaAnoBissexto(){
        if(ano % 4 == 0)
            return true;
        else
            return false;

    }

    //Métodos de acesso

    public int getDia(){
        return dia;
    } 

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    @Override

    public String toString(){
        return dia+"/"+mes+"/"+ano;
    }
}
