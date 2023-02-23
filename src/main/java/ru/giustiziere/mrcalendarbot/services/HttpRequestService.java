package ru.giustiziere.mrcalendarbot.services;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class HttpRequestService {

    @SneakyThrows
    public Document getPageSource(String url) {
        var response = Jsoup.connect(url).get();
        log.info("Get page source: {}", response.title());
        return response;
    }
}
