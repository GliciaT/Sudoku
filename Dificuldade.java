public enum DificuldadePartida{
	FACIL(0,10), NORMAL(1,5), DIFICIL(2,3);
  
	private int valor;
	private int quantidadeMaximaErros;

	private DificuldadePartida(int valor, int quantidadeMaximaErros){
		this.valor= valor;
		this.quantidadeMaximaErros= quantidadeMaximaErros;
	}

	public int getValor(){
		return this.valor;
	}

	public int getQuantidadeMaximaErros(){
		return this.quantidadeMaximaErros;
	}
}
