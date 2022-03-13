package Demo.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import Demo.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

	@JsonIgnore
	
	private long id;
	
	
	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("randomLastName!")
	private String lastName;
	private String email;
	public StudentResponse(Student student)
	{
		this.id = student.getId();
		this.firstName=student.getFirstName();
		this.lastName=student.getLastName();
		this.email=student.getEmail();
		
	}
	
	
	
	
	
	
}
