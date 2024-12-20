package tratamento_excecoes.excecoes_personalizadas;

public class conta {
    private int numero;
    private String cliente;
    private double saldo;
    private double limiteSaque;

    public conta(){

    }

    public conta(int numero, String cliente, double saldo, double limiteSaque) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setLimiteSaque(int limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
    
    public void saque (double valor){
        if (valor > saldo){
            throw new excecao_base("Não há saldo suficiente!");
        }
        else if (valor>limiteSaque){
            throw new excecao_base("O valor solicitado é maior que o limite de saque!");
        }else{
            saldo = saldo - valor;
        }
    }

    public void deposito (double valor){
        saldo = saldo + valor;
    }
    
 //pronta   
}

   