package chapter02.booking_movie_system;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
