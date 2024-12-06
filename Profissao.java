//SEMPRE iniciar com Classe public
public class Profissao {

	/*Variáveis ou atributos da Classe- tod tipo de variável q começa letra MAIÚSCULA é tipo referência, com letra minúscula é primitivo.
*/	 
	String nome;
	byte anosExperiencia;
	float salario;
	String descricao;

	//método construtor- ñ é obrigatório ser o mesmo nome, anosExperiencia, salario, descricao!!!
	public Profissao(String nome, byte anosExperiencia, float salario, String descricao) {
	this.nome = nome; //o this é usado para diferenciar os dois nome(da classe e do construtor)
	this.anosExperiencia = anosExperiencia; //se o nome das variáveis forem diferentes, retire o this.
	this.salario = salario;
	this.descricao = descricao; 
	}

	//método exibir infos
	public void exibirInformacao() {
	System.out.println("Seu Nome: " + nome);
	System.out.println("Anos de Experiência: " + anosExperiencia);
	System.out.println("Salário: " + salario);
	System.out.println("Descrição: " + descricao);
	}

	public static void main(String[] args) {
	Profissao prof1 = new Profissao("Médico", (byte) 10, 20000.50f,"Cardiologista");
	Profissao prof2 = new Profissao("Cientista de Dados", (byte) 3, 10000, "Machine Learning";
	Profissao prof3 = new Profissao("Engenheiro de Software", (byte) 5, 8000, "Arquitetura de Software");
	Profissao prof4 = new Profissao("Designer de UX/UI", (byte) 2, 5000, "Experiência do Usuário")
//para todo num diferente de int(byt,double, float) deve colocar o byte antes
	
	prof1.exibirInformacao();
	prof2.exibirInformacao();
	prof3.exibirInformacao();
	prof4.exibirInformacao();
	}
}
