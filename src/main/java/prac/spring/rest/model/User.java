package prac.spring.rest.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
	@NotEmpty(message = "Mandatory field and cant be empty.")
	private String id;

	@NotEmpty(message = "Mandatory field and cant be empty.")
	private String name;

	@Pattern(regexp = "^\\d{2}-[a-zA-Z]{3}-\\d{4}$")
	private String dob;
}
