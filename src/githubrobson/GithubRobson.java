/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubrobson;
import javax.swing.JOptionPane;

public class GithubRobson {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* Scanner leia = new Scanner(System.in);
        String nome = leia.nextLine();
        System.out.println(nome+"Bem-vindo ao GitHub");
       */
        String nome = JOptionPane.showInputDiaLog
            (null, "Digite seu nome: ");
        JOptionPane.showMenssageDialog
            (null, nome+"Bem-vindo ao GitHub");
        System.exit(0);
       
        
        
        
        
    }
    
}
