package ru.giustiziere.mrcalendarbot.cfg;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Args implements ApplicationRunner {

    private ApplicationArguments applicationArguments;

    public String getUrl() {
        System.out.println("Url: " + applicationArguments.getOptionValues("url").get(0));
        return applicationArguments.getOptionValues("url").get(0);
    }

    @Override
    public void run(ApplicationArguments args) {
        applicationArguments = args;
    }
}
