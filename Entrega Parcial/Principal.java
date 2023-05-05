//Nome: Luis Felipe Pizzi Lopes - RA: 2503522
public class Principal{
    public static void main(String[] arg) {

       CadastroAnimais cadastros = CadastroAnimais.getCadastroAnimais();
       char continuar;
       System.out.println("=================================================");
       System.out.println("SEJA BEM-VINDO AO SISTEMA DE CLINICA VETERINARIA");
       System.out.println("=================================================");
       do{
            int opc; 
            int opcInterna;
            System.out.println("\n=================================================");
            System.out.println("\nInforme a opcao que deseja: ");
            System.out.println("\n=================================================");
            System.out.println("\n1 - Cadastrar novo animal");
            System.out.println("2 - Buscar informacoes de um cadastro");
            System.out.println("3 - Alterar informacoes de um cadastro");
            System.out.println("4 - Deletar um cadastro\n");

            opc = Integer.parseInt(Leitura.entDados("Informe a opcao que deseja: ")); 

            switch(opc)
            {
                case 1 : 
                    Console.cls();
                    System.out.println("\n1- Cadastrar Cachorro");
                    System.out.println("2- Cadastrar Gato");
                    System.out.println("3- Cadastrar Cavalo");
                    opcInterna = Integer.parseInt(Leitura.entDados("Informe a opcao que deseja: "));
                    
                    if(opcInterna == 1){
                        cadastros.cadastrarNovoCachorro();
                    } else if(opcInterna == 2){
                        cadastros.cadastrarNovoGato();
                    }else if(opcInterna == 3){
                        cadastros.cadastrarNovoCavalo();
                    }else{
                        System.out.println("Opcao invalida!\n");
                    }
                    break; 
                case 2 : 
                    Console.cls();
                    System.out.println("\n1- Buscar Cachorro");
                    System.out.println("2- Buscar Gato");
                    System.out.println("3- Buscar Cavalo");
                    opcInterna = Integer.parseInt(Leitura.entDados("Informe a opcao que deseja: "));
                    
                    if(opcInterna == 1){
                        cadastros.imprimirCachorro();
                    } else if(opcInterna == 2){
                        cadastros.imprimirGato();
                    }else if(opcInterna == 3){
                        cadastros.imprimirCavalo();
                    }else{
                        System.out.println("Opcao invalida!\n");
                    }
                    break; 
                case 3 : 
                    Console.cls();
                    System.out.println("\n1- Alterar Cachorro");
                    System.out.println("2- Alterar Gato");
                    System.out.println("3- Alterar Cavalo");
                    opcInterna = Integer.parseInt(Leitura.entDados("Informe a opcao que deseja: "));

                    if(opcInterna == 1){
                        cadastros.alterarCachorro();
                    } else if(opcInterna == 2){
                        cadastros.alterarGato();
                    }else if(opcInterna == 3){
                        cadastros.alterarCavalo();
                    }else{
                        System.out.println("Opcao invalida!\n");
                    }
                    break; 
                case 4 :
                    Console.cls();
                    System.out.println("\n1- Deletar Cachorro");
                    System.out.println("2- Deletar Gato");
                    System.out.println("3- Deletar Cavalo");
                    opcInterna = Integer.parseInt(Leitura.entDados("Informe a opcao que deseja: "));

                    if(opcInterna == 1){
                        cadastros.deletarCachorro();
                    } else if(opcInterna == 2){
                        cadastros.deletarGato();
                    }else if(opcInterna == 3){
                        cadastros.deletarCavalo();
                    }else{
                        System.out.println("Opcao invalida!\n");
                    }
                    break;   
            }
            continuar = Leitura.entDados("\nDeseja continuar? (S/N)").toUpperCase().charAt(0); 
            Console.cls();
       } while(continuar == 'S'); 
    }
}