package entregafinal;
//Nome: Luis Felipe Pizzi Lopes - RA: 2503522

import javax.swing.JOptionPane;

public class NumeroException extends Exception{
    public void messErro(){
        JOptionPane.showMessageDialog(null, "O número da casa deve estar entre 1 e 9999");
    }

    public Endereco corrigirNumCasa(Endereco endereco){
        try{
            endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da casa novamente")));
        }
        catch(NumeroException ne){
            messErro();
            endereco = corrigirNumCasa(endereco);
        }

        return endereco; 
    }
}
