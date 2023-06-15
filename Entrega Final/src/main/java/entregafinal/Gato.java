package entregafinal;

//Nome: Luis Felipe Pizzi Lopes - RA: 2503522
public class Gato extends Animal implements IConsulta {

    private String racaGato; 
    private String pelagem; 

    public Gato(){
        racaGato = "";
        pelagem = ""; 
    }

    //Sobrecarga
    public Gato(String nome, int idade, String dataCadastro, Pessoa donoDoAnimal, String especie, String racaGato, String pelagem){
        super(nome, idade, dataCadastro, donoDoAnimal, especie); 
        this.racaGato = racaGato; 
        this.pelagem = pelagem;
    }

    public String getRacaGato(){
        return racaGato;
    }

    public void setRacaGato(String racaGato){
        this.racaGato = racaGato;
    }

    public String getPelagem(){
        return pelagem;
    }

    public void setPelagem(String pelagem){
        this.pelagem = pelagem;
    }

    @Override
    public double valorConsulta() {
        return 80; 
    }
}
