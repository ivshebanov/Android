package com.example.android.textvalidationstrategy.implementationsForStringValidation;

public class CheckStringLowerCase implements iCheckString {
    @Override
    public String algorithm(String s) {

        if (s.length() == 0) {
            return "Строка пуста";
        } else {
            if (!(s.toLowerCase().equals(s))) {
                return "Введенная строка НЕ в нижнем регистре";
            }
        }
        return "Верно";
    }
}
