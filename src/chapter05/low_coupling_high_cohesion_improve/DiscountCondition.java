package chapter05.low_coupling_high_cohesion_improve;

import java.time.DayOfWeek;
import java.time.LocalTime;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
