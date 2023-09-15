package de.ksbrwsk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TaskTest {

    @Test
    void thatCallReturnsResult() throws Exception {
        Task task = new Task(5);
        Integer result = task.call();
        assertNotNull(result);
    }
}