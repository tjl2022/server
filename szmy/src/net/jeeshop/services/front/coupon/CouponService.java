package net.jeeshop.services.front.coupon;import java.util.List;import net.jeeshop.core.Services;import net.jeeshop.services.front.coupon.bean.Coupon;public interface CouponService extends Services<Coupon> {	List selectAccCoupon(Coupon c);}