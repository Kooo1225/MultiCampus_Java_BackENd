package org.galapagos.mcmorning.vo;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Member implements Serializable {
    private String userid;
    private String password;
    private String name;
    private String email;
}