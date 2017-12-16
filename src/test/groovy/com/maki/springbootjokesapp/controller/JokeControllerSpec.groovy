package com.maki.springbootjokesapp.controller

import com.maki.springbootjokesapp.service.JokeService
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class JokeControllerSpec extends Specification {

    MockMvc mockMvc
    JokeService jokeService

    def setup() {
        jokeService = Mock(JokeService)
        def controller = new JokeController(jokeService)
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build()
    }

    def 'Should show jokes view'() {
        when:
        def response = mockMvc.perform(get('/'))

        then:
        1 * jokeService.getJoke()
        0 * _
        response.andExpect(status().isOk())
    }

}
