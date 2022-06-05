
package com.mycompany.blocksfilmesprojeto;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.directory.InvalidAttributeValueException;

public abstract class Pessoa {
    protected String nome;
    protected int idade;

    //construtores
    public void Pessoa(){
        
    }
    
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        //fazer exceção de idade <18
    }
    
    
}
