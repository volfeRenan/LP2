package br.edu.usj.ads.pessoa;

import java.util.ArrayList;

public class Repositorio {
    
    public ArrayList<Contato> getContatos(){
        Contato con0 = new Contato();
        Contato con1 = new Contato();
        Contato con2 = new Contato();
        
        ArrayList<Contato> contatos = new ArrayList();
        
        con0.setNome("Renan");
        con0.setTelefone("8844-5078");
        
        con1.setNome("Maria");
        con1.setTelefone("9122-8778");
        
        con2.setNome("João");
        con2.setTelefone("8405-5564");
        
        
        contatos.add(con0);
        contatos.add(con1);
        contatos.add(con2);
        
        return contatos;
    }

}
