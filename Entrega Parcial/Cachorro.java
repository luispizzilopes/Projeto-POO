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

    //Sobrescrita
    @Override
    public void tagAnimal() {
        System.out.println("=================TAG CACHORRO - " + getNome() + "=================");
        System.out.println("\nNome: " + getNome() +
                        "\nIdade: " + getIdade() +
                        "\nData de Cadastro: " + getDataCadastro() +
                        "\nPorte: " + porte + 
                        "\nRaça cachorro: " + racaCachorro +
                        "\n\nDADOS DO DONO: " +
                        "\nNome: " + getDonoDoAnimal().getNome() +
                        "\nCPF: " + getDonoDoAnimal().getCpf() + 
                        "\nRua: " + getDonoDoAnimal().getEndereco().getRua() +
                        "\nNumero: " + getDonoDoAnimal().getEndereco().getNumero() + 
                        "\nBairro: " + getDonoDoAnimal().getEndereco().getBairro()); 
    }
}
