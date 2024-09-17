

public class TesteEmpregado {


    
    public static void main(String[] args) {
        Gerente a = new Gerente();
        a.setNome("Isaac");
        a.setSalario(3000);
        a.setUsuario("Isaac.bustamente");
        a.setSenha("1234");
        
        Empregado b = new Empregado();
        b.setNome("Pedro");
        b.setSalario(2500);
        
        Telefonista c = new Telefonista();
        c.setNome("Luana");
        c.setSalario(900);
        c.setEstacaoTrabalho(20);
        
        Secretaria d = new Secretaria();
        d.setNome("Maria");
        d.setSalario(1300);
        d.setRamal(31);
    }
    
}
