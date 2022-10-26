> versão português

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

> english version 

Scheduler Description
The scheduler's initial idea is to have a system of weights but with a random variation between them, it loads a large and a small process, switching between them to do the processing and calculates an error of X± up or down, defining the weight more dynamically, where X is the value as an error

So when we identify a process value it receives a margin of error so it can have a queue advantage, and improve processing throughput, for tests these values will vary to see the best possible version for the scheduler. Description of the scheduler The initial idea of the scheduler is to have a system of weights but with a random variation between them, it loads a large and a small process, switching between them to do the processing and calculates an error of X± up or down , setting the weight more dynamically, where X is the value as an error

So when we identify a process value it receives a margin of error so it can have a queue advantage, and improve processing throughput, for tests these values will vary to see the best possible version for the scheduler.

Methodology
there it is possible to see that for the creation of the simulation, two lists were created, one with small processes and another with large processes and differentiating the size of each one, so these two lists receive a value adding or subtracting randomly, with that it is merged into a new list with a small one followed by a large one and after all that, the final list that we call the “result” is ready to be processed and that's what happens, we can see that it enters the size of the process, doing so , a for statement for each process creating an effort to improve the simulation.

To carry out the tests, first, it was necessary to define the size of the processes. In the first general test, it was considered that a small process has a size ranging from 10 to 20 and medium/large processes have a size ranging from 50 to 200. In the second general test, a small process was defined with its size ranging from 40 to 200. 50 and medium/large processes ranging in size from 150 to 350.

After that, the number of small processes and medium/large processes is chosen, using the first table below as an example, it is defined that we will have 75 small processes and 25 medium/large processes. The algorithm is then executed 10 times, obtaining the time spent (in milliseconds) of each execution, and then the average of all executions is calculated. These executions are repeated in the other tables, however changing the number of small and medium/large processes. At the end, a graph is generated comparing all the averages.

In this way, this entire procedure is repeated for the other processes defined with different sizes and at the end a comparative chart of the processes of size 10-20; 50-200 and 40-50 is generated; 150-350.
