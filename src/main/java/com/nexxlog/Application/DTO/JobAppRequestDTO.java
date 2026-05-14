package com.nexxlog.Application.DTO;

import com.nexxlog.Application.Model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JobAppRequestDTO {
    private User user;

}
