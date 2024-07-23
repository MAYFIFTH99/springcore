package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(Member member, int price) {
        return 0;
    }
}
