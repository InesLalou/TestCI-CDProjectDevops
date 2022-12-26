package com.ECE.redis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestRedisJava {
    public TestRedisJava(){

    }

    @Test
    @DisplayName("Test Redis cache")
    void testRedisCache(){
        //DeepThought ourSuperComputer = new DeepThought();
        //int ans = ourSuperComputer.answer_to_the_ultimate_question_of_life_the_universe_and_everything();

        RedisJavaz cache = new RedisJavaz();
        cache.cache_value("answer_to_the_ultimate_question_of_life_the_universe_and_everything",String.valueOf(42));

        //assertEquals("42", cache.get_cached_value("answer_to_the_ultimate_question_of_life_the_universe_and_everything"));
    }
}
