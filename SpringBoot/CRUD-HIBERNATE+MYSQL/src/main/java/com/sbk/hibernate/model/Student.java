package com.sbk.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//Java™ Persistence API
//The Java™ Persistence API (JPA) provides a mechanism for managing 
//persistence and object-relational mapping and functions since the 
//EJB 3.0 specifications.

//JPA Entity Class

@Entity
@Table(name = "student")
public class Student {
	
//	There are four different strategies to generate primary key
//	You will get using GeneratedValue Annotation and provide the Strategy
//	Identity
//	
//	Primary Key
	@Id
//	AUto Generated + increment id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	IDENTITY (Oracle 11 series before not compatible)
//	sequence-generator(Not supported by SQL)
//	TABLE(Creates Virtual Table and store id of various Tables)
//	It will act as Identity if Hibernate version > 5 and using SQL -->Auto Increament
//	Column is used to give column name
	@Column(name = "id")
	private long id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	
	
//	Composite Key
/*
 * Make Separate Class in Java, StudentCompositeKey:: Defined Required field for POJO-> Part of JPA
 * Annotate the class with @Embeddable
 * No Separate Table is Created
 * Make the Embeddable Class Serializable
 * implement Serializable Interface
 * Now use in the given class with @Embedded not the @Id
 * 
 * More Ways/Another Ways -> Part of Hibernate
 * @IdClass to Entity Class
 * @Id :: Multiple Fields
 * 
*/
	
/*
 * Mappings->Covered in Next Class
 */
	
	public Student() {
		super();
	}
	public Student(String firstName, String lastName, String email) {
		super();
//		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
}
