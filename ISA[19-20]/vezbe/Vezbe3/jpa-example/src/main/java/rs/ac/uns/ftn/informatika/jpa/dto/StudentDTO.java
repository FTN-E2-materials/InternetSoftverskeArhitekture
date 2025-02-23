package rs.ac.uns.ftn.informatika.jpa.dto;

import rs.ac.uns.ftn.informatika.jpa.model.Student;

public class StudentDTO {
	private Long id;
	private String index;
	private String firstName;
	private String lastName;

	public StudentDTO() {

	}

	public StudentDTO(Student student) {
		this(student.getId(), student.getIndex(), student.getFirstName(), student.getLastName());
	}

	public StudentDTO(Long id, String index, String firstName, String lastName) {
		this.id = id;
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
