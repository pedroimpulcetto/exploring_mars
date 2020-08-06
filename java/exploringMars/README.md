# Exploring Mars

Projeto modelado com conceitos de Orientação a Objetos, tem como objetivo controlar sondas em um plano cartesiano através de instruções que serão recebidas via console.

## Começando

Para execução do projeto será necessário a instalação dos seguintes programas:

- [JDK8](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html): Necessário para execução do projeto
- [MAVEN](https://maven.apache.org/download.cgi): Necessário para build do projeto
- [ECLIPSE](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2020-06/R/eclipse-jee-2020-06-R-win32-x86_64.zip&mirror_id=576): Necessário para desenvolvimento do projeto

## Desenvolvimento

Para iniciar o projeto ou o desenvolvimento de melhorias basta clonar o projeto do GitHub num diretório de sua preferência:

```python
  cd "diretorio de sua preferencia"
  git clone https://github.com/pedroimpulcetto/exploring_mars.git
```

## Inicialização

Como estamos utilizando o pacote Maven para padronizar a contrução e publicação do nosso projeto, basta executar o comando `mvn clean install` para baixar todas as dependências do projeto.

## Features

A principal função desse projeto é a movimentação da sonda no plano cartesiano através de instrução que serão recebidas através do terminal.

Basicamente temos 3 (três) classes compondo todo o projeto.

- Probe
- CartesianPlan
- Intruction

As classes _CartesianPlan_ e _Instruction_ são do tipo DTO - Data Transfer Object - e a classe _Probe_ é responsável pela regra de negócio (construção e movimentação da sonda).

**CartesianPlan** receberá 2 (dois) atributos que representam a extremidade superior direta do plano cartesiano - final do plano cartesiano - , sendo eles:

- Eixo X
- Eixo Y

obrigatóriamente do tipo _inteiro_

**Instruction** receberá como atributo um série de instruções em sequência podendo ser "M", "R" ou "L".
Exemplo: MRMRMRLMM
obrigatóriamente do tipo _String_

- "M": Move
- "R": Right
- "L": Left

**Probe** responsável pela construção da sonda, receberá 3 (três) atributos que representam as informações iniciais da sonda no plano cartesiano, sendo eles:

- Eixo X inicial da sonda
  obrigatóriamente do tipo _inteiro_
- Eixo Y inicial da sonda
  obrigatóriamente do tipo _inteiro_
- Direção inicial da sonda
  obrigatóriamente do tipo _String_ sendo "N", "E", "S" ou "W"

Probe também é responsável pelo método **move()**, capaz de movimentar a sonda pelo plano cartesiano. A cada instrução, move() recebe 3 (três) parâmetros:

- Eixo X em que a sonda encontra-se
- Eixo Y em que a sonda encontra-se
- Instrução do que fazer

## Execução

O projeto está limitado a receber 1 (um) plano cartesiano (CartesianPlan), 2 (duas) sondas (Probe) e 1 (um) conjunto de intruções para cada sonda.

Exemplo de input de dados no terminal:

```
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM
```

Resultado:

```
1 3 N
5 1 E
```

##### Atenção

Se a sondar encontra-se em uma das extremidades do Eixo X ou Eixo Y do plano cartesiano e você passar uma instrução de "Move" - significando que ela deve seguir em frente - ela irá ignorar essa instrução pois está no fim do plano cartesiano, não podendo ultrapassar esse ponto.
Nesse caso, você deverá passar a instrução de "Right" ou "Left" para alterar a direção e depois passar "Move".
