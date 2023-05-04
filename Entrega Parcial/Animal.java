//Nome: Luis Felipe Pizzi Lopes - RA: 2503522
public abstract class Animal {

    private String nome; 
    private int idade;
    private String dataCadastro; 
    private Pessoa donoDoAnimal = new Pessoa(); 
    private String especie; 

    public Animal(){
        nome = "";
        idade = 0;
        dataCadastro = "";
        especie = "";
    }

    //Sobrecarga
    public Animal(String nome, int idade, String dataCadastro, Pessoa donoDoAnimal, String especie){
        this.nome = nome; 
        this.idade = idade; 
        this.dataCadastro = dataCadastro; 
        this.donoDoAnimal = donoDoAnimal;
        this.especie = especie; 
    }

    public String getNome(){
        return nome; 
    }

    public void setNome(String nome){
        this.nome = nome; 
    }

    public int getIdade(){
        return idade; 
    }

    public void setIdade(int idade) throws IdadeException{
        if(idade >= 0 && idade <= 50){
            this.idade = idade;
        }
        else{
            throw new IdadeException(); 
        }
    }

    public String getDataCadastro(){
        return dataCadastro; 
    }

    public void setDataCadastro(String dataCadastro){
        this.dataCadastro = dataCadastro; 
    }

    public Pessoa getDonoDoAnimal(){
        return donoDoAnimal; 
    }

    public void setDonoDoAnimal(Pessoa donoDoAnimal){
        this.donoDoAnimal = donoDoAnimal; 
    }

    public String getEspecie(){
        return especie; 
    }

    public void setEspecie(String especie){
        this.especie = especie; 
    }

    abstract void tagAnimal(); 
}
