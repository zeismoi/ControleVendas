package controle.zeismoi.com.br.controle;

/**
 * Created by ovs on 23/03/2017.
 */

public class Fornecedor {

    private long id;
    private String nome;
    private String endereco;
    private String cidade;
    private String uf;
    private String telefone;
    private long latitute;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getLatitute() {
        return latitute;
    }

    public void setLatitute(long latitute) {
        this.latitute = latitute;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    private long longitude;
}
