/*
 */
package org.gradle.api;

import com.google.i18n.phonenumbers.PhoneNumberUtil;

public class GreetingUtil {
    public static String getGreeting(final String name) {
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        phoneUtil.getExampleNumber("pt");
        return "Hello " + name.trim() + "!";
    }
}
