## Objetivo

Implementar um protótipo de software com funções para entrada de dados e saída dos
resultados, que será usado para realização das atividades práticas durante a disciplina.

## Descrição

Considerando os arquivos de instâncias de grafos disponibilizados no portal da disciplina:

▪ Desenvolva um protótipo de software que faça a leitura do arquivo de uma dada instância,
  mostre um determinado resultado na tela e o salve em um outro arquivo;

▪ O nome da instância deverá ser passado como argumento (parâmetro) para o método no
  comando de execução;

▪ Uma função de entrada deverá ler o conteúdo do arquivo da respectiva instância e armazená-lo
  em uma matriz do tipo Numpy (consulte a documentação da biblioteca em https://numpy.org);

▪ Obtenha a dimensão da matriz (i.e. quantidade de linhas e de colunas);

▪ Como resultado, uma função de saída deverá mostrar na tela e salvar em arquivo o nome da
  instância e a dimensão da respectiva matriz no formato: nome_instância qtd_linhas qtd_colunas.
  
## Entrega 

A entrega deverá ser feita exclusivamente pelo SIGAA (e-mails não serão aceitos). Enviar 01
(um) arquivo .pdf com o seguinte:
▪ O documento deverá incluir o nome da disciplina, seu nome e número de matrícula, além de
identificar o número da atividade que ele corresponde e a data de entrega.
▪ Este documento deverá conter um relatório com no máximo 03 páginas que mostre as
evidências da sua implementação e descreva as questões técnicas do código (inclua imagens de
trechos de código considerados mais importantes, bem como telas que mostrem os resultados).
Finalize o relatório comentando as dificuldades que teve para realizar a atividade.
▪ O relatório deverá conter o link do GitHub com o código fonte do protótipo implementado
(devidamente comentado

## Relatório

### Implementação open.py

O código open.py foi criado com o objetivo de abrir os arquivos .txt com as matrizes, transformá-los em uma matriz numpy e retornar diretamente a dimensão das mesmas, com o objetivo de otimizar o processo ao máximo.

Foi utilizada também a biblioteca os, que permitiu a identificação do diretório onde o código está sendo executado, otimizando o caminho até o arquivo com o dataset de matrizes, que é enviado como parametro na linha seguinte para carregar a matriz através do método loadtxt, que ao informar o caminho e o tipo de variável contido no arquivo, irá armazenar o conteúdo em uma matriz numpy.

Após isso, a variável matriz é retornada já com o método .shape, que identifica as dimensões e retorna uma tupla com o formato (linhas, colunas).

### Implementação main.py

Após a abertura e tratamento do arquivo de texto, a informação do número de linhas e colunas é extraída e alocada consecutivamente nas variáveis row e col. Logo, os valores de linhas e colunas entram como parâmetros na função saiDados, juntamente com o nome da instância.

A biblioteca interna do python sys foi utilizada para receber os parametros iniciais de execução do Python, permitindo a troca do arquivo de texto diretamente pela interface do PyCharm.

### Implementação create.py

Para criar o arquivo resultado, diversas linhas de código foram utilizadas, de maneira geral para a abertura do arquivo, escrita nele, e salvamento. Após serem realizados estes passos, a função saiDados retorna o texto gerado com a informação no formato: nome-instância qtd-linhas qtd-colunas. Com isso, o resultado retorna à main, e é printado na tela.

### Dificuldades

Uma das dificuldades foi a manipulação do caminho dos arquivos devido ao tempo excessivo para busca dos mesmos. A solução para a otimização do tempo de busca foi a utilização da biblioteca os, citada e melhor explicada na seção 2.1. Outra dificuldade foi a extração do parâmetro de entrada padrão da IDE PyCharm, solucionada com a utilização da biblioteca sys que permite a identificação do parâmetro configurado pelo usuário anteriormente à execução do código.
