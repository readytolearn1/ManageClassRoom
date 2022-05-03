package edu.managementclassroom.view;

import lombok.Getter;

@Getter
public enum ButtonTextName {
    ADD_CLASSROOM("Add classroom"), ADD_TEACHER("Add teacher"), ADD_BOOKING("Add booking");

      private final String textInButton;

    ButtonTextName(String textInButton) {
        this.textInButton = textInButton;
    }
}
