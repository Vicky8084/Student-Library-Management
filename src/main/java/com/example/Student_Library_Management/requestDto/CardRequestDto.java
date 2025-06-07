package com.example.Student_Library_Management.requestDto;

import com.example.Student_Library_Management.enums.CardStatus;

public class CardRequestDto {

    private CardStatus cardStatus;
    private int studentId;
    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
