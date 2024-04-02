package com.example.database.services;

import com.example.database.domain.dto.BookDto;
import com.example.database.domain.entities.BookEntity;

import java.util.List;

public interface BookService
{
    BookEntity save(BookEntity bookEntity, String isbn);
    List<BookEntity> findAll();
}