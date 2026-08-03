package com.hj.my_investment_dashboard.user;

import lombok.Data;

@Data
public class SignupRequestDto {

    private String userId;
    private String email;
    private String password;

}
