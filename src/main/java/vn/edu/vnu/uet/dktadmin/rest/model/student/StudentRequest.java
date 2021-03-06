package vn.edu.vnu.uet.dktadmin.rest.model.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class StudentRequest {
    @JsonProperty(value = "Id")
    private Long id;

    @JsonProperty(value = "Email")
    private String email;

    @JsonProperty(value = "StudentCode")
    private String studentCode;

    @JsonProperty(value = "Course")
    private String course;

    @JsonProperty(value = "DateOfBirth")
    private String dateOfBirth;

    @JsonProperty(value = "FullName")
    private String fullName;

    @JsonProperty(value = "Gender")
    private Integer gender;
}
