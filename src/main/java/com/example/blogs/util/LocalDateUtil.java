package com.example.blogs.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class LocalDateUtil {

    public static String convertLocalDateToString(LocalDate date) {
        return Optional
                .ofNullable(date)
                .map(
                        localDate -> localDate.format(DateTimeFormatter.ISO_LOCAL_DATE)
                )
                .orElse(null);
    }

    public static LocalDate convertStringToLocalDate(String dateString) {
        return Optional
                .ofNullable(dateString)
                .map(LocalDate::parse)
                .orElse(null);
    }
}