package entregafinal;

//Nome: Luis Felipe Pizzi Lopes - RA: 2503522
public class Cachorro extends Animal implements IConsulta{

    private String porte; 
    private String racaCachorro;

    public Cachorro(){
        porte = "";
        racaCachorro = "";
    }

    //Sobrecarga
    public Cachorro(String nome, int idade, String dataCadastro, Pessoa donoDoAnimal, String especie, String porte, String racaCachorro){
        super(nome, idade, dataCadastro, donoDoAnimal, especie);
        this.porte = porte;
        this.racaCachorro = racaCachorro;
    }

    public String getPorte(){
        return porte;
    }

    public void setPorte(String porte){
        this.porte = porte; 
    }

    public String getRacaCachorro(){
        return racaCachorro;
    }

    public void setRacaCachorro(String racaCachorro){
        this.racaCachorro = racaCachorro;
    }
    
    //Sobrescrita
    @Override
    public double valorConsulta(){
        return 100; 
    }
}

