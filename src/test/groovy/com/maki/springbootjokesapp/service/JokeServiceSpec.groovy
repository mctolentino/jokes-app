package com.maki.springbootjokesapp.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class JokeServiceSpec extends Specification {

    @Autowired
    JokeService service

    def 'Should return a joke'() {
        expect:
        service.getJoke()
    }
}
