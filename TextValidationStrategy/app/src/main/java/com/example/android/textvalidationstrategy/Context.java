package com.example.android.textvalidationstrategy;

import com.example.android.textvalidationstrategy.implementationsForStringValidation.iCheckString;

public class Context {
    private iCheckString iCheckString;

    public Context(iCheckString iCheckString) {
        this.iCheckString = iCheckString;
    }

    public void setICheckString(iCheckString iCheckString) {
        this.iCheckString = iCheckString;
    }

    public String ExecuteOperation(String str) {
        return iCheckString.algorithm(str);
    }
}
