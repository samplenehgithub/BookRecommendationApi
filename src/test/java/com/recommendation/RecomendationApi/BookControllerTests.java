package com.recommendation.RecomendationApi;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.recommendation.RecomendationApi.controller.BookController;

@SpringBootTest
public class BookControllerTests {
	@Autowired
	BookController bookController;

	@Test
	public void testGetBookById() {
		assertEquals(3,bookController.getBookByid(3).getBody().getBookId());
	}

	@Test
	@Disabled
	public void testGetBookById2() {
		assertNotEquals(3, bookController.getBookByid(4));
	}
}

