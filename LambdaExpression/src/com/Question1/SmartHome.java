package com.Question1;

public interface SmartHome {
    @FunctionalInterface
    interface LightAction {
        void execute();
    }
}
