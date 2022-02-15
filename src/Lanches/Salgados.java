package Lanches;

public class Salgados extends Lanche{
	
	private String tipoSalgado;
	private double preco;
	private double tempoTotal;
	
	public Salgados(){
		super();
	}
	
//getters and setters 
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getTipoSalgado() {
		return tipoSalgado;
	}

	public void setTipoSalgado(String tipoSalgado) {
		this.tipoSalgado = tipoSalgado;
	}
	
	
	
	@Override
	public void calcularTempo(double distancia) {
			double inteira, resto;
			this.tempoTotal = (distancia * 10) + 30;
			inteira = tempoTotal / 60;
			
			resto = tempoTotal % 60;
			
			System.out.println("------------------------------------------------------------------------------------------------------------------ ");
			System.out.println("  Tempo total para entrega: " + (int)inteira + " hora e " + resto + " minutos" );
			System.out.println("------------------------------------------------------------------------------------------------------------------ ");
			
		}

	@Override
	public void fecharPedido() { 		
	System.out.println("---------------------Seu pedido foi realizado com sucesso--------------------------------------------------------- ");
	System.out.println("  Seu pedido ficou em: R$ " + getPreco());
	System.out.println("------------------------------------------------------------------------------------------------------------------");
	
}
	
	//escolha do tipo de salgado
	public void escolherSalgado(){
		
	}

	
	



}
	
