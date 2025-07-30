package hello.study_spring_basic_repeat.discount;

import hello.study_spring_basic_repeat.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
