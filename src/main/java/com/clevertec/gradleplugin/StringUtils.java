package com.clevertec.gradleplugin;

import static org.apache.commons.lang3.math.NumberUtils.isParsable;
import static org.apache.commons.lang3.StringUtils.startsWith;

public class StringUtils {

    public static boolean isPositiveNumber(String string) {
        return isParsable(string) && !startsWith(string, "-");
    }
}
