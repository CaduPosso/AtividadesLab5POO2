Questão 3 - Um sistema de segurança precisa controlar o acesso a um objeto sensível (como uma conta bancária). O acesso a este objeto deve ser limitado a usuários
autenticados, ou seja, não se pode acessar os dados da conta bancária sem antes passar por uma validação de autenticação.
Neste contexto, o padrão Proxy é adequado. Ele atua como um intermediário entre o cliente e o objeto real (ContaBancaria), realizando a verificação da autenticação antes de permitir o
acesso às operações da conta.

Classes:
ContaBancaria (Interface): Define as operações que podem ser realizadas em uma conta bancária.
ContaBancariaReal: Implementa a interface ContaBancaria e contém a lógica real de manipulação dos dados da conta bancária.
ContaBancariaProxy: Atua como um intermediário, verificando se o cliente está autenticado antes de delegar as operações à ContaBancariaReal.
