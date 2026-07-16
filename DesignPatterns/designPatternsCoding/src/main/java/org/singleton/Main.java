package org.singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //  Logger log = new Logger();
        Logger logger = Logger.getInstance();
        logger.log("here is log line");
    }
}