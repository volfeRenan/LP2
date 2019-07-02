package br.edu.usj.ads.lp2;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped
public class BeanCalculadora {
    
    private float a;
    private float b;
    private float resultado;
    private String operacao;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public String efetuarOperacao(){
       switch (this.operacao){
           case "+":
               this.resultado = a + b;
               break;
           case "-":
               this.resultado = a - b;
               break;
           case "*":
               this.resultado = a * b;
               break;
           case "/":
               this.resultado = a / b;
               break;
           default:
                throw new RuntimeException("Essa operação não é suportada");
       }
       return "resultado";
    }
    
    public String somar(){
        resultado = a + b;
        return "resultado";
    }
    
    
}
