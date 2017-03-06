package br.edu.impacta.ads;

public class Contato {
	private String nome;
	private String telfone;
	public Contato() {
		super();
	}
	public Contato(String nome, String telfone) {
		super();
		this.nome = nome;
		this.telfone = telfone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelfone() {
		return telfone;
	}
	public void setTelfone(String telfone) {
		this.telfone = telfone;
	}
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telfone=" + telfone + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telfone == null) ? 0 : telfone.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telfone == null) {
			if (other.telfone != null)
				return false;
		} else if (!telfone.equals(other.telfone))
			return false;
		return true;
	}

}
