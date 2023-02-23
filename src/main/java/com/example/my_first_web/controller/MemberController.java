package com.example.my_first_web.controller;


import com.example.my_first_web.domain.Member;
import com.example.my_first_web.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";//createMemberForm.html이 반환됨
    }

    @PostMapping("/members/new")
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());//form에서 이름을 가져와서 새로 생성한 member에 저장

        memberService.join(member); //회원가입 메소드

        return "redirect:/"; // localhost:8080/  <-로 가도록 반환함
    }

    @GetMapping("/members")
    public String list(Model model){
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members); //members 자체를 model에 담아서 화면에 넘김
        return "members/memberList";
    }

}