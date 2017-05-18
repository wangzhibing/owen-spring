package com.owen.spring.boot.web.util;

/**
 * Created by daishuang on 15/7/25.
 */
public final class StringUtils {

    private static final String	DB_ESCAPSE			= "[%_]";

    private static final String	DB_ESCAPSE_CODE		= "\\\\$0";

    private static final String	DB_STRICT_CHAR_REG	= "[\\w\\d]+";

    /**
     * 不可实例化.
     */
    private StringUtils() {
    }

    /**
     *  判断字符串是否为空白字符串，空("")或者null.
     * @param value value
     * @return 结果
     */
    public static boolean isBlank(String value) {
        return org.apache.commons.lang3.StringUtils.isBlank(value);
    }


    /**
     * 判断字符串是否为空白字符串，空("")或者null.
     * @param value value
     * @return 结果
     */
    public static boolean isNotBlank(String value) {
        return !StringUtils.isBlank(value);
    }


    /**
     *
     * 判断字符串是否为空("")或者null.
     * @param value value
     * @return 结果
     */
    public static boolean isEmpty(String value) {
        return org.apache.commons.lang3.StringUtils.isEmpty(value);
    }

    /**
     *
     * 判断字符串是否为空("")或者null.
     * @param value value
     * @return 结果
     */
    public static boolean isNotEmpty(String value) {
        return !StringUtils.isEmpty(value);
    }

    /**
     *
     * 移除开头和结尾的空白字符
     * @param value value
     * @return 结果
     */
    public static String trim(String value) {
        return org.apache.commons.lang3.StringUtils.trim(value);
    }

    /**
     *
     * 将字符串中针对LIKE表达式的预留SQL字符进行转义.
     * @param value value
     * @return 结果
     */
    public static String escapseSql(String value) {
        return StringUtils.isEmpty(value) ? value : value.replaceAll(DB_ESCAPSE, DB_ESCAPSE_CODE);
    }


    /**
     *
     * 将字符串中的预留HTML字符转换为HTML实体.
     * @param value value
     * @return 结果
     */
    public static String escapseHtml(String value) {
        return org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(value);
    }

    /**
     *
     * @param value value
     * @return 结果
     */
    public static boolean isDBStrictChar(String value) {
        return isBlank(value) ? false : value.matches(DB_STRICT_CHAR_REG);
    }

    public static boolean contains(String  seq, String  searchChar){
        return org.apache.commons.lang3.StringUtils.contains(seq,searchChar);

    }
}
