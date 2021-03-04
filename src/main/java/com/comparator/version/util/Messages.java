package com.comparator.version.util;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Component
@PropertySource("classpath:messages.properties")
public class Messages {

    public static String errorNoAlphanumericInput;
    public static String errorSpecialCharactersInput;
    public static String messageCompareVersions;


    @Value("${message.error.no.alphanumeric.input}")
    public void setErrorNoAlphanumericInput(String message) {
        Messages.errorNoAlphanumericInput = message;
    }

    @Value("${message.error.special.characters.input}")
    public void setErrorSpecialCharactersInput(String message) {
        Messages.errorSpecialCharactersInput = message;
    }

    @Value("${message.compare.versions}")
    public void setMessageCompareVersions(String message) {
        Messages.messageCompareVersions = message;
    }





}
