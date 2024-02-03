package optiim.framework.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TypeConversion {
    public static List<Integer> getNullIfIntegerListNull(String strArr){
        List<Integer> result = null;
        if(strArr != null)
                result = Arrays.stream(strArr.replaceAll("\\s", "").split(",")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        return result;
    }

    public static Object getNullIfObjectNull(Object object){
        Object result = null;
        if (object != null){
            result = object;
        }
        return result;
    }

    public static List getNullIfObjectNull(List list){
        List result = null;
        if (list != null){
            result = list;
        }
        return result;
    }

    public static Integer getNullIfIntegerNull(String str){
        Integer result = null;
        if (str != null){
            result = Integer.parseInt(str);
        }
        return result;
    }

    public static Long getNullIfLongNull(String str){
        Long result = null;
        if (str != null){
            result = Long.parseLong(str);
        }
        return result;
    }

    public static Boolean getNullIfBooleanNull(String str){
        Boolean result = null;
        if (str != null){
            result = Boolean.parseBoolean(str);
        }
        return result;
    }

    public static <E extends Enum<E>> E valueOf(Class<E> enumType, String s, E defultValue) {
        try {
            return Enum.valueOf(enumType, s);
        } catch (Exception e) {
            return defultValue;
        }
    }

}
