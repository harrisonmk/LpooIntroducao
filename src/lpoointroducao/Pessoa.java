
package lpoointroducao;


public class Pessoa {
    
    private String nome;
    private String date;
    private char sexo;
    private String cpf;

    public Pessoa(String nome, String date, char sexo, String cpf) {
        this.nome = nome;
        this.date = date;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
               
    }
    
    
    
    
}
