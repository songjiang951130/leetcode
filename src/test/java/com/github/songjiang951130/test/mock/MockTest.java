package com.github.songjiang951130.test.mock;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@SuppressWarnings("unchecked")
public class MockTest {
    @Test
    public void test() {
        List<String> mockedList = mock(List.class);
        // using mock object
        mockedList.add("one");
        mockedList.clear();
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    @Test
    public void sub() {
        List<String> mockedList = mock(List.class);

        // stubbing
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());

        assertEquals("first", mockedList.get(0));
        try {
            mockedList.get(1);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                System.out.println("获得预期异常");
            }
        }
    }
}
