package entregafinal;

//Nome: Luis Felipe Pizzi Lopes - RA: 2503522
import java.util.ArrayList;
import java.util.List;

public class BDAnimais{
    private static BDAnimais cadastroAnimais; 
    private List<Cachorro> listaCachorros = new ArrayList<Cachorro>();
    private List<Gato> listaGatos = new ArrayList<Gato>(); 
    private List<Cavalo> listaCavalos = new ArrayList<Cavalo>();

    private BDAnimais(){}

    public static BDAnimais getCadastroAnimais(){
        if(cadastroAnimais == null){
            cadastroAnimais = new BDAnimais(); 
            return cadastroAnimais; 
        }

        return cadastroAnimais; 
    }
    
    public List<Cachorro> getListaCachorros(){
        return listaCachorros; 
    }
    
    public void adicionarCachorro(Cachorro cachorro){
        if(cachorro != null){
            listaCachorros.add(cachorro); 
        }
    }
    
    public void excluirCachorro(Cachorro cachorro){
        if(cachorro != null){
            listaCachorros.remove(cachorro); 
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
    
    public List<Gato> getListaGatos(){
        return listaGatos; 
    }
    
    public void adicionarGato(Gato gato){
        if(gato != null){
            listaGatos.add(gato); 
        }
    }
    
    public void excluirGato(Gato gato){
        if(gato != null){
            listaGatos.remove(gato); 
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
    
    public List<Cavalo> getListaCavalos(){
        return listaCavalos; 
    }
    
    public void adicionarCavalo(Cavalo cavalo){
        if(cavalo != null){
            listaCavalos.add(cavalo); 
        }
    }
    
    public void excluirCavalo(Cavalo cavalo){
        if(cavalo != null){
            listaCavalos.remove(cavalo); 
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
