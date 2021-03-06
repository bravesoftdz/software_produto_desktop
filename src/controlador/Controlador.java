/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import dao.*;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import negocio.*;
import util.ClienteException;

/**
 *
 * @author Ruan
 */
public class Controlador {
    
    CidadeDAO cidDAO;
    ClienteDAO cliDAO;
    ConfiguracoesDAO configDAO;
    PessoafisicaDAO pfDAO;
    PessoajuridicaDAO pjDAO;
    LinhaDAO linhaDAO;
    ProdutoDAO produtoDAO;
    Cliente cli;
    Pessoafisica cliF;
    Pessoajuridica cliJ;
    Produto prod;
    TipoProdutoDAO tipoProdutoDAO;
    PedidoDAO pedidoDAO;
    PedidoItemDAO pedidoItemDAO;
    Pedido PedSelecionado;
    

    public Controlador() throws Exception, SQLException {
        cidDAO = new CidadeDAO();
        cliDAO = new ClienteDAO();
        linhaDAO = new LinhaDAO();
        produtoDAO = new ProdutoDAO();
        pjDAO = new PessoajuridicaDAO();
        pfDAO = new PessoafisicaDAO();
        tipoProdutoDAO = new TipoProdutoDAO();
        pedidoDAO = new PedidoDAO();
        pedidoItemDAO = new PedidoItemDAO();
        configDAO = new ConfiguracoesDAO();
        //pedIt = new Pedidoitem();
    }
    
  
    public int inserirCliente(String nome, String endereco, String numero, String bairro, String complemento, 
            String tel, String cel, Cidade cidade, String cep, char tipo_cliente,String email, String cpf, String cnpj, String ie)
            throws Exception, SQLException {
        cli = new Cliente(cidade, nome, endereco, numero, bairro, complemento,tel, cel,cep, tipo_cliente, email);
        
        cliDAO.inserir(cli);
        if(tipo_cliente == 'J'){
            cliJ = new Pessoajuridica(cli,cnpj, ie);
            pjDAO.inserir(cliJ);

        }else{
            if(tipo_cliente == 'F'){
                cliF = new Pessoafisica(cli,cpf);
                pfDAO.inserir(cliF);
             }
        }
        return cli.getIdCliente();
    }
    
    public void excluirCliente(Cliente cli) throws SQLException, Exception{
        cliDAO.excluir(cli);        
    }
    
    public void inserirCidade(String nome, String uf) throws Exception, SQLException{
        
        Cidade cid = new Cidade(nome,uf);
        cidDAO.inserir(cid);
    }
    
    public void carregarComboCidade(JComboBox combo) throws Exception, SQLException  {
        
        List<Cidade> lista = cidDAO.listarCidades();
        
        combo.setModel( new DefaultComboBoxModel( lista.toArray() ) );
    }
    
    public void carregarComboTipo(JComboBox combo) throws Exception, SQLException  {
        
        List<Tipoproduto> lista = tipoProdutoDAO.listarTipos();
        
        combo.setModel( new DefaultComboBoxModel( lista.toArray() ) );
    }
    
    public void carregarComboLinhas(JComboBox combo) throws Exception, SQLException  {
        List lista = linhaDAO.listarLinhas();
        combo.setModel( new DefaultComboBoxModel( lista.toArray() ) );
    }
    
    public void carregarComboAno(JComboBox combo) throws Exception, SQLException  {
        
    }

    public void pesquisarCidade( JTable tabela, int tipo, String pesq ) throws Exception, SQLException {
        List lista = null;
        
        switch (tipo) {
            case 0: // Pesquisar NOME
                lista = cidDAO.pesquisar(pesq);
                break;
            case 1: // Pesquisar ID
                lista = cidDAO.pesquisarUf(pesq);
                break;
        }
        
        // PERCORRE A LISTA E COLOCA NA TABELA
        Cidade cid;

        // Apagar as linhas da tabela
        ((DefaultTableModel) tabela.getModel()).setRowCount(0);
        Iterator<Cidade> ite = lista.iterator();
        while ( ite.hasNext() ) {
            cid = ite.next();
            ((DefaultTableModel) tabela.getModel()).addRow( cid.toArray() );                        
        }                          
    }
    
    public void excluirCidade(Cidade cid) throws SQLException, Exception{
        cidDAO.excluir(cid);
    }
    
    public void alterarCidade(int id, String nome, String uf) throws Exception, SQLException {
        Cidade cid = new Cidade(nome, uf );
        cid.setIdCidade(id);
        
        cidDAO.alterar(cid);
    }
    
    public List pesquisarCliente( JTable tabela, int tipo, String pesq ) throws Exception, SQLException {
        List lista = null;
        
        switch (tipo) {
            case 0: // Pesquisar NOME
                lista = cliDAO.pesquisar(pesq);
                break;
            case 1: // Pesquisar ID
                int id = Integer.parseInt(pesq);
                lista = cliDAO.pesquisar(id);
                break;
            case 2: // Pesquisar CIDADE
                lista = cliDAO.pesquisarCidade(pesq);
                break;
            
        } 
        if(tabela != null){
            // PERCORRE A LISTA E COLOCA NA TABELA      
            Cliente cli;
            // Apagar as linhas da tabela
            ((DefaultTableModel) tabela.getModel()).setRowCount(0);
            Iterator<Cliente> ite = lista.iterator();
            while ( ite.hasNext() ) {
                cli = ite.next();

                ((DefaultTableModel) tabela.getModel()).addRow( cli.toArray() );                        

            }   
        }else{
            return lista;
        }
        return null;
    }

    
    public int alterarCliente(int id, String nome, String endereco, String numero, String bairro, String complemento,
                    String telFixo, String telCel, Cidade cidade, String cep, char tipo_cliente, String email,
                    String cpf, String cnpj, String ie) throws SQLException, ClienteException, Exception{
        
                    Cliente cli = new Cliente(cidade, nome, endereco, numero, bairro, complemento,telFixo, telCel,cep, tipo_cliente, email);
                    cli.setIdCliente(id);
                                        
                    if( tipo_cliente == 'F'){
                        cliF = new Pessoafisica(cli,cpf);
                        cliF.setIdCliente(cli.getIdCliente());
                        
                        cli.setPessoafisica(cliF);
                    }else{
                        if(tipo_cliente == 'J'){
                            cliJ = new Pessoajuridica(cli,cnpj, ie);
                            cliJ.setIdCliente(cli.getIdCliente());
                            cli.setPessoajuridica(cliJ);
                        }
                    }     
                    cliDAO.alterar(cli);
                    return cli.getIdCliente();
        
    }
    public void inserirLinha( String nome, String descricao) throws Exception, SQLException {
        Linha linha = new Linha(nome, descricao);
        linhaDAO.inserir(linha);
    }
    
    public void pesquisarLinha( JTable tabela, int tipo, String pesq ) throws Exception, SQLException {
        
        List lista = null;
        lista = linhaDAO.pesquisar(pesq);
        
        // PERCORRE A LISTA E COLOCA NA TABELA
        Linha lin;

        // Apagar as linhas da tabela
        ((DefaultTableModel) tabela.getModel()).setRowCount(0);
        
        Iterator<Linha> ite = lista.iterator();
        while ( ite.hasNext() ) {
            lin = ite.next();
            ((DefaultTableModel) tabela.getModel()).addRow( lin.toArray() );                        
        }                          
    }
    
    public void excluirLinha(Linha lin) throws SQLException, Exception{
            linhaDAO.excluir(lin);
    }
    
    public void alterarLinha(int id, String nome, String descricao) throws Exception, SQLException {
        Linha lin = new Linha(nome, descricao);
        lin.setIdLinha(id);
        linhaDAO.alterar(lin);
    }
    
    public void inserirProduto(String descricao, Linha linha, Tipoproduto tipo, float preco, char status) throws Exception, SQLException {
        
        if(status == 'T'){ 
            prod = new Produto(tipo, linha, descricao , preco, true);     
        }else{
            if(status == 'F'){ 
                prod = new Produto(tipo, linha, descricao , preco, false);}
        }
        produtoDAO.inserir(prod);
    }
    
    public void pesquisarProdutos( JTable tabela, int tipo, String pesq, int intuitoPesquisa,JTable tblProdSelecionado) throws Exception, SQLException {
        List lista = null;
        int idProd, eIgual = 0;
      
        switch (tipo) {
            case 0: // Pesquisar NOME
                lista = produtoDAO.pesquisarProduto(pesq);
                break;
            case 1: // Pesquisar Linha
                lista = produtoDAO.pesquisarProdutoPorLinha(pesq);
                break;
            case 2: // Pesquisar Tipo
                lista = produtoDAO.pesquisarProdutoPorTipo(pesq);
                break;      
        }
        // PERCORRE A LISTA E COLOCA NA TABELA
        Produto prod;
        ((DefaultTableModel) tabela.getModel()).setRowCount(0);
        Iterator<Produto> ite = lista.iterator();
        
        // intuitoPesquisa é para saber onde será apresentado o dado obtido. Se for na contrução de um pedido, os produtos
        // cujo status está inativo não deverão aparecer na tabela, ja na tabela de produtos, todos deverão aparecer.
        if(intuitoPesquisa == 2){
            while ( ite.hasNext() ) {
                prod = ite.next();
                if(prod.isStatusVenda() == true){
                    // O For pecorre toda Jtable tblProdSelecionado procurando se o produto a ser inserido já esta na tabela. 
                    for (int i = 0; i < tblProdSelecionado.getRowCount(); i++) {
                        idProd = prod.getIdProduto() ;
                        if(idProd == ((Pedidoitem)tblProdSelecionado.getValueAt(i, 0)).getProduto().getIdProduto()){
                            eIgual =1; // Se eIgual == 1, o produto já esta selecionado, não aparecerá na consulta.  
                        }
                    }
                    if(eIgual == 0){ // SE eIgual == 0, o produto não estava na tabela, então vai ser inserido.
                        ((DefaultTableModel) tabela.getModel()).addRow( prod.toArray() );
                    }
                    eIgual = 0;
                }
            }
        }else{
            while ( ite.hasNext() ) {
                prod = ite.next();
                ((DefaultTableModel) tabela.getModel()).addRow( prod.toArray() );
            }
        }
        
    }
    
    public void excluirProduto(Produto prod) throws SQLException, Exception{
        produtoDAO.excluir(prod);        
    }
    
    public void alterarProduto(int id, String descricao, Linha linha, Tipoproduto tipo, String preco, char habilitar_venda) throws Exception, SQLException {
        if(habilitar_venda == 'T'){
            prod = new Produto(tipo, linha, descricao, Float.parseFloat(preco), true);
            prod.setIdProduto(id);
        }else{
            if(habilitar_venda == 'F'){
                prod = new Produto(tipo, linha, descricao, Float.parseFloat(preco), false);
                prod.setIdProduto(id);
            }
        } 
        produtoDAO.alterar(prod);
    }
    public void criarPedido(Cliente cli, String obs, JTable tabela) throws SQLException, Exception {
        
        float valorTotal = 0;// Soma de preçoParcial, ou seja o valor final do pedido.
        int id;
        Pedidoitem pedIt;
        Pedido pedido = new Pedido(cli, obs);
        
        id = pedidoDAO.inserir(pedido);
        pedido.setIdPedido(id);
        
        int qtnLinha = tabela.getModel().getRowCount();
        
        for (int i = 0; i < qtnLinha; i++) {           
                  pedIt = (Pedidoitem) tabela.getValueAt(i, 0); // O primeiro registro da tabela é um objeto do tipo Pedidoitem
                  pedIt.setPedido(pedido);
                  pedIt.setPrecoUnitario((Float.parseFloat(tabela.getValueAt(i, 3).toString())));// O usuário pode alterar o preço na tabela de produtos Selecionados, por isso não usei o pro.getPreço() direto com o preço que esta no banco de dados;
                  pedIt.setQuantidade(Integer.parseInt(tabela.getValueAt(i, 4).toString()));            
                  pedIt.setPrecoParcial(pedIt.getPrecoUnitario() * pedIt.getQuantidade());
                  valorTotal += pedIt.getPrecoParcial();
                  
                  pedidoItemDAO.inserir(pedIt);        
        }
        pedido.setValorTotal(valorTotal);
        // O preço total do Pedido não é alterado  automaticamente pois ele é inserido no banco antes de ter o valor total, por isso tenho que alterar. 
        pedidoDAO.alterar(pedido);
        PedSelecionado = pedido;
        limpaDadosPedido();
    }
    
    public List pesquisarPedidos( JTable tabela, int tipo, String pesq, String ano ) throws Exception, SQLException {
        List lista = null;
      
        switch (tipo) {
            case 0: // Pesquisar NOME
                lista = pedidoDAO.pesquisarPedidoCliente(pesq);
                break;
            case 1: // Pesquisar Linha
                lista = pedidoDAO.pesquisarPedidoMes(pesq);
                break;
            case 2: // Pesquisar Tipo
                lista = pedidoDAO.pesquisarPedidoHoje();
                break;
            case 3: // Apenas para verificar comissao do mes
                lista = pedidoDAO.apuracaoMes(pesq, ano);
                break;
        }
        if(tabela != null){
            // PERCORRE A LISTA E COLOCA NA TABELA
            Pedido ped;
            ((DefaultTableModel) tabela.getModel()).setRowCount(0);
            Iterator<Pedido> ite = lista.iterator();
            while ( ite.hasNext() ) {
                    ped = ite.next();        
                    ((DefaultTableModel) tabela.getModel()).addRow( ped.toArray() );
            }
        }
        return lista;
    }
    
    public void excluirPedido(Pedido ped) throws SQLException, Exception{
        pedidoDAO.excluir(ped);        
    }
    
    public void excluirPedidoItem(Pedidoitem pedIt) throws SQLException, Exception{
        pedidoItemDAO.excluir(pedIt);
    }
    
    public List pesquisarPedidoItem( JTable tabela, int idPedido ) throws Exception, SQLException {
        List lista = null;
        lista = pedidoItemDAO.pesquisar(idPedido);
    
        if(tabela != null){
            // PERCORRE A LISTA E COLOCA NA TABELA      
            Pedidoitem pedItem;
            // Apagar as linhas da tabela
            ((DefaultTableModel) tabela.getModel()).setRowCount(0);
            Iterator<Pedidoitem> ite = lista.iterator();
            while ( ite.hasNext() ) {
                pedItem = ite.next();
                ((DefaultTableModel) tabela.getModel()).addRow( pedItem.toArray() );
                int lastLine = tabela.getRowCount() - 1;


                if(tabela.getModel().getColumnCount()>5){ // Diferença entre a quantidade de colunas em pedidoDialog e PedidoPosDialog
                    tabela.setValueAt("ItemJaInserido", lastLine, 5);
                }

            }    
        }
        return lista;
    }
    public void alterarPedido(Pedido pedido,Cliente cli, String obs, JTable tabela) throws SQLException, Exception{
        float valorTotal = 0;
        Pedidoitem pedIt;
        
        //Atribuindo novos Valores ao pedido
        pedido.setCliente(cli);
        pedido.setDescricao(obs);

        int qtnLinha = tabela.getModel().getRowCount();
        
        for (int i = 0; i < qtnLinha; i++) { 
            pedIt = (Pedidoitem) tabela.getValueAt(i, 0); // O primeiro registro da tabela é um objeto do tipo Pedidoitem
            pedIt.setPedido(pedido);
            pedIt.setPrecoUnitario((Float.parseFloat(tabela.getValueAt(i, 3).toString())));// O usuário pode alterar o preço na tabela de produtos Selecionados, por isso não usei o pro.getPreço() direto com o preço que esta no banco de dados;
            pedIt.setQuantidade(Integer.parseInt(tabela.getValueAt(i, 4).toString()));            
            pedIt.setPrecoParcial(pedIt.getPrecoUnitario() * pedIt.getQuantidade());
            valorTotal += pedIt.getPrecoParcial();
            if(((tabela.getValueAt(i, 5)).toString()).equals("novoItem")){
                pedidoItemDAO.inserir(pedIt);  
            }else{
                if(((tabela.getValueAt(i, 5)).toString()).equals("ItemJaInserido")){
                   pedidoItemDAO.alterar(pedIt); 
                }
            }
        }
        pedido.setValorTotal(valorTotal);
        pedidoDAO.alterar(pedido);
        PedSelecionado = pedido;
        limpaDadosPedido();
    }
    public Pedido getPedSelecionado(){
        return PedSelecionado;
    }
    
    public void setPedSelecionado(Pedido ped){
        PedSelecionado = ped;
    }
    
    public void limpaDadosPedido(){
        cli = null;
        prod = null;
    }
    
    public void AlterarConfiguracoes(String nomeVendedor, String enderecoVendedor, String emailVendedor, String telFixoVendedor, String telCelVendedor, String emailEnvioPedido) throws Exception, SQLException{
            
        // OBS, por padrão só teremos um registro na tabela Configuracoes, por isso, sempre alteraremos o id 1;
        Configuracoes config = new Configuracoes(nomeVendedor, enderecoVendedor, telFixoVendedor, telCelVendedor, emailVendedor,  emailEnvioPedido);
        
        config.setIdConfiguracoes(1);
           
        configDAO.alterar(config);
        
    }
    
    public Configuracoes consultarConfiguracoes( ) throws Exception, SQLException{
            
        // OBS, por padrão só teremos um registro na tabela Configuracoes, por isso, sempre alteraremos o id 1;
            
        Configuracoes config = configDAO.consultar( );
        
        return config;
    }
    
    
}
