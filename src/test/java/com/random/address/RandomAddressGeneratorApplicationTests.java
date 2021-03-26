package com.random.address;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class RandomAddressGeneratorApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testAddressGenerator() throws Exception {
		this.mockMvc.perform(get("/randomizer/address"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.house", is(notNullValue())))
				.andExpect(jsonPath("$.street", is(notNullValue())))
				.andExpect(jsonPath("$.postalCode", is(notNullValue())))
				.andExpect(jsonPath("$.city", is(notNullValue())))
				.andExpect(jsonPath("$.county", is(notNullValue())))
				.andExpect(jsonPath("$.state", is(notNullValue())))
				.andExpect(jsonPath("$.stateCode", is(notNullValue())))
				.andExpect(jsonPath("$.country", is(notNullValue())))
				.andExpect(jsonPath("$.countryCode", is(notNullValue())));
	}
	
	
	@Test
	public void testAddressGeneratorOnInvalidURL() throws Exception {
		this.mockMvc.perform(get("/randomizer/getAddress"))
				.andDo(print())
				.andExpect(status().isNotFound());
	}

	@Test
	public void testAddressGeneratorOnInvalidMethodType() throws Exception {
		this.mockMvc.perform(post("/randomizer/address"))
				.andDo(print())
				.andExpect(status().isMethodNotAllowed());
	}
	
	
}
