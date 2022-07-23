//package com.recommendation.RecomendationApi;
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
////import java.awt.print.Book;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpStatus;
//
//import com.recommendation.RecomendationApi.controller.BookController;
//import com.recommendation.RecomendationApi.model.Book;
//import com.recommendation.RecomendationApi.service.BookService;
//
//@SpringBootTest
//public class BookControllerTestsWithMockito {
//
//	@Autowired
//	BookController bookController;
//
//	@MockBean
//	BookService bookService;
//
//	@Test
//	public void testGetAllBooks() {
//
//		when(bookService.getAllBooks().thenReturn(new Book(2,"abvf",560,2.3,4,6.7));
//
//		assertEquals(bookController.getAllBooks());
//	}
//
////	@Test
////	public void testGetBookById2() {
////		when(bookService.getBookById(3)).thenReturn(new Book(2,"History of America",600,4,2,2));
////		assertEquals(HttpStatus.OK, bookController.getBookByid(3).getStatusCode());
////	}
////
//}


