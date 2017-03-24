package controle.zeismoi.com.br.controle;

import java.util.Date;
import java.util.List;

/**
 * Created by ovs on 23/03/2017.
 */

public class Venda {

    private long id;
    private Date dataVenda;
    private Cliente cliente;
    private List<VendaDetalhes> vendaDetalhes;
    private long valor;
    private long desconto;
    private long total;
    private long restante;

    public long getId() {
        return id;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public long getDesconto() {
        return desconto;
    }

    public void setDesconto(long desconto) {
        this.desconto = desconto;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<VendaDetalhes> getVendaDetalhes() {
        return vendaDetalhes;
    }

    public void setVendaDetalhes(List<VendaDetalhes> vendaDetalhes) {
        this.vendaDetalhes = vendaDetalhes;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getRestante() {
        return restante;
    }

    public void setRestante(long restante) {
        this.restante = restante;
    }


}
