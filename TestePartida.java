package Principal;

public class TestePartida {
    public static void main(String[] args){
        Partida jogo1;
        jogo1 = new Partida("Ana");
        jogo1.escolherDificuldade("NORMAL");
            while(System.currentTimeMillis()<jogo1.getTempo()){
                int b=3;
                for(int i=0;i < jogo1.getGridTabuleiro().length;i++) {
                    for(int j=0; j < jogo1.getGridTabuleiro().length; j++){
                        jogo1.executaMovimento(i, j, b);
                        System.out.println(jogo1.getGridTabuleiro()[i][j]);
                    }
                    System.out.println("");
                    b++;
                }
                if(jogo1.getVenceu()==true){
                    System.out.println("Voce venceu!!!");
                    break;
                }
            }
    }
}
