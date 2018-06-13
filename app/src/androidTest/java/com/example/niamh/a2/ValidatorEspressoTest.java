package com.example.niamh.a2;


import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class ValidatorEspressoTest {

    private String psswd;
    private Validator vd = new Validator();

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    //set password to test
    @Before
    public void initPassword(){
        psswd="Summer2018";
    }

   //Input password, submit, check strength message displayed
    @Test
    public void checkPasswordStrengthTest(){
        //input password, click button
        onView(withId(R.id.input)).perform(typeText(psswd),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        //check label
        if(vd.isValidPassword(psswd))
            onView(withId(R.id.strongText)).check(matches(withText("Strong.")));
        else
            onView(withId(R.id.strongText)).check(matches(withText("Not strong.")));
    }
}
