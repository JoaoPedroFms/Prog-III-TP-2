
# Segundo Projeto - PROGRAMAÇÃO III

A fim de solucionar o problema em relação à leitura de tweets em arquivos CSV em 15 idiomas diferentes presentes na Europa, este projeto foi criado pelos autores com o intuito de resolver essa problemática utilizando listas introduzidas nas aulas de programação, sendo elas: Lista Simples Encadeada, Lista Simples Encadeada Circular, Lista Duplamente Encadeada e Lista Duplamente Encadeada Circular.

O nosso  trabalho busca encontrar as possiveis soluções para estes problemas: 

1) Qual o volume de tweets para cada idioma?

2) Qual o volume total de tweets positivos? E qual o volume total de tweets negativos?

3) Qual o idioma com mais tweets negativos? Qual o idioma com mais tweets positivos? É
possível fazer um ranking dos idiomas?

4) Algum tweeter teve registro em mais de um idioma? Qual, quais e/ou quantos?

-------------------------------------------------------------------------
## Autores

- Raphael Abade
- Raphael Sousa
- Nathan Siqueira
- João Pedro
- Pedro Henrique de Ávila
- Délio
-------------------------------------------------------------------------
## Roadmap

Roadmap para o Projeto de Processamento de Tweets
- Definição e Planejamento (1-2 semanas)

      Objetivo do Projeto:

  Ler e processar tweets em 15 idiomas diferentes presentes na Europa partir de arquivos CSV. Utilizar listas encadeadas para armazenar e manipular os dados dos tweets.
    Escopo e Requisitos:
  Identificar quais idiomas serão suportados.
  
  Definir o formato dos arquivos CSV e os campos que serão utilizados.
  
  Estabelecer quais operações serão realizadas com os dados (e.g., inserção, busca, remoção).

- Preparação do Ambiente (1 semana)

    Configuração do Ambiente de Desenvolvimento:

Escolher a linguagem de programação (java).
  Separação de atribuições do projeto:

  - Criação da classe Nó e ListaEncadeada: Raphael Sousa Lima, Joâo Pedro.

  Como primeiro passo do grupo, Raphael e João criaram as classes "mães" do projeto onde a maioria das outras questões iriam consumir os metódos dessas classes. Então criamos o classe Nó que é referente a cada Twitter dos arquivos e que é equivalente a classe cúlala vista em sala. Além disso, criamos a listaEncadeada onde iria ser a classe que iria criar as listas dos twitters para conseguirmos fazer a manipulação dos dataset. Para o trabalho optamos pelo tipo de lista simples encadeada.

  - Questão 1: Nathan Siqueira e Délio.

  Neste código, manipulamos arquivos CSV que contêm dados de sentimentos do Twitter em diferentes idiomas. Com o objetivo de carregar esses dados em listas específicas para cada idioma e, em seguida, imprimir o volume de tweets processados para cada uma dessas listas. 

  Primeiramente definimos os caminhos para vários arquivos CSV, cada um contendo tweets em diferentes idiomas. Os caminhos dos arquivos são armazenados em variáveis de string. 

  Em seguida, chamamos o método tranformaArquivoParaLista para cada arquivo, que transforma o conteúdo do arquivo CSV em uma lista específica para cada idioma. Este método é chamado para todas as listas definidas, como listaTeste, listaAlba, listaBosn, etc.

  Após carregar os dados, fizemos a impressão do volume de tweets (ou o tamanho da lista) para cada idioma. O método getTamanho é utilizado para obter o número de tweets em cada lista, e esses valores são impressos no console.

  - Questão 2 e 3: Pedro Ávila, Raphael Abade.

  Eu, Raphael Abade e Pedro Avila, ficamos responsáveis de fazer a questão 3, de verificar qual é a linguagem com maior quantidade de tweets e qual o menor, e se é possível fazer um ranking

  Para isso, criamos o método sentimento, que lerá os arquivos dentro de um diretorio "./linguagem" (linux), depois lerá linha por linha de arquivo por arquivo.

  Enquanto é lido linha por linha, as variáveis max e min fazem a comparação para ver qual tem mais tweets positivos e qual tem menos. Também reutilizamos códigos usado nas aulas de lista para fazer o ranking.

  Como os contadores são diferentes, a lista do mais ao menos positivo está diferente da lista do mais negativo ao menos, então o método printer() duplicará as linguagens, mas retornará "rankeado, mas duplicado"

  - Questão 4: João Pedro, Raphael Lima
  Classes: MultiplasLinguas, Container

  Container:
  Essa classe é usada para instanciar um "container", com atributos "conteudo" e "proximo".
  Esse contêiner é usado para criar uma lista de contêiners, onde cada contêiner vai ter em seu atributo "conteudo" uma das listas encadeadas de idioma, e em seu atributo "proximo" um outro contêiner, criado assim uma lista encadeada onde em cada célula existe uma lista encadeada de linhas do dataset de um idioma.
  Seus métodos são apenas "get" e "set" simples para retornar e alterar seus atributos.

  MultiplasLinguas:
  Essa classe recebe por parâmetro todas as listas encadeadas dos idiomas criadas no "Principal", e cria manualmente uma lista de contêiners onde cada uma das listas de linhas do dataset será o atributo "conteúdo" de um contêiner.

  O método "testaMultiplasLinguagens" usa diversos loops para percorrer as listas e comparar seus elementos.

  O primeiro "for" percorre todos os contêiners usando a "aux1".

  O segundo "for" percorre todos os elementos da lista no contêiner selecionado pela "aux1", e armazena o "annotatorID" do elemento selecionado na variável "comparar".

  O terceiro "for" percorre todos os contêiners depois do contêiner selecionado pela "aux1" usando a "aux2".

  O quarto "for" percorre todos os elementos da lista no contêiner selecionado pela "aux2", e armazena o "annotatorID" do elemento selecionado na variavel "comparado".
  
  E o "if" mais interno compara as variáveis "comparar" e "comparado", e, caso sejam iguais, chama o método "registraID" para construir a String de resultado.

  O método "registraID" recebe por parametro o "annotatorID", e concatena-se nele mesmo junto do "numID", que representa quantos IDs individuais foram encontrados repetidos, formando ao final do loop uma String de resultado que mosta a quantidade de IDs que foram encontrados repetidos, e quais foram estes.

  Exemplo:
  ID 1 - 11
  ID 2 - 22
  ID 3 - 33

![Logo](https://logodix.com/logo/1002814.png)



