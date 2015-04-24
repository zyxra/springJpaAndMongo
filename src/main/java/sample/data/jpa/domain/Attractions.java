package sample.data.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Attractions implements Serializable {

	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	public Long id;

	@Column(nullable = false)
	public String name;

	@Column(nullable = false)
	public String description;

	protected Attractions() {
	}

	public Attractions(String name, String description) {
		super();
		this.name = name;
		this.description =description;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return "sample.data.jpa.domain.Attractions(name=" + this.getName() + ", description=" + this.getDescription() + ")";
	}
}