# TrabalhoJava (GameStop)

O projeto feito pelo nosso grupo consiste em um sistema de vendas para uma loja direcionada a jogos (Gamestop). Nosso objetivo é que tanto o cliente quanto o funcionário consigam usar o sistema com facilidade desde o primeiro uso. O cliente consegue consultar itens no estoque, ver seus preços e quantidades, enquanto o funcionário tem acesso a todas as funcionalidades do cliente, além de poder vender, adicionar e remover produtos.
As classes são divididas entre pessoa e produto. A classe Pessoa se estende para Funcionário e Cliente. Funcionário se estende para Gerente e Atendente. Gerente, Atendente e Cliente possuem controllers que têm funções como visualizar, adicionar e remover cadastros, possibilitando, por exemplo, a remoção de um atendente e a adição de outro para substituí-lo. A classe Produto se estende para Peças, Consoles e Jogos. Cada classe possui seu próprio controller, que inclui funções para adicionar produtos, listar, buscar individualmente, remover do catálogo e vender o produto. Todas as funções dos controllers se iniciam com a chamada na classe SistemaGameStop onde os dados são coletados e enviados para as funções localizadas nos controllers , a classe SistemaGameStop é acionada a partir da classe Menu, iniciando os processos solicitados no menu.

Para executar o código, não é necessária a inclusão de pessoas ou produtos, pois já foram cadastrados exemplos previamente. Ao iniciar o programa, informe se deseja acessar como funcionário ou cliente. Acessando como funcionário, você terá acesso a todas as funções disponíveis:
FUNCIONÁRIO:
1. Adicionar
2. Visualizar
3. Buscar
4. Remover
5. Vender
6. Voltar
   
Adicionar: Selecione se deseja adicionar uma nova pessoa, novo produto ou se deseja adicionar no estoque. Ao selecionar uma nova pessoa, você poderá escolher adicionar Gerente, Atendente ou Cliente. Caso opte por adicionar um produto, será perguntado se deseja adicionar um Console, Peça ou Jogo, caso selecione adicionar no estoque será perguntado qual o tipo do item que deseja adicionar, após informar será solicitado o ID do item que você deseja adicionar o estoque

Visualizar: Selecione se deseja visualizar pessoas ou produtos. Ao escolher visualizar pessoas, será perguntado se deseja visualizar Gerente, Atendente ou Cliente. O sistema exibirá na tela todos os dados das pessoas do tipo selecionado. Ao escolher visualizar produtos, será perguntado qual tipo de produto deseja visualizar: Peças, Consoles ou Jogos. O sistema exibirá todos os dados dos produtos do tipo selecionado.

Buscar: Selecione se deseja buscar pessoas ou produtos. Ao escolher buscar pessoas, será perguntado se deseja buscar Funcionários ou Clientes. Para clientes, será solicitado o CPF do cliente que deseja buscar. Se o CPF estiver correto, os dados do cliente serão retornados. Para funcionários, será solicitado o CPF do funcionário que deseja buscar. Se o CPF estiver correto, o cadastro do funcionário será retornado.

Remover: Selecione se deseja remover pessoas ou produtos. Ao escolher remover pessoas, será perguntado se deseja remover Gerente, Atendente ou Cliente. Após escolher, será solicitado o CPF da pessoa que deseja remover. Se o CPF estiver correto, a pessoa será excluída, Caso escolhe Produto será questionado se deseja remover Console, Peça, Jogos ou se deseja remover um item do estoque, caso escolha remover um item, será solicitado o ID do item, após informado o item será removido do sistema, caso informe que deseja remover do estoque, será perguntado qual o tipo do item Peças, Consoles ou Jogos, escolhendo uma das opções o sistema irá perguntar o id do item que deseja remover.

Vender: Selecione qual tipo de item deseja vender: Peças, Consoles ou Jogos. Após informar, será solicitado o ID do item e a sua quantidade. O sistema perguntará se você realmente deseja prosseguir com a venda. Caso informe sim, o sistema solicitará o CPF do funcionário que está realizando a venda.

CLIENTE:
1. Visualizar
2. Buscar
3. Voltar
   
Visualizar: O cliente, diferentemente do funcionário, não pode acessar os cadastros de pessoas, apenas os de produtos. Informe qual tipo de produto deseja visualizar: Peças, Consoles ou Jogos. O sistema exibirá todos os produtos do tipo informado.

Buscar: O cliente não tem acesso aos cadastros de pessoas. Escolha qual tipo de produto deseja buscar. Após escolher, será solicitado o ID do produto. Informando o ID corretamente, serão exibidos os dados do produto buscado.

USO DE IA
O Copilot foi utilizado para a inclusão dos itens e pessoas, além de nos ajudar a validar o CPF do cadastro de pessoa.

Buscar: O cliente não tem acesso aos cadastros de pessoas. Escolha qual tipo de produto deseja buscar. Após escolher, será solicitado o ID do produto. Informando o ID corretamente, serão exibidos os dados do produto buscado.

USO DE IA

O Copilot foi utilizado para a inclusão dos itens e pessoas, além de nos ajudar a validar o CPF do cadastro de pessoa, ele tambem foi utilizado para ajustar o erro na função remover, o Chat GPT foi utilizado para corrigir o portugues da documentação.

Referencia: Codigo SitemaAcademia feito pelo professor.
