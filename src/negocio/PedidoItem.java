package negocio;
// Generated 09/07/2014 13:56:11 by Hibernate Tools 3.6.0



/**
 * Pedidoitem generated by hbm2java
 */
public class Pedidoitem  implements java.io.Serializable {


     private Integer idPedidoItem;
     private Pedido pedido;
     private Produto produto;
     private Integer quantidade;
     private Float precoUnitario;
     private Float precoParcial;

    public Pedidoitem() {
    }

    public Pedidoitem(Pedido pedido, Produto produto, Integer quantidade, Float precoUnitario, Float precoParcial) {
       this.pedido = pedido;
       this.produto = produto;
       this.quantidade = quantidade;
       this.precoUnitario = precoUnitario;
       this.precoParcial = precoParcial;
    }
    
    //
    public Pedidoitem(Pedido pedido, Produto produto, Integer quantidade, Float precoUnitario) {    
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
    
    //
   
    public Integer getIdPedidoItem() {
        return this.idPedidoItem;
    }
    
    public void setIdPedidoItem(Integer idPedidoItem) {
        this.idPedidoItem = idPedidoItem;
    }
    public Pedido getPedido() {
        return this.pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Integer getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Float getPrecoUnitario() {
        return this.precoUnitario;
    }
    
    public void setPrecoUnitario(Float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public Float getPrecoParcial() {
        return this.precoParcial;
    }
    
    public void setPrecoParcial(Float precoParcial) {
        this.precoParcial = precoParcial;
    }

    @Override
    public String toString() {
        return produto.getDescricao();
    }
    public Object[] toArray() {
        return new Object[]{this, produto.getLinha().getNome(), produto.getTipoproduto().getDescricao(), this.precoUnitario, this.quantidade};
    }


}


