public class ValidadorSenha {

    private final String senha;

    public ValidadorSenha(String senha) {
        this.senha = senha;
    }

    public boolean senhaValida() {
        if (senha.length() < 8) {
            return false;
        }

        boolean temLetraMaiuscula = false;
        boolean temLetraMinuscula = false;
        boolean temNumero = false;
        boolean temCaractereEspecial = false;
        String caracteresEspeciais = "!@#$%^&*";

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isUpperCase(c)) {
                temLetraMaiuscula = true;
            } else if (Character.isLowerCase(c)) {
                temLetraMinuscula = true;
            } else if (Character.isDigit(c)) {
                temNumero = true;
            } else if (caracteresEspeciais.indexOf(c) >= 0) {
                temCaractereEspecial = true;
            }
        }

        return temLetraMaiuscula && temLetraMinuscula && temNumero && temCaractereEspecial;
    }
}
