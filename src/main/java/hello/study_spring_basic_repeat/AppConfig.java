package hello.study_spring_basic_repeat;

import hello.study_spring_basic_repeat.discount.DiscountPolicy;
import hello.study_spring_basic_repeat.discount.FixDiscountPolicy;
import hello.study_spring_basic_repeat.discount.RateDiscountPolicy;
import hello.study_spring_basic_repeat.member.MemberRepository;
import hello.study_spring_basic_repeat.member.MemberService;
import hello.study_spring_basic_repeat.member.MemberServiceImpl;
import hello.study_spring_basic_repeat.member.MemoryMemberRepository;
import hello.study_spring_basic_repeat.order.OrderService;
import hello.study_spring_basic_repeat.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }


}
