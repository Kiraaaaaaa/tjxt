package com.tianji.promotion.constants;

public interface PromotionConstants {
    String COUPON_CODE_SERIAL_KEY = "coupon:code:serial"; // 用于生成兑换码的最大序列号
    String COUPON_CODE_MAP_KEY = "coupon:code:map"; // 用于验证兑换码是否已兑换的bitmap
    String COUPON_CACHE_KEY_PREFIX = "prs:coupon:"; // 优惠券缓存前缀
    String USER_COUPON_CACHE_KEY_PREFIX = "prs:user:coupon:"; // 缓存某优惠券对于某些用户已领取的数量
    String COUPON_RANGE_KEY = "coupon:code:range"; //

    String[] RECEIVE_COUPON_ERROR_MSG = {
            "活动未开始",
            "库存不足",
            "活动已经结束",
            "领取次数过多",
    };
    String[] EXCHANGE_COUPON_ERROR_MSG = {
            "兑换码已兑换",
            "无效兑换码",
            "活动未开始",
            "活动已经结束",
            "领取次数过多",
    };
}