package lpoointroducao;

public class Conta {

    private double saldo;
    private int senha;
    private int numero;
    private int agencia;
    private Pessoa nome;

    public Conta(double saldo, int senha, int numero, int agencia, Pessoa nome) {
        this.saldo = saldo;
        this.senha = senha;
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
    }

    public Conta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Pessoa getNome() {
        return nome;
    }

    public void setNome(Pessoa nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nSaldo: " + saldo + 
                "\nSenha: " + senha + 
                "\nNumero: " + numero + 
                "\nAgencia: " + agencia + 
                "\n" + nome;
    }

    
    
    
    public Conta clienteMaiorValor1(Conta p2) {

        

        if (this.saldo > p2.getSaldo()) {
            return this;
        } else {

            return p2;
        }

    }

}
