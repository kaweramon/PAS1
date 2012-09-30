/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import javax.imageio.IIOException;

/**
 *
 * @author Kawe
 */
public class Log {
    
    private static Log log;
    private File file = new File("log.txt");
    
    private Log(){}
    
    public static Log getInstance(){
        if(log == null){
            log = new Log();            
        }else{
            return log;
        }
        return log;
    }
    
    public String imprimir() throws FileNotFoundException, IOException{
        String toReturn ="";
        File arquivo = new File("log.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(arquivo));
        toReturn += buffer.readLine();
        while(buffer.ready()){
            toReturn += "\n"+ buffer.readLine();
        }
        buffer.close();
        return  toReturn;
    }
    
    public void gravar(String gravar) throws FileNotFoundException, IOException{
        
        PrintWriter print = new PrintWriter(new FileWriter(file));
        
        
        if (leitura() == "") {
            print.print(gravar);
        }else{
            String texto = leitura();
            texto += "\n"+ gravar;
            print.print(texto);            
        }
        print.flush();
        print.close();
        //copiaArquivo("log.txt", "todosLogs.txt");
        
        /*PrintWriter print = new PrintWriter(new FileWriter(new File("log.txt")));
        if (leitura() == "") {
            print.write(gravar);
        }else{
            print.write(leitura()+"\n");
            print.write(gravar);
        }
        print.close();*/
    }
    public void copiaArquivo(String fonte,String destino) throws FileNotFoundException, IOException{

       
            File fileFonte = new File(fonte);
            File fileDestino = new File(destino);
            if(fileFonte.exists() && !fileDestino.exists()){
                InputStream in = new FileInputStream(fileFonte);
                OutputStream out = new FileOutputStream(fileDestino);
                byte [] buff = new byte [8192];
                int tam = in.read(buff);
                while(tam != -1){
                    out.write(buff,0,tam);
                    tam = in.read(buff);
                }
                in.close();
                out.flush();
                out.close();
                
            }


        



    }
    
    
    private String leitura() throws FileNotFoundException, IOException{
        if(this.file == null){
            this.file = new File("log.txt");
        }
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String linha = buffer.readLine();
        int tamanhoArquivo = (int) file.length();
        StringBuffer sb = new StringBuffer(tamanhoArquivo);
        String toReturn = "";
        
        while( linha != null  ){
            sb.append(linha).append("\n");
            linha  = buffer.readLine();
        }
        try {
            buffer.close();
        } catch (IOException e) {
            throw new IOException();
        }
        
        return toReturn;
    }
    
}
