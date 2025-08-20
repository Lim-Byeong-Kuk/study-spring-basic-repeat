package hello.study_spring_basic_repeat;

import hello.study_spring_basic_repeat.discount.DiscountPolicy;
import hello.study_spring_basic_repeat.discount.RateDiscountPolicy;
import hello.study_spring_basic_repeat.member.MemberRepository;
import hello.study_spring_basic_repeat.member.MemberService;
import hello.study_spring_basic_repeat.member.MemberServiceImpl;
import hello.study_spring_basic_repeat.member.MemoryMemberRepository;
import hello.study_spring_basic_repeat.order.OrderService;
import hello.study_spring_basic_repeat.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}
