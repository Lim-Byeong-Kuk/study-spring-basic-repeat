package hello.study_spring_basic_repeat;

import hello.study_spring_basic_repeat.member.Grade;
import hello.study_spring_basic_repeat.member.Member;
import hello.study_spring_basic_repeat.member.MemberService;
import hello.study_spring_basic_repeat.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());

    }
}
