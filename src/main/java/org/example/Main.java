package org.example;

public class Main {
    public static void main(String[] args)
    {
        CronJob job = new CronJobBuilder()
                .addIdentifier("Job1")
                .widthInterval(IntervalType.Day, 1)
                .widthDuration(100)
                .addExecutionOutput("Job executed succesfully")
                .build();
        job.Execute();

    }
}