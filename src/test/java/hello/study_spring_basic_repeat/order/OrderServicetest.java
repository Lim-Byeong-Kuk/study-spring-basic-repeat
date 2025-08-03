package hello.study_spring_basic_repeat.order;

import hello.study_spring_basic_repeat.AppConfig;
import hello.study_spring_basic_repeat.member.Grade;
import hello.study_spring_basic_repeat.member.Member;
import hello.study_spring_basic_repeat.member.MemberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderServicetest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "iteamA", 10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
