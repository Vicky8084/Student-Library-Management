package com.Library.StudentLibraryManagementDatabaseSystem.converter;

import com.Library.StudentLibraryManagementDatabaseSystem.model.Author;
import com.Library.StudentLibraryManagementDatabaseSystem.requestDto.AuthorRequestDto;

public class AuthorConverter {
    public static Author convertAuthorRequestDtoIntoAuthor(AuthorRequestDto authorRequestDto){
        Author author=new Author();
        author.setName(authorRequestDto.getName());
        author.setEmail(authorRequestDto.getEmail());
        author.setAddress(authorRequestDto.getAddress());
        author.setMobileNumer(authorRequestDto.getMobileNumer());
        return author;
    }
}
