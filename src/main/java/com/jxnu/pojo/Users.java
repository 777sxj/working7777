package com.jxnu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private int userid;
    private String username;
    private String password;
    private long telephone;
    private String email;
    private String home;




}
