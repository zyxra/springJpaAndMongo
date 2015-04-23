package sample.data.jpa.domain;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ToString(exclude="id")
public class Attractions implements Serializable {

	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	public Long id;

	@Column(nullable = false)
	@Getter @Setter public String name;

	@Column(nullable = false)
	@Getter @Setter public String description;

	protected Attractions() {
	}

	public Attractions(String name, String description) {
		super();
		this.name = name;
		this.description =description;
	}
}