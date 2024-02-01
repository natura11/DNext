package com.utilities.enums;

import java.util.HashMap;

public enum ResponsiveDevices {
    IPHONE_PRO_MAX(new HashMap<String,Integer>(){{
        put("width", 650 );
        put("height",700);
    }}),
    IPHONE12(new HashMap<String,Integer>(){{
        put("width",680);
        put("height",700);
    }});

    ResponsiveDevices(HashMap<String, Integer> value) {
        this.value=value;
    }

    private HashMap<String, Integer> value;

    public HashMap<String, Integer> getValue() {
        return value;
    }
}
