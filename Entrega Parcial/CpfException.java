public class CpfException extends Exception {
    public void messErro(){
        System.out.println("\nO CPF deve conter 11 digitos e conter apenas numeros!");
    }

    public Pessoa corrigirCpf(Pessoa pessoa){
        try{
            pessoa.setCpf(Leitura.entDados("Informe o CPF do dono: "));
        }
        catch(CpfException ce){
            messErro();
            pessoa = corrigirCpf(pessoa);
        }

        return pessoa; 
    }
}
