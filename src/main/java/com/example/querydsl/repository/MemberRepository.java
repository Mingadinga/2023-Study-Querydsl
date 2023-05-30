package com.example.querydsl.repository;

import com.example.querydsl.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
    // 기본적인 crud나 정적 쿼리는 JpaRepository가 이름으로 매칭해서 구현체를 만들어줌

    // select m from Member m where m.username = ?
    List<Member> findByUsername(String username);
}
