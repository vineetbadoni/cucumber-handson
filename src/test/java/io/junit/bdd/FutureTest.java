package io.junit.bdd;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static io.junit.bdd.GivenWhenThen.given;

/**
 * Created by Rabriel on 12/4/2016.
 */
public class FutureTest {
    private ExecutorService executor = Executors.newSingleThreadExecutor();
    @Test
    public void basicGivenFutureFlowTest(){
        given(executor.submit(() -> 1))
                .when("multiplying by 2", givenValue -> 2*givenValue)
                .when("multiplying by 4", givenValue -> 3*givenValue)
                .then("value should be even", whenValue -> whenValue%2 == 0);
    }
}