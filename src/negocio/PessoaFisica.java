package negocio;
// Generated 18/05/2014 14:44:29 by Hibernate Tools 3.6.0



/**
 * Pessoafisica generated by hbm2java
 */
public class Pessoafisica  implements java.io.Serializable {


     private int idCliente;
     private Cliente cliente;
     private String cpf;

    public Pessoafisica() {
    }

	
    public Pessoafisica(Cliente cliente) {
        this.cliente = cliente;
    }
    public Pessoafisica(Cliente cliente, String cpf) {
       this.cliente = cliente;
       this.cpf = cpf;
    }
   
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }




}


