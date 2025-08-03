package hello.study_spring_basic_repeat;

import hello.study_spring_basic_repeat.discount.FixDiscountPolicy;
import hello.study_spring_basic_repeat.member.MemberService;
import hello.study_spring_basic_repeat.member.MemberServiceImpl;
import hello.study_spring_basic_repeat.member.MemoryMemberRepository;
import hello.study_spring_basic_repeat.order.OrderService;
import hello.study_spring_basic_repeat.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }


}
