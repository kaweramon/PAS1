/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

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
public class MarkDown extends Document{

    public MarkDown(String nome, String profissao, String email){
        super(nome, profissao, email);
    }
    
    protected void preencherTexto() {
        String teste = "# "+super.getNome()+"\nProfissão "
                +super.getProfissao()+"\nEmail "+super.getEmail()+"\n";
        
        PrintWriter print = null;
        File arquivoMarkDown = criarArquivo();
        try {
            print = new PrintWriter(new FileWriter(arquivoMarkDown));
            print.print(teste);
        } catch (IOException ex) {
            Logger.getLogger(HTML.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            print.flush();
            print.close();
        }
    }
    public String pegarDados(){
        String textoLido = "";
        File arquivoMarkDown = criarArquivo();
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(arquivoMarkDown));
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
        File arquivoMarkDown = new File("ArquivoMarkDown.markdown");
        return arquivoMarkDown;
        
    }
    
}
