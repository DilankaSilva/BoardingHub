package com.groupi.boardinghub.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    //@JsonProperty("company")-can give a short name
    private String firstName;
    private String lastName;
    private String password;
    private float length;
    private float depth;


}
