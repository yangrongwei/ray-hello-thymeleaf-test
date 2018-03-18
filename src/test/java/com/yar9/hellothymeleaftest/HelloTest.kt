package com.yar9.hellothymeleaftest

import org.junit.jupiter.api.Test
import org.thymeleaf.testing.templateengine.engine.TestExecutor

class HelloTest {
    @Test
    fun test(){
        val executor  = TestExecutor()
        executor.execute("classpath:testset/hello.thtest")
    }
}