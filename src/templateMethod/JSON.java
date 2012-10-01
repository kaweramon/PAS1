/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kawe
 */
public class JSON extends Document{

    public JSON(String nome, String profissao, String email){
        super(nome, profissao, email);
    }
    
    protected void preencherTexto() {
        String teste = "{\n"+   "   \"nome\":"+"\""+super.getNome()+"\","+"\n   \"profissao\":"+
                "\""+super.getProfissao()+"\","+"\n   \"email\": "+"\""+super.getEmail()+"\""+"\n}";
        File arquivoJSON = criarArquivo();
        try {
            PrintWriter print = new PrintWriter(new FileWriter(arquivoJSON));
            print.print(teste);
            print.close();
        } catch (IOException ex) {
            Logger.getLogger(JSON.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public String pegarDados(){
        String textoLido = "";
        File arquivoJSON = criarArquivo();
        try {
            FileInputStream inputStream = new FileInputStream(arquivoJSON);
            InputStreamReader inputReader = new InputStreamReader(inputStream);
            BufferedReader buffer = new BufferedReader(inputReader);
            
            try {
                String linha = buffer.readLine();
                while(linha != null){
                    textoLido += linha+"\n";
                    linha=buffer.readLine();
                }
                buffer.close();
            } catch (IOException ex) {
                Logger.getLogger(JSON.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JSON.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return textoLido;
    }
    
    private File criarArquivo(){
        File arquivoJSON = new File("ArquivoJSON.json");
        return arquivoJSON;
    }
    
}
