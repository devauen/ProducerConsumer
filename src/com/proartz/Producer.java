package com.proartz;

import java.util.Random;

public class Producer implements Runnable {
    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        String[] words = {
                "Oh my dear",
                "I must not to fear",
                "Drink wine which is red",
                "Led by passions",
                "It's time to bed"
        };

        for(int i = 0; i < words.length; i++) {
            Random random = new Random();
            drop.put(words[i]);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
        drop.put("DONE");
    }
}
