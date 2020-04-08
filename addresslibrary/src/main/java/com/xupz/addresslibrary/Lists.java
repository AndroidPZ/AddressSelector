package com.xupz.addresslibrary;

/**
 * 作者：XPZ on 2020/4/8 11:34.
 */
import java.util.List;

public class Lists {
    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

    public static boolean notEmpty(List list) {
        return list != null && list.size() > 0;
    }
}

