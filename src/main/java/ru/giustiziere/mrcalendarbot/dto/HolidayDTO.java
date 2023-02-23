package ru.giustiziere.mrcalendarbot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class HolidayDTO implements Serializable {
    private String title;
    private String description;
    private String url;
}
