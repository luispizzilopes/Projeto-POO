public class EntradaDadosAnimais {
    public Cachorro dadosCachorro(Cachorro cachorro){
        cachorro.setNome(Leitura.entDados("Informe o nome do cachorro: "));
        try{
            cachorro.setIdade(Integer.parseInt(Leitura.entDados("Informe a idade do cachorro: ")));
        }
        catch(IdadeException ie){
            ie.messErro();
            cachorro = (Cachorro)ie.corrigirIdade(cachorro); 
        }
        cachorro.setRacaCachorro(Leitura.entDados("Informe a raca do cachorro: "));
        cachorro.setDataCadastro(Leitura.entDados("Informe a data de cadastro: "));
        cachorro.setPorte(Leitura.entDados("Informe o porte do animal: "));
        cachorro.setEspecie("Canino");
        cachorro.getDonoDoAnimal().setNome(Leitura.entDados("Informe o nome do dono do cachorro: "));
        try{
            cachorro.getDonoDoAnimal().setCpf(Leitura.entDados("Informe o CPF do dono: "));
        }
        catch(CpfException ce){
            ce.messErro();
            cachorro.setDonoDoAnimal(ce.corrigirCpf(cachorro.getDonoDoAnimal())); 
        }
        cachorro.getDonoDoAnimal().getEndereco().setRua(Leitura.entDados("Informe o nome da rua: "));
        cachorro.getDonoDoAnimal().getEndereco().setBairro(Leitura.entDados("Informe o nome do bairro: "));
        cachorro.getDonoDoAnimal().getEndereco().setNumero(Integer.parseInt(Leitura.entDados("Informe o numero da casa: "))); 
      
        return cachorro; 
    }

    public Gato dadosGato(Gato gato){
        gato.setNome(Leitura.entDados("Informe o nome do gato: "));
        try{
            gato.setIdade(Integer.parseInt(Leitura.entDados("Informe a idade do gato: ")));
        }
        catch(IdadeException ie){
            ie.messErro();
            gato = (Gato)ie.corrigirIdade(gato);
        }
        gato.setRacaGato(Leitura.entDados("Informe a raça do gato: "));
        gato.setDataCadastro(Leitura.entDados("Informe a data de cadastro: "));
        gato.setPelagem(Leitura.entDados("Informe a pelagem do gato: "));
        gato.setEspecie("Felino");
        gato.getDonoDoAnimal().setNome(Leitura.entDados("Informe o nome do dono do gato: "));
        try{
            gato.getDonoDoAnimal().setCpf(Leitura.entDados("Informe o CPF do dono: "));
        }
        catch(CpfException ce){
            ce.messErro();
            gato.setDonoDoAnimal(ce.corrigirCpf(gato.getDonoDoAnimal())); 
        }
        gato.getDonoDoAnimal().getEndereco().setRua(Leitura.entDados("Informe o nome da rua: "));
        gato.getDonoDoAnimal().getEndereco().setBairro(Leitura.entDados("Informe o nome do bairro: "));
        gato.getDonoDoAnimal().getEndereco().setNumero(Integer.parseInt(Leitura.entDados("Informe o numero da casa: ")));

        return gato; 
    }

    public Cavalo dadosCavalo(Cavalo cavalo){
        cavalo.setNome(Leitura.entDados("Informe o nome do cavalo: "));
        try{
            cavalo.setIdade(Integer.parseInt(Leitura.entDados("Informe a idade do cavalo: ")));
        }
        catch(IdadeException ie){
            ie.messErro();
            cavalo = (Cavalo)ie.corrigirIdade(cavalo); 
        }
        cavalo.setAltura(Double.parseDouble(Leitura.entDados("Informe a altura do cavalo: ")));
        cavalo.setPeso(Double.parseDouble(Leitura.entDados("Informe o peso do cavalo: ")));
        cavalo.setTransporte(Boolean.parseBoolean(Leitura.entDados("Informe se o cavalo e utilizado para transporte (True/False): ")));
        cavalo.setDataCadastro(Leitura.entDados("Informe a data de cadastro: "));
        cavalo.setEspecie("Equidae");
        cavalo.getDonoDoAnimal().setNome(Leitura.entDados("Informe o nome do dono do cavalo: "));
        try{
            cavalo.getDonoDoAnimal().setCpf(Leitura.entDados("Informe o CPF do dono: "));
        }
        catch(CpfException ce){
            ce.messErro();
            cavalo.setDonoDoAnimal(ce.corrigirCpf(cavalo.getDonoDoAnimal())); 
        }
        cavalo.getDonoDoAnimal().getEndereco().setRua(Leitura.entDados("Informe o nome da rua: "));
        cavalo.getDonoDoAnimal().getEndereco().setBairro(Leitura.entDados("Informe o nome do bairro: "));
        cavalo.getDonoDoAnimal().getEndereco().setNumero(Integer.parseInt(Leitura.entDados("Informe o numero da casa: ")));

        return cavalo; 
    }
}