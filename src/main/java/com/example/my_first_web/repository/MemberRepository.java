package com.example.my_first_web.repository;
import com.example.my_first_web.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원 저장
    Optional<Member> findById(Long id); // Id로 찾기
    Optional<Member> findByName(String name); // 이름으로 찾기
    List<Member> findAll(); //모든 리스트 반환

}