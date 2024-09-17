
public class Gerente extends Empregado{
    private String usuario;
    private String senha;
    
    public double calculaBonificacao(){
        double bonificacao = getSalario() * 0.6 + 100;
        return bonificacao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
