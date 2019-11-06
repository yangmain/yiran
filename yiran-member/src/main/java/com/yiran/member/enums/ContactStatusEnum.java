/**
 * 
 */
package com.yiran.member.enums;

/**
 * <p>联系信息状态枚举</p>
 */
public enum ContactStatusEnum {

    INVALID(0, "已删除"), VALID(1, "正常");

    /** 代码 */
    private final Integer code;
    /** 信息 */
    private final String  message;

    ContactStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 通过代码获取枚举项
     * @param code
     * @return
     */
    public static ContactStatusEnum getByCode(Integer code) {
        if (code == null) {
            return null;
        }

        for (ContactStatusEnum ce : ContactStatusEnum.values()) {
            if (ce.getCode().equals(code)) {
                return ce;
            }
        }

        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}