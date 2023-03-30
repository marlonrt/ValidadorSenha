public class Main {
    public static void main(String[] args) {
        // linkedin.in/marlonrt


        ValidadorSenha validadorSenha = new ValidadorSenha("#@MarlonRT7");
        if (validadorSenha.senhaValida()) {
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida");
        }

    }
}