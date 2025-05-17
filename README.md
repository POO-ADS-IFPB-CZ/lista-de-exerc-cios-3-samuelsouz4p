#### Questão 4
##### a) Em arrays de tipos primitivos como int[] ou double[], a memória é alocada de forma contínua e direta, com cada elemento ocupando exatamente o espaço correspondente ao seu tipo (por exemplo, 4 bytes para int). Isso significa que o array armazena os valores em si, e todos os elementos já possuem um valor padrão (como 0 para inteiros) logo após a alocação. Já em arrays de objetos como Aluno[] ou Produto[], o que é armazenado no array são referências para objetos e não os objetos em si. Inicialmente, todas essas referências são null, e a memória para os objetos precisa ser alocada separadamente, utilizando o operador new para cada posição do array.

##### b) O principal cuidado ao acessar elementos de um array de objetos é garantir que cada posição do array já tenha sido corretamente instanciada antes de ser utilizada. Como os arrays de objetos armazenam apenas referências, qualquer tentativa de usar um método ou acessar um atributo de uma referência null causará um erro do tipo NullPointerException. Por isso, é importante verificar se o elemento não é null antes de acessá-lo, especialmente ao percorrer o array com laços de repetição. Inicializar todos os objetos do array antes de usá-los é uma boa prática para evitar esses problemas.








