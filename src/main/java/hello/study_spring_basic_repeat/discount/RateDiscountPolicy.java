package hello.study_spring_basic_repeat.discount;

import hello.study_spring_basic_repeat.member.Grade;
import hello.study_spring_basic_repeat.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent =10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else{
            return 0;
        }

    }
}
