package negocio;
// Generated 09/07/2014 13:56:11 by Hibernate Tools 3.6.0


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pedido generated by hbm2java
 */
public class Pedido  implements java.io.Serializable {


     private Integer idPedido;
     private Cliente cliente;
     private String descricao;
     private Float valorTotal;
     private Date data;
     private Set pedidoitems = new HashSet(0);

    public Pedido() {
    }

    public Pedido(Cliente cliente, String descricao, Float valorTotal, Date data, Set pedidoitems) {
       this.cliente = cliente;
       this.descricao = descricao;
       this.valorTotal = valorTotal;
       this.data = data;
       this.pedidoitems = pedidoitems;
    }
   
    //
    public Pedido(Cliente cliente, String descricao) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.data = new Date(System.currentTimeMillis());
    }
    //
    
    public Integer getIdPedido() {
        return this.idPedido;
    }
    
    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Float getValorTotal() {
        return this.valorTotal;
    }
    
    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public Set getPedidoitems() {
        return this.pedidoitems;
    }
    
    public void setPedidoitems(Set pedidoitems) {
        this.pedidoitems = pedidoitems;
    }

    //
    @Override
    public String toString() {
        return Integer.toString(idPedido);
    }
    public Object[] toArray() {
        return new Object[]{this, cliente.getNome(), conveteData(data), valorTotal};
    }

    public String conveteData(Date data){
        //Cria um formato novo para a data
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        //Aplica o novo Formato, transformando em String
        String dataFormatada = dt.format(data);
        return dataFormatada;
    }
    //


}


