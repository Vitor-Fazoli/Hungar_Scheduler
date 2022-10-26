pt-br

# Descrição do escalonador
  A ideia inicial do escalonador é ter um sistema de pesos porém com uma variação aleatória entre eles, ele carrega um processo grande e um pequeno, trocando entre eles para fazer o processamento e calcula um erro de X± para cima ou para baixo, definindo o peso de forma mais dinâmica, onde X é o valor como um erro

Assim quando indentificamos um valor do processo ele recebe uma margem de erro para que possa ter uma vantagem de fila, e melhorar o rendimento do processamento, para os testes esse valores vão variar para ver a melhor versão possivel para o escalonador.
Descrição do escalonador
A ideia inicial do escalonador é ter um sistema de pesos porém com uma variação aleatória entre eles, ele carrega um processo grande e um pequeno, trocando entre eles para fazer o processamento e calcula um erro de X± para cima ou para baixo, definindo o peso de forma mais dinâmica, onde X é o valor como um erro

Assim quando indentificamos um valor do processo ele recebe uma margem de erro para que possa ter uma vantagem de fila, e melhorar o rendimento do processamento, para os testes esse valores vão variar para ver a melhor versão possivel para o escalonador.

# Metodologia
  lá é possivel ver que para a criação da simulação foi feita a criação de duas listas, uma com pequenos processos e outra com grandes processos e diferenciando o tamanho de cada um, assim essas duas listas recebem um valor somando ou subtraindo aleatóriamente, com isso ele é intercalado em uma nova lista com um pequeno seguido de um grande e depois de tudo isso, a lista final que chamamos de “result” está pronta para ser processada e é oque acontece, podemos ver que ele entra o tamanho do processo, fazendo assim, uma instrução for para cada processo criando um esforço para melhorar a simulação.
  
  Para realizar os testes, primeiramente, foi preciso definir o tamanho dos processos. No primeiro teste geral, foi considerado que um processo pequeno tem o tamanho variando de 10 a 20 e processos médios/grandes tem tamanho variando de 50 a 200. Já no segundo teste geral, um processo pequeno foi definido com seu tamanho variando de 40 a 50 e processos médios/grandes com tamanho variando de 150 a 350.

  Após isso, é escolhido a quantidade de processos pequenos e processos médios/grandes, utilizando como exemplo a primeira tabela abaixo, é definido que teremos 75 processos pequenos e 25 processos médios/grandes. O algoritmo então é executado 10 vezes, obtendo-se o tempo gasto (em milissegundos) de cada execução, sendo que, logo em seguida calcula-se a média de todas as execuções. Essas execuções se repetem nas demais tabelas, porém alterando a quantidade de processos pequenos e médios/grandes. Ao fim, é gerado um gráfico comparando todas as médias.

  Dessa forma, todo esse procedimento é repetido para os outros processos definidos com tamanhos diferentes e ao final é gerado um gráfico comparativo dos processos de tamanho 10-20;50-200 e 40-50; 150-350.
