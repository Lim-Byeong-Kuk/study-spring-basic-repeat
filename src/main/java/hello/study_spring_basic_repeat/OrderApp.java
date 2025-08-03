package hello.study_spring_basic_repeat;

import hello.study_spring_basic_repeat.member.Grade;
import hello.study_spring_basic_repeat.member.Member;
import hello.study_spring_basic_repeat.member.MemberService;
import hello.study_spring_basic_repeat.order.Order;
import hello.study_spring_basic_repeat.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());
    }
}
