package entregafinal;
//Nome: Luis Felipe Pizzi Lopes - RA: 2503522
public class Pessoa {
    
    private String nome; 
    private String cpf; 
    private Endereco endereco = new Endereco(); 

    public Pessoa(){
        nome = "";
        cpf = "";
    }

    //Sobrecarga
    public Pessoa(String nome, String cpf, Endereco endereco){
        this.nome = nome; 
        this.cpf = cpf;
        this.endereco = endereco; 
    }

    public String getNome(){
        return nome; 
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) throws CpfException {
        if(cpf.length() == 11){
            this.cpf = cpf;
        }
        else{
            throw new CpfException();
        }
    }

    public Endereco getEndereco(){
        return endereco; 
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco; 
    }
}
