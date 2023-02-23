package com.example.my_first_web;

import com.example.my_first_web.repository.MemberRepository;
import com.example.my_first_web.repository.MemoryMemberRepository;
import com.example.my_first_web.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}