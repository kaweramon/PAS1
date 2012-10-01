/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

/**
 *
 * @author Kawe
 */
public class Main {
    
    public static void main(String[] args) {
        Document html = new HTML("nome html", "profissao html", "email html");
        Document markdown = new MarkDown("nome markdown", "profissao markdown", "email markdown");
        Document json = new JSON("nome json", "profissao json", "email json");
        html.preencherTexto();
        System.out.println(html.pegarDados());
        json.preencherTexto();
        System.out.println(json.pegarDados());
        markdown.preencherTexto();
        System.out.println(markdown.pegarDados());
        
    }
}
