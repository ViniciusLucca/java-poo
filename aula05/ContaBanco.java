package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // CONSTRUTOR:
    public ContaBanco(int numConta, String dono){
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = 0f;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    void abrirConta(String tipo_conta) {
        if (status) {
            return;
        }
        status = true;
        if (tipo_conta == "cc") {
            tipo = "cc";
            saldo += 50;
        } else {
            tipo_conta = "cp";
            saldo += 150;
        }
    }

    void fecharConta() {
        if (saldo > 0) {
            System.out.println(
                    "Não foi possível fechar a conta;\nMotivo: Ainda há saldo nesta conta. Saque o dinheiro restante na conta antes de fechá-la.");
            return;
        }
        if (saldo < 0) {
            System.out.println("Não foi possível fechar a conta. \nMotivo: A conta está endividada.");
            return;
        }
        status = false;
    }

    void depositar(float valor_deposito) {
        if (status == false) {
            System.err.println("Não foi possível realizar o depósito.\nMotivo: A conta está desativada.");
            return;
        }
        saldo += valor_deposito;
        System.out.println("Valor depositado!");
    }

    void sacar(float valor_saque) {
        if (!status) {
            System.err.println("Não foi possível realizar o depósito.\nMotivo: A conta está desativada.");
            return;
        }
        if (valor_saque > saldo) {
            System.err.println("Não foi possível realizar o saque. \nMotivo: Saldo insuficiente.");
            return;
        }
        saldo -= valor_saque;
    }
    void contaDump(){
        System.out.println("-------------------------");
        System.out.println("Dono:\t " + this.dono);
        System.out.println("Saldo:\t " + this.saldo);
        System.out.println("Num.C.:\t " + this.numConta);
        System.out.println("Tipo:\t " + this.tipo);
        System.out.println("Status:\t " + this.status);
        System.out.println("-------------------------");
    }
    void pagarMensal(){
        status = true;
        if (this.tipo == "cc") {
            saldo -= 12;
        } else {
            saldo -= 20;
        }
    }
}
