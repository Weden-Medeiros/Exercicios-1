package entities;

public class Pessoa 
{
	
	    private String nome;
	    private int idade;
	    private String telefone;

	    /*public Pessoa() {
			super();
			
		}*/

		//// ////

	    public Pessoa(String nome, int idade, String telefone) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.telefone = telefone;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		@Override
		public String toString() 
	    {
			return "\nNome: " + nome +
					"\nIdade: " + idade + 
					"\nTelefone: " + telefone;
		}
	   

}
