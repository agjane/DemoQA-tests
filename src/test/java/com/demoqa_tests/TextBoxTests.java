package com.demoqa_tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TextBoxTests {
    @BeforeEach
    void openpage () {
        Selenide.open("https://ya.ru");
    }
    @AfterEach
    void closepage () {
        WebDriverRunner.closeWindow();
    }
    @Test
    void assertTest() {
        Selenide.open("https://demoqa.com/text-box");
    }
}