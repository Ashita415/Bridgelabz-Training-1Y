package com.Question1;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Map<String, SmartHome.LightAction> lightRules = new HashMap<>();

        lightRules.put("MOTION", () ->
                System.out.println("Motion detected: Turning ON bright white lights")
        );

        lightRules.put("NIGHT", () ->
                System.out.println("Night mode: Switching to warm dim lights")
        );

        lightRules.put("VOICE_ROMANTIC", () ->
                System.out.println("Voice command: Activating romantic lighting (red + low brightness)")
        );

        lightRules.put("VOICE_PARTY", () ->
                System.out.println("Voice command: Activating party lights (color cycling)")
        );

        trigger(lightRules, "MOTION");
        trigger(lightRules, "NIGHT");
        trigger(lightRules, "VOICE_ROMANTIC");
        trigger(lightRules, "VOICE_PARTY");
    }

    static void trigger(Map<String, SmartHome.LightAction> rules, String event) {
        SmartHome.LightAction action = rules.get(event);
        if (action != null) {
            action.execute();
        } else {
            System.out.println("No lighting rule defined for: " + event);
        }
    }
}
