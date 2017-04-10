class Tabuleiro {

	private int[][] gabarito;
	private int[][] grid= new int[9][9];

	/*Esse método recebe como entrada um
	inteiro para a posição X, um inteiro para a posição Y e um inteiro para o valor (precisa
	necessariamente ser um valor entre 1 e 9).*/
	public boolean executaMovimento(int x, int y, int valor) {
		if(valor<=9 && valor>=1) {
			this.grid[x][y]=valor; 
			return true;
		}
		else return false;
	}
	
	/* Esse método deve percorrer todos os
	valores do atributo grid e retornar false caso encontre algum valor == 0, caso contrário
	retornar true.*/
	public boolean isTabuleiroPreenchido() {
		for(int i=0;i<this.grid.length;i++) {
			for(int j=0; i<this.grid.length; i++) {
				if (this.grid[i][j]==0) {
					return false;
				}
			}
		}
		return true;
	} //está dando erro na linha 23, ainda n sei o que foi
	
	//implementar getters e setters
	
	public void resolveTabuleiro(){
		//criar apenas a assinatura
	}

	public void geraTabuleiro(){
		//criar apenas a assinatura
		//vai receber um enum DificuldadePartida depois
	}
}
