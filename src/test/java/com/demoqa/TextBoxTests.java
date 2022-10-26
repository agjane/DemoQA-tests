package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxTests {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFormTest() {
        String name = "Jane Ag"; // todo make with other test data

        Selenide.open("/text-box");
        $("[id=userName]").setValue(name);
        $("[id=userEmail]").setValue("ag.jane@pochta.ru");
        $("[id=currentAddress]").setValue("house 0, some street 1, country 2");
        $("[id=permanentAddress]").setValue("Another house, street and country");
        $("[id=submit]").click();

        //Asserts

        $("[id=output]").shouldHave(text(name), text("ag.jane@pochta.ru"),
                text("house 0, some street 1, country 2"), text("Another house, street and country"));

        // $("[id=output] [id=name]").shouldHave(text(name)); another way to check the data
    }

}