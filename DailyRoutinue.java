public class DailyRoutinue {
    public static void main(String[] args) {
        var wakeup = true;
        var bath = true;
        var breakfast = true;
        var ready = true;
        var learn = true;
        var sleep = true;
        if(wakeup) {
            System.out.println("Wake up");
        }
        else {
            System.out.println("Health is not good");
        }
        System.out.println("Go to Bath");
        if(bath) {
            System.out.println("Keep shower");
        }
        else {
            System.out.println("Skip the bath");
        }
        System.out.println("Go to break fast");
        if(breakfast){
            System.out.println("Eat");
        }
        else {
            System.out.println("Skip the breakfast");
        }
        System.out.println("Eat something");
        if(ready) {
            System.out.println("simple get ready");
        }
        else {
            System.out.println("Skip ready");
        }
        System.out.println("tie my hair");
        if(learn) {
            System.out.println("Focus on career");
        }
        else {
            System.out.println("No option focus career only");
        }
        System.out.println("Liten songs for rest");
        if(sleep) {
            System.out.println("Sleep well");
        }
        else {
            System.out.println("Keep OverThink");
        }
        System.out.println("Don't made mistakes");
    }
    
}
