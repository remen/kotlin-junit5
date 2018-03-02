package io.github.remen.kotlinjuni5

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class my_silly_little_application {
    @Nested
    inner class when_successful {
        @Test
        fun `prints "Hello World"`() {
            Assertions.assertTrue(false, "I wish this was true")
        }
    }
}

class when_the_application_doesnt_behave {
    @Test
    fun it_is_killed_without_prejudice() {
        Assertions.assertTrue(false, "I wish this was true")
    }
}