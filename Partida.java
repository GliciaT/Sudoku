package Principal;
import java.util.Date;

public class Partida{
  private Jogador jogador;
  private Tabuleiro tabuleiro = new Tabuleiro();
  private int quantidadeErros;
  private boolean venceu;
  private long tempo = System.currentTimeMillis() + 15000;
  private int score;
  private DificuldadePartida dificuldade;
  private int quantidadeMaximaErrosAtual;
  
  public Partida(String nome){
    this.jogador = new Jogador(nome);
  }

  public void executaMovimento(int x, int y, int valor){
      if(x <= 9 && y <= 9){
          this.tabuleiro.executaMovimento(x, y, valor);
          this.venceu = tabuleiro.isTabuleiroPreenchido();
        }
      else this.quantidadeErros+=1;
  }
  
  public void escolherDificuldade(String dificuldade){
    if (dificuldade == "FACIL"){
      this.quantidadeMaximaErrosAtual= getDificuldade().FACIL.getQuantidadeMaximaErros();
      }
    else if (dificuldade == "NORMAL"){
      this.quantidadeMaximaErrosAtual= getDificuldade().NORMAL.getQuantidadeMaximaErros();
      }
    else if (dificuldade == "DIFICIL"){
      this.quantidadeMaximaErrosAtual= getDificuldade().DIFICIL.getQuantidadeMaximaErros();
      }
    }
    
  public boolean isFimDeJogo(){
      if(this.quantidadeErros==this.quantidadeMaximaErrosAtual) return true;
      else if(this.venceu==true) return true;
      else return false;
  }
  
  public void iniciaPartida(){
      this.quantidadeErros=0;
      this.tempo = System.currentTimeMillis() + 200;
      this.venceu= false;
      this.tabuleiro.geraTabuleiro();
  }
  
  public DificuldadePartida getDificuldade(){
    return this.dificuldade;
  }
  
  public String getNomeJogador(){
    return this.jogador.getNome();
  }
  
  public long getTempo(){
    return this.tempo;
  }
  public int getQuantidadeErros(){
    return this.quantidadeErros;
  }
  
  /*public int getQuantidadeMaximaErrosAtual(){
		return this.quantidadeMaximaErrosAtual;*/
  }
