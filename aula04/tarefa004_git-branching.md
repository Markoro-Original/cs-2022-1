### Tarefa 004: Git Branching - 03/06/2021

1. Qual o nome do branch padrão do Git?

```
master
```

2. O que o comando **<code>git branch nome</code>** realiza?

```
Esse comando cria uma branch "nome".
```

3. Como criar um branch a partir de um commit específico?

```
Uma branch pode ser criada a partir de um commit específico, utilizando o código hash desse commit depois do comando de criação de branch.
$ git branch <nome da branch> <SHA1 do commit>
```

4. Em um repositório, qual o efeito do comando **<code>git checkout -b bugfix/234</code>**?

```
Esse comando irá criar a branch bugfix/234 e imediatamente mudar o HEAD pra a nova branch.
```

5. Qual o comando para se alternar para um branch de nome **experimento2**?

```
$ git checkout experimento2
```

6. Em um repositório com dois branches, **b1** e **b2**, onde b1 é o corrente, qual o efeito do comando **<code>git branch</code>**?

```
Ess comando irá retornar a mensagem:

* b1
  b2

Sendo que o * indica a branch atual.
```

7. O que o comando **<code>git checkout -b</code>** nome faz?

```
Esse comando cria uma nova branch com o nome inserido e imediatamente muda o HEAD pra a branch criada.
```

8. Qual a função do <code>**comando git branch -d teste</code>**?

```
Esse comando irá deletar a branch teste caso a mesma não tenha nenhum commit diferente dos commits presentes na master.
```

9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.

```
$ git log --oneline --decorate --parents
b715475 (HEAD -> master) Primeiro commit

$ git branch teste_CSS

$ git branch
* master
  teste_CSS
  
$ git branch teste_JSF

$ git branch
* master
  teste_CSS
  teste_JSF
  
$ git branch -v
* master    b715475 Primeiro commit
  teste_CSS b715475 Primeiro commit
  teste_JSF b715475 Primeiro commit
  
$ git add --all

$ git commit -m "Arrumando as cores do site usando HTML"
[master c6894df] Arrumando as cores do site usando HTML
1 file changed, 2 insertions(+), 1 deletion(-)

$ git branch -v
* master    c6894df Arrumando as cores do site usando HTML
  teste_CSS b715475 Primeiro commit
  teste_JSF b715475 Primeiro commit

$ git log --oneline --decorate --parents
c6894df b715475 (HEAD -> master) Arrumando as cores do site usando HTML
b715475 (teste_JSF, teste_CSS) Primeiro commit

$git checkout teste_CSS
Switched to branch 'teste_CSS'

$ git add --all

$ git commit -m "Colocando tags no HTML e arrumando cores com CSS"
[teste_CSS b65d248] Colocando tags no HTML e arrumando cores com CSS
 2 files changed, 3 insertions(+), 1 deletion(-)
 create mode 100644 css_do_site

$ git branch -v
  master    c6894df Arrumando as cores do site usando HTML
* teste_CSS b65d248 Colocando tags no HTML e arrumando cores com CSS
  teste_JSF b715475 Primeiro commit

$ git log --oneline --decorate --parents
b65d248 b715475 (HEAD -> teste_CSS) Colocando tags no HTML e arrumando cores com CSS
b715475 (teste_JSF) Primeiro commit

$ git checkout teste_JSF
Switched to branch 'teste_JSF'

$ git add --all

$ git commit -m "Testando criação do site com JavaServer Faces"
[teste_JSF 6b9e274] Testando criação do site com JavaServer Faces
 1 file changed, 1 insertion(+)
 create mode 100644 site_em_JSF

$ git branch -v
  master    c6894df Arrumando as cores do site usando HTML
  teste_CSS b65d248 Colocando tags no HTML e arrumando cores com CSS
* teste_JSF 6b9e274 Testando criação do site com JavaServer Faces

$ git log --oneline --decorate --parents
6b9e274 b715475 (HEAD -> teste_JSF) Testando criação do site com JavaServer Faces
b715475 Primeiro commit

$ git checkout master
Switched to branch 'master'

$ git branch --no-merged
  teste_CSS
  teste_JSF
  
$ git merge teste_CSS -m "Juntando alterações HTML e CSS"
Auto-merging html_do_site
CONFLICT (content): Merge conflict in html_do_site
Automatic merge failed; fix conflicts and then commit the result.

$ git add --all

$ git commit -m "Arrumando conflitos no arquivo de HTML"
[master 33645b9] Arrumando conflitos no arquivo de HTML

$ git log --oneline --decorate --parents
33645b9 c6894df b65d248 (HEAD -> master) Arrumando conflitos no arquivo de HTML
b65d248 b715475 (teste_CSS) Colocando tags no HTML e arrumando cores com CSS
c6894df b715475 Arrumando as cores do site usando HTML
b715475 Primeiro commit

$ git branch --no-merged
  teste_JSF

$ git branch -d teste_JSF
error: The branch 'teste_JSF' is not fully merged.
If you are sure you want to delete it, run 'git branch -D teste_JSF'.

$ git branch -D teste_JSF
Deleted branch teste_JSF (was 6b9e274).

$ git branch -v
* master    33645b9 Arrumando conflitos no arquivo de HTML
  teste_CSS b65d248 Colocando tags no HTML e arrumando cores com CSS
```

</DIV/>
