package com.kedu.user.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserEntity {
    private int i_user;
    private String uid;
    private String upw;
    private String nm;
    private String rdt;
}
