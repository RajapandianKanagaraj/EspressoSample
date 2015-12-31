/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.samples.espressosample;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class HomeFragmentTest {

    @Rule
    public ActivityTestRule<HomeActivity> mActivityRule = new ActivityTestRule<>(
            HomeActivity.class);

    @Test
    public void test1updateTextField() {
        onView(withId(R.id.text_field1))
                .perform(typeText("30"), closeSoftKeyboard());
        onView(withId(R.id.text_field2)).perform(typeText("10"), closeSoftKeyboard());
        addBtn();
        multiplyBtn();
        divideBtn();
    }

    public void addBtn() {
        try {
            onView(withId(R.id.add)).perform(click());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void multiplyBtn() {
        try {
            onView(withId(R.id.multiply)).perform(click());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void divideBtn() {
        try {
            onView(withId(R.id.divide)).perform(click());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}