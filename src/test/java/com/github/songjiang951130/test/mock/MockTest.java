package com.github.songjiang951130.test.mock;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MockTest {

    @Test
    public void test() {
        List mockedList = mock(List.class);
        //using mock object
        mockedList.add("one");
        mockedList.clear();

        //verification
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    @Test
    public void sub() {
        List mockedList = mock(List.class);

        //stubbing
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());

        //following prints "first"
        assertEquals("first", mockedList.get(0));
        mockedList.get(1);
    }
}
