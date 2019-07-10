package br.usj.ads.lpii.jpa;

import static br.usj.ads.lpii.jpa.Financas.financas;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanMovimentacao{
    
    private Movimentacao movimentacao;

    public BeanMovimentacao(){
        
    }

    public Movimentacao getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }
        
    public void adicionar(){
        financas.adicionarMovimentacao(movimentacao);
    }
    
    public List<Movimentacao> getListaMovimentacao(){
        return financas.listarMovimentacoes();
    }
    
    public Double getTotal(){
        return financas.totalizar();
    }
    
}
