package com.mvc01.board.repository;

import com.mvc01.board.dto.MemberDTO;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    public int save(MemberDTO memberDTO) {
        System.out.println("member DTO = " + memberDTO);
        return 0;
    }
}
