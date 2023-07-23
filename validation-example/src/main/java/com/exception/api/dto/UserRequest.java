package com.exception.api.dto;

import lombok.*;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor (staticName= "build")
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "username should not be null")
    private String name;

    @Email(message="invalid email address")
    private String email;

    @Pattern(regexp="^\\d{10}$", message="invalid mobile number entered")
    private String mobile;

    private String gender;

    @Min(18)
    @Max(60)
    private int age;

    @Getter
    @Setter
    private String ageWhenPassedSchool;

    @NotBlank
    private String nationality;

}
