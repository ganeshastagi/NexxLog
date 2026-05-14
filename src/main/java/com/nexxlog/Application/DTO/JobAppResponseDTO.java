package com.nexxlog.Application.DTO;

import com.nexxlog.Application.Model.ApplicationStatus;
import com.nexxlog.Application.Model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JobAppResponseDTO {
    private User user;
    private String companyName;
    private String role;
    private LocalDate appliedDate;
    private String jobLink;
    private String comment;
//    private byte[] resume;
    private ApplicationStatus status = ApplicationStatus.APPLIED;
}
