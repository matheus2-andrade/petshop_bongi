
# Bongi Pet Salon - Sistema de Gerenciamento de Petshop

## Descrição

Este projeto foi desenvolvido como parte de uma atividade acadêmica da disciplina de Java. O objetivo do sistema é digitalizar o processo de entrada e saída de pets no petshop local "Bongi Pet Salon". O sistema permite o cadastro, atualização, listagem e remoção de pets, além de registrar e listar as saídas dos pets com a data completa.

## Funcionalidades

- **Cadastro de Pets**: Permite cadastrar novos pets com informações detalhadas.
- **Listagem de Pets**: Exibe uma lista formatada de todos os pets cadastrados.
- **Atualização de Pets**: Permite atualizar informações específicas de um pet.
- **Remoção de Pets**: Permite deletar um pet pelo nome.
- **Registro de Saídas**: Permite registrar a saída de um pet com a data completa.
- **Listagem de Saídas**: Exibe uma lista formatada de todas as saídas registradas.

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Arquitetura em Camadas
- Serialização
- Tratamento de Exceções
- Interface do Usuário via Terminal

## Estrutura do Projeto

O projeto está organizado em pacotes conforme a arquitetura em camadas:

- **br.com.bongi.model**: Classes modelo que representam os dados do sistema.
- **br.com.bongi.controller**: Controladores que gerenciam a lógica de negócios.
- **br.com.bongi.repository**: Repositórios que gerenciam a persistência dos dados.
- **br.com.bongi.view**: Interface do usuário.
- **br.com.bongi.exception**: Classes de exceção personalizadas.
- **br.com.bongi.constants**: Constantes do sistema.
- **br.com.bongi.util**: Métodos utilitários.

## Como Rodar o Projeto

### Pré-requisitos

- Java Development Kit (JDK) 8 ou superior
- IDE como IntelliJ IDEA ou Eclipse

### Passo a Passo

1. **Clone o Repositório**
   ```bash
   git clone https://github.com/matheus2-andrade/petshop_bongi.git
   ```

2. **Importe o Projeto na IDE**
    - Abra sua IDE (IntelliJ IDEA, Eclipse, etc.).
    - Importe o projeto como um projeto Maven existente.

3. **Configure o SDK**
    - Certifique-se de que o JDK está configurado corretamente na IDE.

4. **Execute a Classe Main**
    - Navegue até a classe `Main` em `br.com.bongi`.
    - Execute a classe `Main` para iniciar o sistema.

### Utilização

- Ao iniciar o sistema, você verá um menu com as opções disponíveis.
- Selecione a opção desejada digitando o número correspondente e pressionando Enter.
- Siga as instruções fornecidas pelo sistema para inserir dados ou realizar ações.

### Exemplo de Uso

```bash
  ____                        _   _____       _      _____         _               
 |  _ \                      (_) |  __ \     | |    / ____|       | |              
 | |_) |  ___   _ __    __ _  _  | |__) |___ | |_  | (___    __ _ | |  ___   _ __  
 |  _ <  / _ \ | '_ \  / _` || | |  ___// _ \| __|  \___ \  / _` || | / _ \ | '_ \ 
 | |_) || (_) || | | || (_| || | | |   |  __/| |_   ____) || (_| || || (_) || | | |
 |____/  \___/ |_| |_| \__, ||_| |_|    \___| \__| |_____/  \__,_||_| \___/ |_| |_|
                        __/ |                                                      
                       |___/                 
Menu:
1. Cadastrar Pet
2. Listar Pets
3. Atualizar Pet
4. Deletar Pet
5. Registrar Saída
6. Listar Saídas
0. Sair
```

