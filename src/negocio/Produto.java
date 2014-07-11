package negocio;
// Generated 09/07/2014 13:56:11 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Produto generated by hbm2java
 */
public class Produto  implements java.io.Serializable {


     private Integer idProduto;
     private Tipoproduto tipoproduto;
     private Linha linha;
     private String descricao;
     private float preco;
     private boolean statusVenda;
     private Set pedidoitems = new HashSet(0);

    public Produto() {
    }

	
    public Produto(float preco, boolean statusVenda) {
        this.preco = preco;
        this.statusVenda = statusVenda;
    }
    public Produto(Tipoproduto tipoproduto, Linha linha, String descricao, float preco, boolean statusVenda, Set pedidoitems) {
       this.tipoproduto = tipoproduto;
       this.linha = linha;
       this.descricao = descricao;
       this.preco = preco;
       this.statusVenda = statusVenda;
       this.pedidoitems = pedidoitems;
    }
   
    //
    public Produto(Tipoproduto tipoproduto, Linha linha, String descricao, float preco, boolean statusVenda) {
        this.tipoproduto = tipoproduto;
        this.linha = linha;
        this.descricao = descricao;
        this.preco = preco;
        this.statusVenda = statusVenda;
    }
    //
    
    public Integer getIdProduto() {
        return this.idProduto;
    }
    
    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
    public Tipoproduto getTipoproduto() {
        return this.tipoproduto;
    }
    
    public void setTipoproduto(Tipoproduto tipoproduto) {
        this.tipoproduto = tipoproduto;
    }
    public Linha getLinha() {
        return this.linha;
    }
    
    public void setLinha(Linha linha) {
        this.linha = linha;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getPreco() {
        return this.preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public boolean isStatusVenda() {
        return this.statusVenda;
    }
    
    public void setStatusVenda(boolean statusVenda) {
        this.statusVenda = statusVenda;
    }
    public Set getPedidoitems() {
        return this.pedidoitems;
    }
    
    public void setPedidoitems(Set pedidoitems) {
        this.pedidoitems = pedidoitems;
    }

    @Override
    public String toString() {
        return descricao;
    }
    public Object[] toArray() {
        return new Object[]{this, linha.getNome(), tipoproduto.getDescricao(), this.getPreco()};
    }


}


