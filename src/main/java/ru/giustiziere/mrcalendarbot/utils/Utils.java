package ru.giustiziere.mrcalendarbot.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
    public static String getToday() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd"));
    }
}
