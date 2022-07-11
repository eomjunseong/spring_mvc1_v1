package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;
import java.util.List;
import java.util.Map;
public class MemberListControllerV3 implements ControllerV3 {
    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public ModelView process(Map<String, String> paramMap) {
        
        List<Member> members = memberRepository.findAll();
        
        //뷰네임
        ModelView mv = new ModelView("members");
        //사용값 대입
        mv.getModel().put("members", members);
        return mv;
    }
}