package org.galapagos.mcmorning.vo;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private String userid;
    private String password;
    private String name;
    private String email;


}