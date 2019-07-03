package Exercicio1_Calculos;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BeanCalculadora {

    private int a;
    private int b;
    private int resultado;
    private String operacao;

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

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    
    
    public String somar(){
        resultado = a + b;
        this.setOperacao("+");
        return "resultado";
    }
    
    public String subtrair(){
        resultado = a - b;
        this.setOperacao("-");
        return "resultado";
    }
    
    public String multiplicar(){
        resultado = a * b;
        this.setOperacao("*");
        return "resultado";
    }
    
    public String dividir(){
        resultado = a / b;
        this.setOperacao("/");
        return "resultado";
    }
    
}
