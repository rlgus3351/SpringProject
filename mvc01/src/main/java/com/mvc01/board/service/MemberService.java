package com.mvc01.board.service;

import com.mvc01.board.dto.MemberDTO;
import com.mvc01.board.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public int save(MemberDTO memberDTO){

        return memberRepository.save(memberDTO);
    }
}
