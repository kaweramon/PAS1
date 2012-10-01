/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

import com.sun.xml.internal.ws.api.pipe.Fiber;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kawe
 */
public class HTML extends Document{
    
    
    public HTML(String nome, String profissao, String email){
        super(nome, profissao, email);
    }
    
    protected void preencherTexto() {
        PrintWriter print = null;
        
        File arquivoHTML = criarArquivo();
        String teste = "<html>\n"+"   <body>\n"+"       <h1>"+super.getNome()+"</h1>\n"+
                   "       <p>"+super.getProfissao()+"</p>\n"+
                   "       <p>"+super.getEmail()+"</p>\n"+
                   "   </body>\n"+"</html>";
        try {
            print = new PrintWriter(new FileWriter(arquivoHTML));
            print.print(teste);
        } catch (IOException ex) {
            Logger.getLogger(HTML.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            print.flush();
            print.close();
        }
         
    }
    
    public String pegarDados() {
        String textoLido="";
        
        File arquivoHTML = criarArquivo();
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(arquivoHTML));
            try {
                String linha = buffer.readLine();
                
                while(linha != null){
                    textoLido+=linha+"\n";
                    linha = buffer.readLine();
                }
                
            } catch (IOException ex) {
                Logger.getLogger(HTML.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HTML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return textoLido;
    }
    
    private File criarArquivo(){
        File arquivoHTML = new File("arquivoHTML.html");
        return arquivoHTML;
    }
    
    
    
}
