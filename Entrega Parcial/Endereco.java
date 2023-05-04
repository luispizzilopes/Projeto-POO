//Nome: Luis Felipe Pizzi Lopes - RA: 2503522
public class Endereco {
    private String rua; 
    private String bairro; 
    private int numero; 

    public Endereco(){
        rua = "";
        bairro = "";
        numero = 0; 
    }

    //Sobrecarga
    public Endereco(String rua, String bairro, int numero){
        this.rua = rua; 
        this.bairro = bairro;
        this.numero = numero; 
    }

    public String getRua(){
        return rua; 
    }

    public void setRua(String rua){
        this.rua = rua; 
    }

    public String getBairro(){
        return bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero; 
    }
}
