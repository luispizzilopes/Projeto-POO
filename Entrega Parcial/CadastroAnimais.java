import java.util.ArrayList;
import java.util.List;

public class CadastroAnimais{
    private static CadastroAnimais cadastroAnimais; 
    private List<Cachorro> listaCachorros = new ArrayList<Cachorro>();
    private List<Gato> listaGatos = new ArrayList<Gato>(); 
    private List<Cavalo> listaCavalos = new ArrayList<Cavalo>();
    private EntradaDadosAnimais entDadosAnimais = new EntradaDadosAnimais(); 

    private CadastroAnimais(){}

    public static CadastroAnimais getCadastroAnimais(){
        if(cadastroAnimais == null){
            cadastroAnimais = new CadastroAnimais(); 
            return cadastroAnimais; 
        }

        return cadastroAnimais; 
    }

    public void cadastrarNovoCachorro(){
        Cachorro cachorro = new Cachorro();
        cachorro = entDadosAnimais.dadosCachorro(cachorro);
        if(buscarCachorro(cachorro.getNome()) == null){
            listaCachorros.add(cachorro);
            System.out.println("\nCadastro feito com sucesso!");
        } else{
            System.out.println("Não foi possivel cadastrar o cachorro pois ja existe um cadastro com esse nome");
        }
    }

    public void alterarCachorro(){
        String nomeAlterar = Leitura.entDados("Informe o nome do cachorro que deseja alterar: "); 
        if(buscarCachorro(nomeAlterar) != null){
            Cachorro cachorro = buscarCachorro(nomeAlterar); 
            cachorro = entDadosAnimais.dadosCachorro(cachorro); 
            System.out.println("\nAlteracao feita com sucesso!");
        } else{
            System.out.println("\nNao foi possivel localizar um cadastro com o nome informado!");
        }
    }

    public void imprimirCachorro(){
        String nomeImprimir = Leitura.entDados("Informe o nome do cachorro que deseja pesquisar: ");
        if(buscarCachorro(nomeImprimir) != null){
            Cachorro cachorro = buscarCachorro(nomeImprimir); 
            cachorro.tagAnimal();
        }else{
            System.out.println("\nNao foi possivel localizar um cadastro com o nome informado!");
        }
    }

    public void deletarCachorro(){
        String nomeDeletar = Leitura.entDados("Informe o nome do cachorro que deseja deletar: ");
        if(buscarCachorro(nomeDeletar) != null){
            Cachorro cachorro = buscarCachorro(nomeDeletar);
            listaCachorros.remove(cachorro); 
            System.out.println("\nCadastro deletado com sucesso!");
        }else{
            System.out.println("\nNao foi possivel localizar um cadastro com o nome informado!");
        }
    }

    public Cachorro buscarCachorro(String nome){
        for(Cachorro cachorro : listaCachorros){
            if(cachorro.getNome().equals(nome)){
                return cachorro;
            }
        }
        return null; 
    }

    public void cadastrarNovoGato(){
        Gato gato = new Gato(); 
        gato = entDadosAnimais.dadosGato(gato);
        if(buscarGato(gato.getNome()) == null){
            listaGatos.add(gato);
            System.out.println("\nCadastro feito com sucesso!");
        } else{
            System.out.println("Não foi possivel cadastrar o cachorro pois ja existe um cadastro com esse nome");
        }
    }

    public void alterarGato(){
        String nomeAlterar = Leitura.entDados("Informe o nome do gato que deseja alterar: "); 
        if(buscarGato(nomeAlterar) != null){
            Gato gato = buscarGato(nomeAlterar); 
            gato = entDadosAnimais.dadosGato(gato); 
            System.out.println("\nAlteracao feita com sucesso!");
        } else{
            System.out.println("\nNao foi possivel localizar um cadastro com o nome informado!");
        }
    }

    public void imprimirGato(){
        String nomeImprimir = Leitura.entDados("Informe o nome do gato que deseja pesquisar: ");
        if(buscarGato(nomeImprimir) != null){
            Gato gato = buscarGato(nomeImprimir); 
            gato.tagAnimal();
        }else{
            System.out.println("\nNao foi possivel localizar um cadastro com o nome informado!");
        }
    }

    public void deletarGato(){
        String nomeDeletar = Leitura.entDados("Informe o nome do gato que deseja deletar: ");
        if(buscarGato(nomeDeletar) != null){
            Gato gato = buscarGato(nomeDeletar);
            listaGatos.remove(gato); 
            System.out.println("\nCadastro deletado com sucesso!");
        }else{
            System.out.println("\nNao foi possivel localizar um cadastro com o nome informado!");
        }
    }

    public Gato buscarGato(String nome){
        for(Gato gato : listaGatos){
            if(gato.getNome().equals(nome)){
                return gato;
            }
        }
        return null; 
    }

    public void cadastrarNovoCavalo(){
        Cavalo cavalo = new Cavalo();
        cavalo = entDadosAnimais.dadosCavalo(cavalo);
        if(buscarCavalo(cavalo.getNome()) == null){
            listaCavalos.add(cavalo);
            System.out.println("\nCadastro feito com sucesso!");
        } else{
            System.out.println("Nao foi possivel cadastrar o cavalo pois ja existe um cadastro com esse nome");
        }
    }

    public void alterarCavalo(){
        String nomeAlterar = Leitura.entDados("Informe o nome do cavalo que deseja alterar: "); 
        if(buscarCavalo(nomeAlterar) != null){
            Cavalo cavalo = buscarCavalo(nomeAlterar); 
            cavalo = entDadosAnimais.dadosCavalo(cavalo); 
            System.out.println("\nAlteracao feita com sucesso!");
        } else{
            System.out.println("\nNao foi possivel localizar um cadastro com o nome informado!");
        }
    }

    public void imprimirCavalo(){
        String nomeImprimir = Leitura.entDados("Informe o nome do cavalo que deseja pesquisar: ");
        if(buscarCavalo(nomeImprimir) != null){
            Cavalo cavalo = buscarCavalo(nomeImprimir); 
            cavalo.tagAnimal();
        }else{
            System.out.println("\nNao foi possivel localizar um cadastro com o nome informado!");
        }
    }

    public void deletarCavalo(){
        String nomeDeletar = Leitura.entDados("Informe o nome do cavalo que deseja deletar: ");
        if(buscarCavalo(nomeDeletar) != null){
            Cavalo cavalo = buscarCavalo(nomeDeletar);
            listaCavalos.remove(cavalo); 
            System.out.println("\nCadastro deletado com sucesso!");
        }else{
            System.out.println("\nNao foi possivel localizar um cadastro com o nome informado!");
        }
    }

    public Cavalo buscarCavalo(String nome){
        for(Cavalo cavalo : listaCavalos){
            if(cavalo.getNome().equals(nome)){
                return cavalo;
            }
        }
        return null; 
    }
}
