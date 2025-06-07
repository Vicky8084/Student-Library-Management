package com.example.Student_Library_Management.converter;

import com.example.Student_Library_Management.model.Author;
import com.example.Student_Library_Management.requestDto.AuthorRequestDto;

public class AuthorConverter {
    public static Author convertAuthorRequestDtoIntoAuthor(AuthorRequestDto authorRequestDto){
        Author author=new Author();
        author.setName(authorRequestDto.getName());
        author.setCountry((authorRequestDto.getCountry()));
        author.setEmail(authorRequestDto.getEmail());
        author.setMobileNumber(authorRequestDto.getMobileNumber());
        author.setGender(authorRequestDto.getGender());
        author.setRating(authorRequestDto.getRating());

        return author;
    }

}
