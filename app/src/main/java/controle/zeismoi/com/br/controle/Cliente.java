package controle.zeismoi.com.br.controle;

/**
 * Created by ovs on 23/03/2017.
 */

public class Cliente {

    private long id;
    private String nome;
    private String endereco;
    private String telefone;
    private long latitute;
    private long longitude;

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
}
