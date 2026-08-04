package com.hj.my_investment_dashboard.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void signup(SignupRequestDto dto){

        if(userRepository.existsByUserId(dto.getUserId())){
            throw new IllegalArgumentException("해당 아이디가 존재합니다.");
        }

        if(userRepository.existsBtEmail(dto.getEmail())){
            throw new IllegalArgumentException("해당 이메일로 만든 아이디가 이미 존재합니다.");
        }

        User user = User.builder()
                .userId(dto.getUserId())
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .build();

        userRepository.save(user);
    }
}
