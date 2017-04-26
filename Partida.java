import java.util.Date;

public class Partida{
  private Jogador jogador = new Jogador();
  private Tabuleiro tabuleiro = new Tabuleiro();
  private int quantidadeErros;
  private boolean venceu;
  private Date tempo = new Date();
  //private java.util.Date tempo;
  private int score;
  private DificuldadePartida dificuldade;

  public void executaMovimento(int x, int y, int valor){
      this.tabuleiro.executaMovimento(x, y, valor);
      if(x <= 9 && y <= 9){
          this.venceu = tabuleiro.isTabuleiroPreenchido();
        }
      else this.quantidadeErros+=1;
  }
  
  public boolean isFimDeJogo(){
      if(this.quantidadeErros==this.dificuldade.getQuantidadeMaximaErros()){
          return true;
      }
      else return false;
  }
  public void iniciaPartida(){
      this.quantidadeErros=0;
      this.tempo = new Date();
      this.venceu= false;
      this.tabuleiro.geraTabuleiro();
  }
}
