# Sudoku
Projeto de Lpoo


Objetivo:

Desenvolver no aluno a habilidade de implementar classes, atributos e métodos em uma
linguagem OO. Esta parte do projeto cobre primordialmente as aulas de “Java estruturado”, classes,
objetos, atributos, métodos, construtores e a parte de arrays e strings.

O que é?

É um quebra-cabeça baseado na colocação lógica de números. O objetivo do jogo é a
colocação de números de 1 a 9 em cada uma das células vazias numa grade de 9x9, constituída por
3x3 subgrades chamadas regiões. O quebra-cabeça contém algumas pistas iniciais, que são números
inseridos em algumas células, de maneira a permitir uma indução ou dedução dos números em células
que estejam vazias.

Regras:

Cada coluna, linha e região só pode ter um número de cada um dos 1 a 9.

Maiores informações:
https://pt.wikipedia.org/wiki/Sudoku

Especificação da primeira parte:

1. Implementar uma classe Tabuleiro que é responsável, dentre outros, por manter os dados do
tabuleiro, preencher um valor informado pelo usuário, manter o “gabarito” da solução e deve
possuir os seguintes atributos:
a) Atributo gabarito, Array bidimensional de int.
b) Atributo grid, Array bidimensional de int.
c) Implementar o método executaMovimento(). Esse método recebe como entrada um
inteiro para a posição X, um inteiro para a posição Y e um inteiro para o valor (precisa
necessariamente ser um valor entre 1 e 9).
d) Implementar o método isTabuleiroPreenchido(). Esse método deve percorrer todos os
valores do atributo grid e retornar false caso encontre algum valor == 0, caso contrário
retornar true.
e) Implementar getters e setters.
f) Essa classe terá ainda o método resolveTabuleiro() sem atributos e geraTabuleiro() que
recebe um DificuldadePartida (Enum) criado mais a frente, esses métodos não serão 
implementados por enquanto sendo necessário criar apenas a sua assinatura.

2. Implementar uma classe Jogador que é responsável, por manter os dados do jogador que está
jogando uma partida de Sudoku essa classe deve ter os seguintes atributos.
a) Atributo nome, String.
b) Atributo scoreRecorde, int.
c) Implementar getters e setters.

3. Implementar um Enum de nome DificuldadePartida, esse enum deve ter os seguintes
atributos:
a) FACIL
b) NORMAL
c) DIFICIL
d) Todos os valores devem possuir: um inteiro para o valor e um inteiro para a quantidade
máxima de erros.
e) Implementar os métodos getters para os dois atributos citados anteriormente.

4. Implementar a classe Partida que é responsável
a) Atributo jogador, Jogador.
b) Atributo tabuleiro, Tabuleiro.
c) Atributo quantidadeErros, inteiro.
d) Atributo venceu, boolean.
e) Atributo tempo, java.util.Date.
f) Atriburo score, inteiro.
g) Atributo dificuldade, DificuldadePartida enum.
h) Implementar o método executaMovimento(). Esse método recebe como entrada um
inteiro para a posição X, um inteiro para a posição Y e um inteiro para o valor e deve
chamar o executaMovimento() do atributo tabuleiro. Caso o movimento seja válido é
necessário chamar o método isTabuleiroPreenchido() do atributo tabuleiro e atribuir o
resultado ao atributo venceu. Caso o valor informado seja inválido o método deve
incrementar o atributo quantidadeErros.
i) Implementar o método isFimDeJogo(), esse deve retornar true se a quantidade de erros
do atributo quantidadesErros, for igual a quantidade máxima de erros do atributo
dificuldade.
j) Implementar o método iniciaPartida(), esse método deve resetar o objeto para o estado
inicial, ou seja: Zerar o atributo quantidadeErros, criar uma nova instância para o
atributo tempo, atribuir a venceu o valor false e chamar o método geraTabuleiro() do
atributo tabuleiro.

5. Desenvolver programas de testes para todas as classes implementadas.

6. Todas as classes devem possuir construtores. O aluno deverá observar quais atributos podem
ser inicializados nesses construtores
