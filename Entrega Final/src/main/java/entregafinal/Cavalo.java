package entregafinal;

//Nome: Luis Felipe Pizzi Lopes - RA: 2503522
public class Cavalo extends Animal implements IConsulta{

   private double altura;
   private double peso; 

    public Cavalo(){
        altura = 0; 
        peso = 0;
    }

    //Sobrecarga
    public Cavalo(String nome, int idade, String dataCadastro, Pessoa donoDoAnimal, String especie, double altura, double peso, boolean transporte){
        super(nome, idade, dataCadastro, donoDoAnimal, especie);
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura(){
        return altura; 
    }

    public void setAltura(double altura){
        this.altura = altura; 
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso; 
    }
    
    //Sobrescrita
    @Override
    public double valorConsulta() {
        return 300; 
    }
}

