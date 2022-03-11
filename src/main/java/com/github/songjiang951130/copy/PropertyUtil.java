package com.github.songjiang951130.copy;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author songjiang
 * @since 2022-03-10
 */
public class PropertyUtil {

    public static void copy(Object source, Object target) {
        ConcurrentHashMap<String, Field> fieldMap = new ConcurrentHashMap<>(16);
        Class<?> targetClass = target.getClass();
        Field[] targetFields = targetClass.getDeclaredFields();
        Arrays.stream(targetFields).forEach(field -> fieldMap.put(field.getName(), field));
        Class<?> sourceClass = source.getClass();
        Field[] fields = sourceClass.getDeclaredFields();

        for (Field sourceField : fields) {
            String name = sourceField.getName();
            if (!fieldMap.containsKey(name)) {
                continue;
            }
            Field targetField = fieldMap.get(name);
            if (sourceField.getType() == targetField.getType()) {
                try {
                    targetField.setAccessible(true);
                    sourceField.setAccessible(true);
                    targetField.set(target, sourceField.get(source));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
