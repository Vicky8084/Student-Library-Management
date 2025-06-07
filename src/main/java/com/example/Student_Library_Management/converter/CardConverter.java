package com.example.Student_Library_Management.converter;

import com.example.Student_Library_Management.model.Card;
import com.example.Student_Library_Management.requestDto.CardRequestDto;

public class CardConverter {
    public static Card convertCardRequestDtoIntoCard(CardRequestDto cardRequestDto){
        Card card=new Card();
        card.setCardStatus(cardRequestDto.getCardStatus());
        return card;
    }
}
