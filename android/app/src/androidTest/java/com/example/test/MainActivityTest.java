package com.example.test;

import androidx.test.rule.ActivityTestRule;
import dev.flutter.plugins.integration_test.FlutterTestRunner;
import org.junit.Rule;
import org.junit.runner.RunWith;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.assertion.ViewAssertions;
import org.junit.Test;

import com.example.test.MainActivity;

@RunWith(FlutterTestRunner.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class, true, false);

    // @Test
    // public void testTextViewContent() {
    // // Start the MainActivity
    // rule.launchActivity(null);

    // // Define the expected text
    // String expectedText = "Hello, World!";

    // // Check if a TextView with a specific ID contains the expected text
    // Espresso.onView(ViewMatchers.withId(10)) // Replace with the actual ID of
    // your
    // // TextView
    // .check(ViewAssertions.matches(ViewMatchers.withText(expectedText)));

    // }
}