import java.util.ArrayList;

class Main{

    public static void main(String[] args) {
      
        Endereco endereco = new Endereco("12345-678", "Av.Mascaranhas de Morais", 100);

        Telefone telefone1 = new Telefone("81", "95745-9854");
        Telefone telefone2 = new Telefone("82", "98455-6574");


        Conta conta = new Conta(123, "001", 1000.0);


        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(conta);

    
        Cliente cliente = new Cliente("136.974.554-87", "Nome da Pessoa", endereco, contas);
        cliente.addTelefone(telefone1);
        cliente.addTelefone(telefone2);

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Endereço: " + cliente.getEndereco().getLogradouro() + ", " +
                        cliente.getEndereco().getNumero() + " - " + cliente.getEndereco().getCep());
        System.out.println("Telefones:");
        for (Telefone telefone : cliente.getTelefones()) {
            System.out.println("  " + telefone.getDdd() + " " + telefone.getNumero());
        }
        System.out.println("Contas:");
        for (Conta c : cliente.getContas()) {
            System.out.println("  " + c.getAgencia() + " " + c.getNumero() + " " + c.getSaldo());
        }
    }
}