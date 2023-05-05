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

    public String racaGato(){
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

    //Sobrescrita
    @Override
    public void tagAnimal() {
        System.out.println("================= TAG GATO - " + getNome() + " =================");
        System.out.println("\nNome: " + getNome() +
                        "\nIdade: " + getIdade() +
                        "\nData de Cadastro: " + getDataCadastro() +
                        "\nRaça do gato: " + racaGato +
                        "\nPelagem: " + pelagem + 
                        "\n\nDADOS DO DONO: " +
                        "\nNome: " + getDonoDoAnimal().getNome() +
                        "\nCPF: " + getDonoDoAnimal().getCpf() + 
                        "\nRua: " + getDonoDoAnimal().getEndereco().getRua() +
                        "\nNumero: " + getDonoDoAnimal().getEndereco().getNumero() + 
                        "\nBairro: " + getDonoDoAnimal().getEndereco().getBairro() +
                        "\n\nVALOR CONSULTAS: " + valorConsulta() + "\n");  
    }
}
