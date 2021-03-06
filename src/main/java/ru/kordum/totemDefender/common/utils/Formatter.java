package ru.kordum.totemDefender.common.utils;

import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;

import java.text.NumberFormat;

public class Formatter {

    //---------------------------------------------------------------------------
    //
    // PUBLIC METHODS
    //
    //---------------------------------------------------------------------------

    public static String getProp(TextFormatting color, String key, float value, boolean percent) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        return getProp(color, key, nf.format(value), value > 0, percent);
    }

    public static String getProp(TextFormatting color, String key, int value, boolean percent) {
        return getProp(color, key, String.valueOf(value), value > 0, percent);
    }

    public static String getProp(TextFormatting color, String key, String value, boolean positive, boolean percent) {
        if (percent) {
            value += "%";
        }
        return getLocalize(color, key, (positive ? "+" : "") + value);
    }
    
    public static String getLocalize(String key, Object... args) {
        TextComponentTranslation translation = new TextComponentTranslation(key, args);
        return translation.getFormattedText();
    }

    public static String getLocalize(TextFormatting color, String key, Object... args) {
        TextComponentTranslation translation = new TextComponentTranslation(key, args);
        translation.getStyle().setColor(color);
        return translation.getFormattedText();
    }
}
