package com.tp2.demo;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc

public class ControllerPathTest {
	@Autowired
	private MockMvc mvc;
	@Test
	public void loadsHomePage() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(view().name(equalTo("home")))
				;
	}
	@Test
	public void loadsUserPage() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/user").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(view().name(equalTo("user")))
				;
	}
	@Test
	public void loadsChatroomPage() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/chatroom").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(view().name(equalTo("chatroom")))
				;
	}
	

}
