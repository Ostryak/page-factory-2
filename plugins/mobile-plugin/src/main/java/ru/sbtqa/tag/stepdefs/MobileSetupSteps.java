package ru.sbtqa.tag.stepdefs;

import ru.sbtqa.tag.pagefactory.environment.Environment;
import ru.sbtqa.tag.pagefactory.mobile.drivers.MobileDriverService;

public class MobileSetupSteps {

    private MobileSetupSteps() {}

    public static void initMobile() {
        Environment.setDriverService(new MobileDriverService());
    }
}