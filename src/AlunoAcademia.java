
/**
 *
 * @author Gustavo Nunes Wawrick
 */
public class AlunoAcademia {

    private String nome;
    private String cpf;
    private double altura;
    private double peso;

    public AlunoAcademia() {
        nome = "";
        cpf = "";
        altura = 0.0;
        peso = 0.0;
    }

    public AlunoAcademia(String nome, String cpf, double altura, double peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.altura = altura;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double calculaIndiceIMC() {
        double imc = peso / (altura * altura);
        return imc;
    }
}
