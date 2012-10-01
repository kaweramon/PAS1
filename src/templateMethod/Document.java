/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

import java.io.File;

/**
 *
 * @author Kawe
 */
public abstract class Document {
    
    private String nome;
    private String profissao;
    private String email;
    
    public Document(String nome, String profissao, String email){
        this.nome = nome;
        this.profissao = profissao;
        this.email = email;
    }
    

    protected abstract void preencherTexto();
    
    public void criarArquivo(Document document){
       /* if (document instanceof HTML) {
            File arquivoHTML = new File("ArquivoHTML.html");
        }
        if(document instanceof MarkDown){
            File arquivoMarkDown = new File("ArquivoMarkDown.markdown");
        }
        if (document instanceof JSON) {
            File arquivoJSON = new File("ArquivoJSON.json");
        }*/
    }
    public String pegarDados(){
        return "";
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
