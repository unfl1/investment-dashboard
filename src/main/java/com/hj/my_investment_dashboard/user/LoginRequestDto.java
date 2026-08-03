package com.hj.my_investment_dashboard.user;

import lombok.Data;

@Data
public class LoginRequestDto {

    private String userId;
    private String password;

}
