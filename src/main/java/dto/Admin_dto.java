package dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "kseeb")
public class Admin_dto {

	@Id
	@GeneratedValue(generator = "usn")
	@SequenceGenerator(initialValue = 2023012000, allocationSize = 1, sequenceName = "usn", name = "usn")
	int universitySeatNumber;
	String studentName;
	Date dob;
	String fatherName;
	String motherName;
	int kannada;
	int hindi;
	int english;
	int mathematics;
	int socialScience;
	int science;
	int totalMarks;
	double percentage;
	String result_type;

}
