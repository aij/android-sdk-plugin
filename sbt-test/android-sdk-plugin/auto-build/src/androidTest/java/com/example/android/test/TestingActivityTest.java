package com.example.android.test;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.example.android.test.TestingActivityTest \
 * com.example.android.test.tests/android.test.InstrumentationTestRunner
 */
public class TestingActivityTest extends ActivityInstrumentationTestCase2<TestingActivity> {

    public TestingActivityTest() {
        super("com.example.android.test", TestingActivity.class);
    }

}
