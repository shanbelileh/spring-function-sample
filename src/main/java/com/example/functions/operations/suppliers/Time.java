package com.example.functions.operations.suppliers;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.function.Supplier;

/**
 * @author : mohammad
 * @since : 10/15/2021 5:50 PM , Fri
 * functions
 **/

public class Time implements Supplier<String>
{
    @Override
    public String get()
    {
        return DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(LocalDateTime.now(ZoneId.systemDefault()));
    }
}
