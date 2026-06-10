# biblioteca-demo

![Build Status](https://github.com/CapGyb/biblioteca-demo/actions/workflows/maven.yml/badge.svg)


Este repositório contém uma demonstração técnica de um sistema de gerenciamento de biblioteca. O foco principal do projeto é a validação das regras de negócio referente à **devolução de livros**, garantindo a qualidade do software através de testes automatizados e análise de cobertura de código.

## 🎯 Apresentação do Projeto

A documentação visual e a análise detalhada da ferramenta de cobertura (JaCoCo) podem ser acessadas abaixo:

* 📊 **[Acessar Apresentação no Google Drive](https://docs.google.com/presentation/d/1-Labj3DJaU6Ii5hET1u8mmYBeeQupzeaUHMbGfH_-u8/edit?usp=drivesdk)**

## 🛠️ Tecnologias Utilizadas

* **Java:** Linguagem principal do projeto.
* **Maven:** Gerenciamento de dependências e automação do build.
* **JUnit:** Criação e execução dos testes unitários.
* **JaCoCo:** Geração de relatórios de cobertura de código.

## 🚀 Como Executar

### Pré-requisitos
Certifique-se de ter o **Java (JDK)** e o **Maven** instalados e configurados nas variáveis de ambiente da sua máquina.

### Clonando o repositório
```bash
git clone [https://github.com/CapGyb/biblioteca-demo.git](https://github.com/CapGyb/biblioteca-demo.git)
cd biblioteca-demo
```
### Rodando os Testes
Para executar a suíte de testes com JUnit e validar as regras de devolução, utilize o comando:

```bash
mvn clean test
```

### Gerando o Relatório de Cobertura (JaCoCo)
Para analisar a porcentagem de código coberta pelos testes, execute:

```bash
mvn jacoco:report
```

Após a execução, o relatório HTML estará disponível em: target/site/jacoco/index.html. Basta abrir este arquivo no seu navegador.
