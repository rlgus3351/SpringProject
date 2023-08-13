package com.mvc01.board.controller;

import com.mvc01.board.dto.MemberDTO;
import com.mvc01.board.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/member")
@RequiredArgsConstructor

public class MemberController {
    private final MemberService memberService;
    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }
    @PostMapping("/save")
    //public String save(@RequestParam) --> 사용 가능하다. dto 클래스가 있어야한다.
    public String save(@ModelAttribute MemberDTO memberDTO){
        int saveResult = memberService.save(memberDTO);
        if(saveResult >0){
            return "login";
        }else {
            return "save";
        }
    }



}
