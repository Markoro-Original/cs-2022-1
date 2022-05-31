### Semana 1 - Dia 25/05/2022 - Aulas 001a004 - Atividade Supervisionada


1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).




# Rest API

## Introdução e Conceitos

&nbsp;&nbsp;&nbsp;Rest API é uma interface de programação de aplicações que posibilita interações com serviçoes web seguindo as restrições do estilo de arquitetura Rest.

## API

&nbsp;&nbsp;&nbsp;Uma API, sigla em inglês para "Application Programming Interface" (Interface de Programação Aplicada), nada mais é que o conjunto de protocolos que serão utilizados durante a integração ou uso de aplicações de sofrware.

&nbsp;&nbsp;&nbsp;Em outras palavras, durante o uso de um sistema, a API irá estabelecer o conteúdo exigido do usuário (chamada) e o conteúdo exibido pelo servidor (resposta), facilitando a compreenção do que é pedido do sistema e o que o cliente deve fornecer para obter o desejado.

&nbsp;&nbsp;&nbsp;Além da comunicação, outra vatagem do uso de API é a abstração fornecida, não sendo necessário a total compreenção do funcionamento de um sistema para que se possa utilizá-lo de maneira eficiente.

## Rest

&nbsp;&nbsp;&nbsp;Rest é uma arquitetura computacional criada por Roy Fielding em 2000 na sua tese de doutorado, na qual ele descrevia uma arquitetura de software que servisse para aplicações em rede. O nome Rest é uma sigla que, em inglês, significa "Tansferência de Estado Representacional".

&nbsp;&nbsp;&nbsp;O Rest não é necessariamente um protocolo ou padrão, como é uma API normalmente, mas sim um conjunto de restrições de arquitetura, sendo possível aos desenvolvedores implementá-lo de maneiras variadas na hora de criar uma API RESTful.

&nbsp;&nbsp;&nbsp;A aplicação mais conhecida de Rest é a própria World Wide Web, que utilizou a arquitetura como base para o desenvolvimento do HTTP 1.1. Quando uma solicitação usando uma API Rest é feita, é transferida uma representação do estado do recurso ao solicitante ou endpoint. Essa representação é entregue via HTTP utilizando um dos vários formatos possíveis: Javascript Object Notation (JSON), HTML, XLT, Python, PHP ou texto sem formatação.

## Principais Características

&nbsp;&nbsp;&nbsp;Para uma API ser considerada RESTful, ela precisa está em conformidade com algumas características importantes:

- Solicitações HTTP:
  - A API deve consistir de uma arquitetura formada por clientes, servidores e recursos, com requisições gerenciadas por HTTP.

- Comunicação stateless:
  - A comunicação entre cliente e servidor deve ser stateless. Ou seja, cada requisição é tratada como uma transação que não depende de requisições anteriores, de forma que a comunicação consista de pares de requisição e resposta independentes.

- Armazenamento em cache:
  - A API deve armazenar dados em cache para otimizar a comunicação entre usuário e servidor.

- Interface uniforme:
  - Para que a aplicação tenha uma interface uniforme entre os componentes, é necessária que os recursos solicitados possam ser manipulados pelo usuário e sejam identificáveis e estejam separados das representações enviadas ao cliente. Além disso, as mensagens autodescritivas retornadas ao cliente devem conter informações suficientes para descrever como processá-las e, após acessar um recurso, o cliente deve ser capaz de usar hiperlinks para encontrar as demais ações disponíveis para ele no momento.

- Sistema em camadas:
  - Ter um sistema que organiza os tipos de servidores envolvidos na recuperação das informações solicitadas em hierarquias que o cliente não seja capaz de visualizar.

&nbsp;&nbsp;&nbsp;Apesar de precisar estar de acordo com todos os critérios mencionados, a arquitetura Rest é tem uma maior preferência do público devido ao seu conjunto de diretrizes que podem ser implementadas conforme necessário fazendo com que sejam mais rápidas, leves e escaláveis quando comparada com outros protocolos como o SOAP que precisam cumprir com exigências de segurança incorporada e transações, o que o torna mais lento e pesado.
