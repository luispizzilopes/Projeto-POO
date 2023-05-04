//Nome: Luis Felipe Pizzi Lopes - RA: 2503522
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Leitura {
    public static String entDados(String rotulo){
        System.out.println(rotulo);
        String resp = "";

        InputStreamReader tec = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(tec);

        try{
            resp = buff.readLine();
        }
        catch(IOException ex){
            System.out.println("Erro!");
        }

        return resp;
    }
}