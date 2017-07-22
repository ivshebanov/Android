package com.example.android.textvalidationstrategy.implementationsForStringValidation;

public class CheckNumber implements iCheckString {

    @Override
    public String algorithm(String s) {
        if (s.length() == 0) {
            return "Строка пуста";
        } else {
            for (int i = 0; i < s.length(); i++)
                if (!Character.isDigit(s.charAt(i))) {
                    return "Введенная строка - НЕ число";
                }
        }
        return "Верно";
    }
}
