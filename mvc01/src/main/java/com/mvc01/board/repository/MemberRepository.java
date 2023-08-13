package com.mvc01.board.repository;

import com.mvc01.board.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
    private final SqlSessionTemplate sql;

    public int save(MemberDTO memberDTO) {
        System.out.println("member DTO = " + memberDTO);
        return sql.insert("Member.save",memberDTO);
    }
}