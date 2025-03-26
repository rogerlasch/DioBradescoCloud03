# iPhone - Implementação POO em Java

## Descrição

Este projeto é uma implementação do conceito de Programação Orientada a Objetos (POO) para representar um iPhone, baseado no seu comportamento principal:

- Reprodutor Musical (MusicPlayer)

- Aparelho Telefônico (Telephone)

- Navegador na Internet (InternetBrowser)

O projeto foi desenvolvido utilizando Java e a IDE IntelliJ.

## Estrutura do Projeto

O projeto é estruturado com interfaces para cada funcionalidade, garantindo um design modular e reutilizável. A classe iPhone implementa essas interfaces, garantindo que o dispositivo possua todas as funcionalidades esperadas.

## Funcionalidades Implementadas

1. MusicPlayer

- play() - Toca uma música

- pause() - Pausa a reprodução

- selectMusic(String music) - Seleciona uma música

2. Telephone

- call(String number) - Realiza uma chamada

- answer() - Atende uma chamada

- startVoiceMail() - Inicia o correio de voz

3. InternetBrowser

- showPage(String url) - Exibe uma página web

- addNewTab() - Adiciona uma nova aba

- updatePage() - Atualiza a página atual

## Diagrama UML (Mermaid)

title Diagrama UML - Implementação do iPhone
classDiagram
    class iPhone {
        +play()
        +pause()
        +selectMusic(music: String)
        +call(number: String)
        +answer()
        +startVoiceMail()
        +showPage(url: String)
        +addNewTab()
        +updatePage()
    }
    class MusicPlayer {
        <<interface>>
        +play()
        +pause()
        +selectMusic(music: String)
    }
    class Telephone {
        <<interface>>
        +call(number: String)
        +answer()
        +startVoiceMail()
    }
    class InternetBrowser {
        <<interface>>
        +showPage(url: String)
        +addNewTab()
        +updatePage()
    }
    iPhone ..|> MusicPlayer
    iPhone ..|> Telephone
    iPhone ..|> InternetBrowser

## Como Executar o Projeto

- Clone o repositório:

- Abra o projeto no IntelliJ IDEA ou qualquer outra IDE de sua escolha.

- Compile e execute a classe Main.java.

## Exemplo de Saída

Selecionando a música: "good music.mp3"...
Tocando música...
Música pausada...
Ligando para o número: 0011223344
Atendendo ligação...
Iniciando correio de voz...
Exibindo a página da URL: www.google.com
Adicionando nova aba...
Recarregando página...

## Tecnologias Utilizadas

- Java

- IntelliJ IDEA

- Mermaid para UML

## Autor

Nome: Róger Matheus Lasch

Data: 26/03/2025

