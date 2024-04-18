public class Conta {
    private int agencia;
    private int codigo;
    private int saldo;
    private float limite;

    public Conta() {
        this.agencia = 1234;
        this.codigo = 56789;
        this.saldo = 1000;
        this.limite = 500;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void deposita(float valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void saca(float valor) throws SaldoInsuficiente {
        if (valor > saldo + limite) {
            throw new SaldoInsuficiente("Saldo insuficiente. Limite total para saque: " + (saldo + limite));
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }
}
