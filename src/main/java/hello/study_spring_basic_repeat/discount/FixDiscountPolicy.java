package hello.study_spring_basic_repeat.discount;

import hello.study_spring_basic_repeat.member.Grade;
import hello.study_spring_basic_repeat.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000; //1000원 할인
    
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
