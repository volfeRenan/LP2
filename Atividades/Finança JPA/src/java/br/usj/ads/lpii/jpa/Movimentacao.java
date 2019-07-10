package br.usj.ads.lpii.jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Movimentacao implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private boolean despesa;//se false, é receita
    private double valor;
    private String titulo;
    
    public Movimentacao(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDespesa() {
        return despesa;
    }

    public void setDespesa(boolean despesa) {
        this.despesa = despesa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
