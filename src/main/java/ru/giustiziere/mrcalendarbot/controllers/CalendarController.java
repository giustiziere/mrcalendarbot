package ru.giustiziere.mrcalendarbot.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.giustiziere.mrcalendarbot.cfg.Args;
import ru.giustiziere.mrcalendarbot.dto.HolidayDTO;
import ru.giustiziere.mrcalendarbot.services.CalendarService;
import ru.giustiziere.mrcalendarbot.utils.Utils;

import java.util.List;

@Slf4j
@RestController
public class CalendarController {

    @Autowired
    private Args args;

    @RequestMapping(value = "/today", method = RequestMethod.GET)
    public List<HolidayDTO> getTodayHolidays() {
        return new CalendarService().getHolidays(Utils.getToday());
    }
}
