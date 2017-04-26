
import java.util.Date;

public class Partida{
  private Jogador jogador;
  private Tabuleiro tabuleiro = new Tabuleiro();
  private int quantidadeErros;
  private boolean venceu;
  //private Date tempo = new Date();
  private long tempo = System.currentTimeMillis() + 15000;
  private int score;
  private DificuldadePartida dificuldade;
  private int quantidadeMaximaErrosAtual;
  
  public Partida(String nome){
    this.jogador = new Jogador(nome);
  }

  public void executaMovimento(int x, int y, int valor){
      this.tabuleiro.executaMovimento(x, y, valor);
      if(x <= 9 && y <= 9){
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
      if(this.quantidadeErros==this.quantidadeMaximaErrosAtual){
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
  
  public DificuldadePartida getDificuldade(){
    return this.dificuldade;
  }
  
  public String getNomeJogador(){
    return this.jogador.getNome();
  }
  
  /*public int getQuantidadeMaximaErrosAtual(){
		return this.quantidadeMaximaErrosAtual;*/
  }
