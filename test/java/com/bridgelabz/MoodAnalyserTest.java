package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    MoodAnalyser object ;
    @BeforeEach
    public void setUp()
    {
        object = new MoodAnalyser("This is a happy message");
    }
    @Test
    public void moodAnalyser()
    {
        String ans = object.moodAnalyser();
        Assertions.assertEquals("HAPPY",ans);
        System.out.println(ans);
    }
}