package com.company.texteditor.decorator;

public abstract class Decorator extends Glyph {
    protected Glyph glyph;
    public abstract void changeStyle();
}



