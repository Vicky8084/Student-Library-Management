package com.Library.StudentLibraryManagementDatabaseSystem.converter;

import com.Library.StudentLibraryManagementDatabaseSystem.model.Card;
import com.Library.StudentLibraryManagementDatabaseSystem.requestDto.CardRequestDto;

public class CardConverter {
    public static Card convertCardRequestDtoIntoCard(CardRequestDto cardRequestDto){
        Card card=new Card();
        card.setCardStatus(cardRequestDto.getCardStatus());
        return card;

    }
}
