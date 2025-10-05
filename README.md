Este projeto tem como objetivo automatizar o cálculo de impostos para diferentes tipos de contribuintes, pessoas físicas e pessoas jurídicas, aplicando regras específicas conforme a categoria e características de cada um.

O programa foi desenvolvido para ler os dados de N contribuintes, calcular automaticamente o imposto devido por cada um e, ao final, exibir o total de imposto arrecadado.

Estrutura do Sistema

O sistema diferencia dois tipos de contribuintes:

Pessoa Física: Dados: nome, renda anual e gastos com saúde

Regras de cálculo: Renda abaixo de R$ 20.000,00 → imposto de 15% Renda a partir de R$ 20.000,00 → imposto de 25% Caso haja gastos com saúde, 50% desses gastos são abatidos do imposto devido

Exemplo de cálculo: Renda: 50000.00 Gastos com saúde: 2000.00 Imposto: (50000 * 25%) - (2000 * 50%) = 11500.00

Pessoa Jurídica:

Dados: nome, renda anual e número de funcionários Regras de cálculo: Imposto padrão: 16% da renda anual Se a empresa tiver mais de 10 funcionários, o imposto reduz para 14%

Exemplo de cálculo: Renda: 400000.00 Funcionários: 25 Imposto: 400000 * 14% = 56000.00

Funcionalidades Implementadas: Leitura dinâmica de múltiplos contribuintes (definido pelo usuário) Cálculo automático de imposto com base nas regras de cada tipo Exibição detalhada do valor de imposto individual Cálculo e exibição do total de imposto arrecadado

Conceito-Chave A ideia principal foi abstrair o comportamento de cálculo de imposto em uma classe base Contribuinte, com subclasses PessoaFisica e PessoaJuridica, cada uma implementando sua própria lógica de imposto. Isso torna o código mais flexível, reutilizável e fácil de expandir para novos tipos de contribuintes.
