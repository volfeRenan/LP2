package br.edu.usj.ads.jsf;

import java.util.ArrayList;
import java.util.List;
//import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.faces.bean.RequestScoped;

@ManagedBean
//@RequestScoped
//@ApplicationScoped
@SessionScoped
public class BeanCalculadoraHistorico {

    private List<String> historico = new ArrayList<>();
    private int a;
    private int b;
    private int c;
    private int resultado;
    private int operacao;
    
    public List<String> getHistorico(){
        return historico;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }
    
    
        
    public void calcular(){
        switch (this.operacao){
           case 0:
               this.resultado = a + b;
               historico.add(a + " + " + b + " = " + resultado);
               break;
           case 1:
               this.resultado = a - b;
               historico.add(a + " - " + b + " = " + resultado);
               break;
       }
       
    }
    
    public void limparHistorico(){
        historico.clear();
    }
    
    public void limparPorIndice(){
        this.c = 1-1;
        historico.remove(c);
    }
}
