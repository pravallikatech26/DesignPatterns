package org.example;

public class Logger {
    private Logger() {
    }
    private static class Holder{
        private static final Logger INSTANCE = new Logger();
    }
    public static Logger getInstance(){
        return Holder.INSTANCE;
    }

    public void log(String str){
        System.out.println(str);
    }


}
