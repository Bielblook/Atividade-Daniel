public class Telefone {
    private String DDD;
    private String numero;

    public Telefone(String DDD, String numero) {
        this.DDD = DDD;
        this.numero = numero;
    }

    public String getDdd() {
        return DDD;
    }

    public void setDdd(String DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    
}
