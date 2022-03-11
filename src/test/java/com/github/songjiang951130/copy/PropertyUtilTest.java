package com.github.songjiang951130.copy;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author songjiang
 * @since 2022-03-10
 */
public class PropertyUtilTest extends TestCase {

    public void testCopy() {
        Source source = new Source();
        source.setId(100);
        source.setNameProperty("perfect");
        Target target = new Target();
        PropertyUtil.copy(source, target);
        System.out.println(target);
    }

    @Test
    public void testSetProperty() {
        Source source = new Source();
        source.setId(100);
        source.setNameProperty("perfect");

        Target target = new Target();
        target.setNameProperty("ccc111");
        Field[] declaredFields = target.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Object type = field.getType();
            try {
                if (type == String.class) {
                    Object val = field.get(target);
                    System.out.println(val);
                    field.set(target, val);
                } else if (type == Integer.class) {
                    field.set(target, 100);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(target);
    }
}