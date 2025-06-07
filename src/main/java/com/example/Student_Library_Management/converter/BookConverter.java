package com.example.Student_Library_Management.converter;

import com.example.Student_Library_Management.model.Book;
import com.example.Student_Library_Management.requestDto.BookRequestDto;

public class BookConverter {
    public static Book convertBookRequestDtoIntoBook(BookRequestDto bookRequestDto){
        Book book=new Book();
        book.setTitle(bookRequestDto.getTitle());
        book.setPublishDate(bookRequestDto.getPublishDate());
        book.setPublisherName(bookRequestDto.getPublisherName());
        book.setPage(bookRequestDto.getPage());
        book.setPrice(bookRequestDto.getPrice());
        book.setAvailability(bookRequestDto.getAvailability());
        book.setCategory(bookRequestDto.getCategory());
        book.setRackNumber(bookRequestDto.getRackNumber());
        return book;
    }
}
