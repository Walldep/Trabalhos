package principio.responsabilidade;

public class ContaBanco {
	
	private String Conta;
	private double saldo = 8000;
	
	public void soma100() {saldo += 100; }
	
	public void menos100() {saldo -= 100; }
	
	public void saque(double saque) {saldo -= saque; }
	
	public void deposito(double deposito) {saldo += deposito; }
	
	public double getSaldo() {return saldo; }
	
	public void setConta(String conta) {this.Conta = conta; }
	
	public String getConta() {return Conta; }

	@Override
	public String toString() {
		return "ContaBanco [Conta=" + Conta + ", saldo=" + saldo + "]";
	}
	
}
