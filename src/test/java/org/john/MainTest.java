package org.john;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main inst;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        inst = new Main();
    }

    @org.junit.jupiter.api.Test
    void main() {
    }

    @Test
    void sayAU() {
        Assertions.assertEquals("AU!AU!AU!", Main.sayAU() );
    }
}