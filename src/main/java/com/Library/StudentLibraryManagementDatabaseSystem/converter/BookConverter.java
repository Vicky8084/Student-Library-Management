package com.Library.StudentLibraryManagementDatabaseSystem.converter;

import com.Library.StudentLibraryManagementDatabaseSystem.model.Book;
import com.Library.StudentLibraryManagementDatabaseSystem.requestDto.BookRequestDto;

public class BookConverter {
    public static Book convertBookRequestDtoIntoBook(BookRequestDto bookRequestDto){
        Book book=new Book();
        book.setTitle(bookRequestDto.getTitle());
        book.setPublisherName(bookRequestDto.getPublisherName());
        book.setPublishDate(bookRequestDto.getPublishDate());
        book.setPage(bookRequestDto.getPage());
        book.setPrice(bookRequestDto.getPrice());
        book.setRackNumber(bookRequestDto.getRackNumber());
        book.setAvailability(bookRequestDto.isAvailability());
        book.setCategory(bookRequestDto.getCategory());
        return book;
    }
}
