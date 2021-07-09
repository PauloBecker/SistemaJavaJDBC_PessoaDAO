
public class Pessoa {
	
	private String primeiroNome;
	private String profissao;
	private String ultimoNome;
	private int id;
	private int idade;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(int id, String primeiroNome, String ultimoNome,int idade, String profissao) {
		this.primeiroNome = primeiroNome;
		this.profissao = profissao;
		this.ultimoNome = ultimoNome;
		this.id = id;
		this.idade = idade;
	}
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
}
