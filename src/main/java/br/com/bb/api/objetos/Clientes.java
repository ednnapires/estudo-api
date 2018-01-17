package br.com.bb.api.objetos;
 
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "clientes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Clientes {
 
    private String id;
    private String nome;
    private String endereco;
 
    // This default constructor is required if there are other constructors.
    public Clientes() {
 
    }
 
    public Clientes(String id, String nome, String endereco) {
        this.setId(id);
        this.setNome(nome);
        this.setEndereco(endereco);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
  
}