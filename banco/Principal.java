package br.com.banco;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int numero;
        double saldo,limite, redimento;

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Banco:\n<1>Conta Corrente\n<2>Conta Poupanca\n<3>Sair"));

            switch (opcao){
                case 1: numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:"));
                        saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
                        limite = Double.parseDouble(JOptionPane.showInputDialog("Limite:"));
                        ContaCorrente cc1 = new ContaCorrente(numero,saldo,limite);
                        JOptionPane.showMessageDialog(null,"Saldo"+cc1.getSaldo() + "\nSaldo com o limite:"+cc1.consultaSaldoTotal(),"Conta Corrente",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2: numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:"));
                        saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
                        redimento = Double.parseDouble(JOptionPane.showInputDialog("Rendimento:"));
                        ContaPoupanca cp1 = new ContaPoupanca(numero,saldo,redimento);
                        cp1.atualizaRendimento();
                        JOptionPane.showMessageDialog(null,"Saldo" +cp1.getSaldo() +"\nSaldo com o rendimento:"+cp1.getRendimento(),"ContaPoupanca",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Escolha Invalida","Erro",JOptionPane.ERROR_MESSAGE);
            }
    }
}
