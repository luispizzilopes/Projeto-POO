package entregafinal;
//Nome: Luis Felipe Pizzi Lopes - RA: 2503522

import javax.swing.JOptionPane;

public class CpfException extends Exception {
    public void messErro(){
        JOptionPane.showMessageDialog(null, "O CPF deve conter 11 digitos e conter apenas numeros!");
    }

    public Pessoa corrigirCpf(Pessoa pessoa){
        try{
            pessoa.setCpf(JOptionPane.showInputDialog(null, "Digite os 11 digitos do CPF"));
        }
        catch(CpfException ce){
            messErro();
            pessoa = corrigirCpf(pessoa);
        }

        return pessoa; 
    }
}
