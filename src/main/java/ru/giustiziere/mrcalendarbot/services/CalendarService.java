package ru.giustiziere.mrcalendarbot.services;

import ru.giustiziere.mrcalendarbot.dto.HolidayDTO;

import java.util.ArrayList;
import java.util.List;

public class CalendarService {

    private final HttpRequestService httpRequestService = new HttpRequestService();

    public List<HolidayDTO> getHolidays(String date) {
        var result = new ArrayList<HolidayDTO>();
        var sourcePage = httpRequestService.getPageSource("https://www.calend.ru/holidays/" + date);
        var holidays = sourcePage.select("li.three-three");
        for (org.jsoup.nodes.Element holiday : holidays) {
            var title = holiday.select("div.caption > span.title > a").text();
            var desc = holiday.select("div.caption > p.descr > a").text();
            var url = holiday.select("div.caption > span.title > a").attr("href");
            result.add(new HolidayDTO(title, desc, url));
        }
        return result;
    }
}
