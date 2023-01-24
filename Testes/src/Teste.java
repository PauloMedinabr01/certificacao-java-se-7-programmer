  /*
   * Não compila. Falta um ponto-e-vírgula após a impressão, na linha 6.
   * Isso é normal. Durante a prova, você precisará não apenas analisar o comportamento do 
   * código, também precisará se atentar as pequenas regras necessárias para que o código 
   * compile. Para facilitar, veja antes se existe alguma alternativa indicando que o código 
   * não compila, caso ela exista, verifique cada ponto-e-vírgula, visibilidade, escopo de 
   * variáveis, nomes e parâmetros de métodos, etc.
   */
  
  class Teste{

    static int id = 1;
  
    public static void main(String[] args){
      System.out.println(id)
      id = id + 1;
    }
  }