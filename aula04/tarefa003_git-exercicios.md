### Tarefa 003: Git Exercícios - 03/06/2021.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?

```
$ git --version
```

2. Qual o efeito da execução de cada um dos comandos abaixo?

  a. git help
  
```
Apresenta uma lista de comandos git comumente usados.
```

  b. git help checkout

```
Exibe a documentação completa do comando git checkout.
```

  c. git help merge

```
Exibe a documentação completa do comando git merge.
```

  d. git init

```
Inicia um repositório git vazio no diretório atual.
```

  e. git add --all

```
Adiciona todos os arquivos do diretório atual à lista de arquivos monitorados pelo git. Em outras palavras: adiciona todos os arquivos do diretório ao index.
```

  f. git add -u
  
```
Adiciona à lista de arquivos monitorados apenas arquivos que foram modificados ou removidos, não adicionando nenhum arquivo novo. Em outras palavras: atualiza os arquivos que já estão no index, sem adicionar novos arquivos.
```
  
  g. git config -l

```
Exibe uma lista das configurações que o git conseguir encontrar.
```

  h. git mv a.txt b.txt

```
Adiciona o arquivo b.txt à lista de arquivos monitorados e remove o arquivo a.txt da lista de arquivos monitorados.
```

  i. git reset --hard

```
Irá descartar todas as mudanças que estão no index e não foram comitadas.
```

  j. git log -27

```
Exibe uma lista dos últimos 27 commits realizados.
```
  
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?

```
$ git add --all
$ git commit
```
  
4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?

```
$ git show
```

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?

```
$ git status -u
```

6. Qual o comando para efetuar um _commit_?

```
$ git commit -m <mensagem>
```

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?

```
$ git checkout -- teste.txt
```

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.

```
Para que um diretório seja ignorado pelo git, é preciso criar o arquivo ".gitignore" e dentro dele, colocar o nome do diretório que deve ser ignorado.
```

9. O que acontece se o seu repositório local for acidentalmente removido?

```
Caso o repositório local seja removido, ainda é possível clonar o repositório remoto, caso exista um.
```

10. Como clonar um repositório remoto?

```
Basta usar o comando
$ git clone <HTTPS do repositório remoto>
```

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?

```
$ git log --oneline
```

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?

```
Para saber onde se encontra o arquivo com as configurações do git, basta executar o comando
$ git config --list --show-origin
```

13. Qual o comando para criar um repositório local?

```
$ git init
```

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?

```
.git
```

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)

```
git add --all
```

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?

```
Para identificar cada commit feito, o git usa funções hash SHA1, que levam em consideração o conteúdo do commit, gerando ao final uma string de 40 caracteres hexadeciamais.
O propósito disso é justamente a identificação única de cada commit feito localmente, para que seja fácil a navegação entre eles.
SHA1 é uma função hash de criptografia projetada pela Agência de Segurança Nacional dos Estados Unidos.
```

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?

```
HEAD
```

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?

```
Não, pois o comando $ git add -u apenas atualiza os arquivos que já estão no index e foram modificados ou removidos, sem adicionar novos arquivos.
```

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**

```
$ git reset --soft HEAD~1 irá cancelar o último commit e deixar as modificações no index.
Já $ git reset --hard, irá descartar todas as modificações dentro do index.

Assim, o resultado será a reversão de todas as modificações feitas no último commit.
```

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?

```
$ git clean -fd
```

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?

```
.gitignore
```

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?

```
Para que todos os arquivos com a extensão .class sejam ignorados, deve ser adicionado, no arquivo .gitignore, a linha de texto "*.class".
```

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.

```
Escolha o diretório onde deseja clonar o repositório.
Execute o comando $ git clone https://github.com/jquery/jquery.git
```

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?

```
O comando irá mostrar um resumo dos log dos commits feitos, com a descrição de cada commit ocultado, o número de commits feitos por cada contribuidor, em ordem decrecente de quantidade de commits feitos e com o e-mail de cada contribuidor.
```

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?

```
Mostra os repositórios remotos das branches monitoradas
no caso do jqueryrepo, o resultado mostrado é:
origin  https://github.com/jquery/jquery.git (fetch)
origin  https://github.com/jquery/jquery.git (push)
```

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?

```
$ git tag
```

27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?

```
Para que sejam retornadas apenas etiquetas que iniciem com o padrão 2.0, basta executar o comando $ git tag -l "2.0*"
```

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?

```
Esse comando cria uma tag anotada, com o "nome" de 3.4-gold e a descrição "minha versão ouro".
```

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?

```
É exibido o commit com a etiqueta 3.4-gold.
```

30. O que o comando **git push origin 3.4-gold** teria como efeito?

```
Faz o push do commit 3.4-gold para a origin do repositório remoto.
```

31. Após executar um commit, qual o efeito de **git commit --amend**?

```
Esse comando serve para alterar o commit feito, sem precisar fazer um novo.
```

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?

```
o arquivo x.txt irá ser retirado do index, mas as alterações do arquivo serão mantidos.
```

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?

```
Esse comando irá descartar as modificações feitas em arquivos que não estão no index..
```

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?

```
No git reset, os arquivo a.txt é retirado do index mas mantém as alterações.
No git checkout, o arquivo perderá as alterações feitas, caso ele permanece não esteja no index.
```

35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.

```
Esse comando é utilizado para comparar o penúltimo e último commit feitos, mostrando em detalhes os arquivos alterados e as alterações feitas.
```











</DIV/>
