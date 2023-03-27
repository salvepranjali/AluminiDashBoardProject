package com.example.aluminidashboardP.studentDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
//DTO class use for the validation
public class StudentDTO {
	//validation for Student name
	@NotBlank(message="Invalid name=Empty Name")
	@NotNull(message="Invalid Name=Name is Empty")
	@Size(min=3,max=30,message="Invalid Name:Must Be of 0-30 character")
	private String name;
	//validation for Student Phone Number
	@NotBlank(message="Invalid Phone Number=Empty Number")
	@NotNull(message="Invalid Phone Number=Number is Empty")
	@Pattern(regexp="\\d(10)$",message="Invalid Phone Number.........")
	private String phone;
	//validation for Student Email
	@NotNull
	@Email(message="Invalid Email")
	private String email; 
	//validation for Student Graduation Year
	@NotBlank(message="Invalid name=Empty name")
	@NotNull(message="Invalid name=name is Empty")
	private String grdYear;

}
