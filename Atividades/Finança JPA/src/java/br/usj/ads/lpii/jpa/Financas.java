package br.usj.ads.lpii.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Financas {

    //variável global  com o modelo
    public static Financas financas = new Financas();
    
    EntityManager em = Persistence
            .createEntityManagerFactory("Financa_JPAPU")
            .createEntityManager();
    private List<Movimentacao> movimentacoes = new ArrayList<>();
    
    
    public void adicionarMovimentacao(Movimentacao m){
//        em.getTransaction().begin();
//        em.persist(m);
//        em.getTransaction().commit();
        m.setId(movimentacoes.size());
        movimentacoes.add(m);
    }
    
    public List<Movimentacao> listarMovimentacoes(){
        return em.createQuery("SELECT m FROM Movimentacao m")
                .getResultList();
//        return movimentacoes;
    }
    
    public Movimentacao buscarMovimentacaoPorId(int id){
        return em.find(Movimentacao.class, id);
//        for(Movimentacao m : movimentacoes)
//          if(m.getId() == id)
//              return m; 
//        return null;
    }
    
    public double totalizar(){
        em.getTransaction().begin();
        Double receitas = (Double) em.createQuery(
                "SELECT SUM(m.valor) FROM Movimentacao m"
                    + "WHERE m.despesa = false")
                .getSingleResult();
        Double despesas = (Double) em.createQuery(
                "SELECT SUM(m.valor) FROM Movimentacao m"
                    + "WHERE m.despesa = true")
                .getSingleResult();
        em.getTransaction().commit();
        if(receitas == null)
            receitas = 0.0;
        if(despesas == null)
            despesas = 0.0;
        return receitas - despesas;
//        double total = 0.0;
//        for(Movimentacao m : movimentacoes)
//              if(m.isDespesa())
//                  total -= m.getValor();
//              else
//                  total += m.getValor();
//        return total;
    }
        
}
