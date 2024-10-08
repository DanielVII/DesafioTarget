<p>Os códigos estão no arquivo: <code>src/main/java/br/com/Main.java</code></p>

<h3>Ideias por trás de cada resposta:</h3>

<h4>Fibonacci</h4>
<p>Primeiro, verifica-se se o número fornecido é um dos dois 
primeiros da sequência. Caso não seja, o código executa um 
loop que gera os próximos números da sequência, comparando-os 
com o número fornecido. O loop continua até que o número gerado 
seja igual ou superior ao fornecido. Se o número gerado for maior, 
o número fornecido não pertence à sequência de Fibonacci. Se for igual,
ele pertence.</p>

<h4>Contador de A</h4>
<p>Para resolver esse problema, foi necessário percorrer todos os caracteres e 
verificar se cada caractere era <code>a</code> ou <code>A</code>. 
Se a condição fosse verdadeira, incrementava-se a contagem em 1.</p>

<h4>Somar até indice</h4>
<p>Apesar de eu ter feito o código para mostrar a resposta, é bem simples chegar ao resultado. Basta seguir uma lógica e realizar a soma 11 vezes.</p>

<p>A lógica para calcular o valor da variável <code>SOMA</code> é a seguinte:</p>

<ul>
    <li><code>0 + 2 = 2</code></li>
    <li><code>2 + 3 = 5</code></li>
    <li><code>5 + 4 = 9</code></li>
    <li><code>9 + 5 = 14</code></li>
    <li><code>14 + 6 = 20</code></li>
    <li><code>20 + 7 = 27</code></li>
    <li><code>27 + 8 = 35</code></li>
    <li><code>35 + 9 = 44</code></li>
    <li><code>44 + 10 = 54</code></li>
    <li><code>54 + 11 = 65</code></li>
    <li><code>65 + 12 = 77</code></li>
</ul>

<p>Portanto, ao final do processamento, o valor da variável <code>SOMA</code> será <strong>77</strong>.</p>

<h4>Resposta da sequências lógicas</h4>

<p><strong>A)</strong> Sequência de soma de 2: 1, 3, 5, 7, <strong>9</strong></p>
<p><strong>B)</strong> Sequência de <code>2^x</code>, com <code>X</code> começando em 1 e incrementando em 1 a cada rodada: 2, 4, 8, 16, 32, 64, <strong>128</strong></p>
<p><strong>C)</strong> Sequência de <code>x²</code>, com <code>x</code> começando em 0 e incrementando em 1: 0, 1, 4, 9, 16, 25, 36, <strong>49</strong></p>
<p><strong>D)</strong> Sequência de <code>x²</code>, com <code>x</code> começando em 2 e incrementando em 2: 4, 16, 36, 64, <strong>100</strong></p>
<p><strong>E)</strong> Sequência de Fibonacci: 1, 1, 2, 3, 5, 8, <strong>13</strong></p>
<p><strong>F)</strong> Não encontrei uma lógica numérica para essa sequência, mas sim uma lógica de palavras: é uma sequência de números que começam com <strong>D</strong>: 2, 10, 12, 16, 17, 18, 19, <strong>200</strong></p>

<h4>Problema das lampadas</h4>
<p>Fiquei confuso se existe uma sala com 3 lampadas ou uma sala para cada lampada, então irei considerar os dois cenários</p>

<h4>Uma sala com 3 lâmpadas</h4>
<p>Para resolver o problema, eu ligo o interruptor 1 e espero alguns minutos até que a lâmpada esquente. Então, desligo o interruptor 1 e ligo o interruptor 2. Logo em seguida, vou para a sala. Ao chegar lá, pego nas lâmpadas desligadas: a que estiver quente é a do interruptor 1, a fria é a do interruptor 3, e a que estiver ligada é a do interruptor 2.</p>

<h4>Uma sala para cada lâmpada</h4>
<p>Seguirei a mesma lógica do anterior. Ligo o interruptor 1 e espero alguns minutos até que a lâmpada esquente. Depois, desligo o interruptor 1 e ligo o interruptor 2. Logo em seguida, vou para qualquer sala. Se a lâmpada estiver ligada, é a do interruptor 2; se estiver desligada e fria, é a do interruptor 3; e se estiver desligada e quente, é a do interruptor 1. Com isso, já elimino uma das opções.</p>
<p>Voltando para a sala, se descobri a lâmpada ligada, eu ligo o interruptor 1 e vou para a segunda sala. Se a luz estiver ligada, é a do interruptor 1; caso contrário, é a do interruptor 3. Agora, se a lâmpada que descobri na primeira sala for 1 ou 3, basta ir direto para a segunda sala, pois uma das lâmpadas estará ligada e a outra não. Dessa maneira tenho certeza de 2 opções, então a terceira basta associar.</p>
