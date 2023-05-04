public class IdadeException extends Exception{
    public void messErro(){
        System.out.println("\nA idade do animal deve estar entre 0 e 50 anos");
    }

    public Animal corrigirIdade(Animal animal){
        try{
            animal.setIdade(Integer.parseInt(Leitura.entDados("Informe a idade do animal: ")));
        }
        catch(IdadeException ie){
            messErro();
            animal = ie.corrigirIdade(animal); 
        }

        return animal; 
    }
}
