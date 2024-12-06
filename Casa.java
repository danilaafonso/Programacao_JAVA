/* Autor: Danila 
   Data: 23/10/2024
   Hora: 17h
*/

// criação da classe Casa
public class Casa {

      //atributos-variáveis de instância da Classe
      private String endereco;
      private int numeroDeQuartos;
      private int numeroDeBanheiros;
      private boolean luzesAcesas;  

      // método construtor da Classe
      public Casa(String endereco, int numeroDeQuartos, int numeroDeBanheiros) {
           this.endereco = endereco;
           this.numeroDeQuartos = numeroDeQuartos;
           this.numeroDeBanheiros = numeroDeBanheiros;
       }

       //método para exibir as informações da Classe
       public void exibirInformacoes() {

              System.out.println("Endereço: " + endereco);
              System.out.println("Número de Quartos: " + numeroDeQuartos);
              System.out.println("Número de Banheiros: " + numeroDeBanheiros);

       }

       //método main por onde o programa executa
       public static void main(String[] args) { 

	     //criando um objeto de casa
             Casa minhaCasa = new Casa("123 Rua Alegre", 3, 2);
             
	     //exibindo informações
	     minhaCasa.exibirInformacoes();

        }
}