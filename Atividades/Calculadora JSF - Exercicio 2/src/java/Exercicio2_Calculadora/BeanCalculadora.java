package Exercicio2_Calculadora;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped
public class BeanCalculadora {
    
    private Double a;
    private Double b;
    private Double resultado;
    private String operacao;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    
    public void setResultado(double resultado) {
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
    
    
    
}
