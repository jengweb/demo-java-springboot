package com.example.workshop01;


public class FizzBuzz {

    public String say(int number) {
        // Register all rules
        Rule[] rules = new Rule[]{
                new FizzBuzzRule(),
                new BuzzRule(),
                new FizzRule(),
                new WowRule()
        };

        // Main process
        for (Rule rule : rules) {
            if (rule.check(number)) {
                return rule.say();
            }
        }

        // Default rule
        return "" + number;
    }
}
