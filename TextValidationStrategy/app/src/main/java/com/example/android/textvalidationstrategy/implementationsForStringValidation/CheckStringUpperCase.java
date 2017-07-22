package com.example.android.textvalidationstrategy.implementationsForStringValidation;

public class CheckStringUpperCase implements iCheckString {
    @Override
    public String algorithm(String s) {

        if (s.length() == 0) {
            return "Строка пуста";
        } else {
            if (!(s.toUpperCase().equals(s))) {
                return "Введенная строка НЕ в верхнем регистре";
            }
        }
        return "Верно";
    }
}
