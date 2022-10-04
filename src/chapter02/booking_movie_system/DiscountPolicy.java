package chapter02.booking_movie_system;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
