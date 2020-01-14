package com.marvel.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description
 * @Author wupeng
 * @Date 2020-01-02 11:34
 **/
public final class DateTimeUtil {

    private final static String FORMATTER_DEFAULT = "yyyy-MM-dd HH:mm:ss";

    public static String now(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMATTER_DEFAULT);
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }

    public static void main(String[] args) {
        System.out.println(now());
    }


}
