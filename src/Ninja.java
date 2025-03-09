public class Ninja {

    private String nomeNinja;
    private int idade;
    private String Aldeia;

    public Ninja() {
    }

    public Ninja(String nomeNinja, int idade, String aldeia) {
        this.nomeNinja = nomeNinja;
        this.idade = idade;
        Aldeia = aldeia;
    }

    public String getNomeNinja() {
        return nomeNinja;
    }

    public void setNomeNinja(String nomeNinja) {
        this.nomeNinja = nomeNinja;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return Aldeia;
    }

    public void setAldeia(String aldeia) {
        Aldeia = aldeia;
    }

    @Override
    public String toString() {
        return "Ninja { Nome: " + nomeNinja + ", Idade: " + idade + ", Vila: " + Aldeia + " }";
    }
}
