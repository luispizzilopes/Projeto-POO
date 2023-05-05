//Nome: Luis Felipe Pizzi Lopes - RA: 2503522
public class Cavalo extends Animal implements IConsulta{

   private double altura;
   private double peso; 
   private boolean transporte; 

    public Cavalo(){
        altura = 0; 
        peso = 0;
        transporte = false; 
    }

    //Sobrecarga
    public Cavalo(String nome, int idade, String dataCadastro, Pessoa donoDoAnimal, String especie, double altura, double peso, boolean transporte){
        super(nome, idade, dataCadastro, donoDoAnimal, especie);
        this.altura = altura;
        this.peso = peso; 
        this.transporte = transporte; 
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

    public boolean getTransporte(){
        return transporte;
    }

    public void setTransporte(boolean transporte){
        this.transporte = transporte;
    }

    //Sobrescrita
    @Override
    public double valorConsulta() {
        return 300; 
    }

    //Sobrescrita
    @Override
    public void tagAnimal() {
        System.out.println("================= TAG CAVALO - " + getNome() + " =================");
        System.out.println("\nNome: " + getNome() +
                        "\nIdade: " + getIdade() +
                        "\nData de Cadastro: " + getDataCadastro() +
                        "\nAltura do cavalo: " + altura +
                        "\nPeso do cavalo: " + peso + 
                        "\nUtilizado para transporte: " + transporte +
                        "\n\nDADOS DO DONO: " +
                        "\nNome: " + getDonoDoAnimal().getNome() +
                        "\nCPF: " + getDonoDoAnimal().getCpf() + 
                        "\nRua: " + getDonoDoAnimal().getEndereco().getRua() +
                        "\nNumero: " + getDonoDoAnimal().getEndereco().getNumero() + 
                        "\nBairro: " + getDonoDoAnimal().getEndereco().getBairro() + 
                        "\n\nVALOR CONSULTAS: " + valorConsulta() + "\n");  
    }
}
