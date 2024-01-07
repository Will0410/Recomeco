package Model;

public class UserModel {

    private int id;
    private String nome;
    private String sexo;
    private String idade;
    private String tipo_exame;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTipo_exame() {
        return tipo_exame;
    }
    public void setTipo_exame(String tipo_exame) {
        this.tipo_exame = tipo_exame;
    }
}
