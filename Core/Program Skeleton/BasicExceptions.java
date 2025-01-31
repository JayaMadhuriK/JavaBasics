public class BasicExceptions {
    public static void main(String []args){
        System.out.println("If we use Scanner class without import statement it will give" +
                "compile time exception as could not found Scanner class");
        System.out.println("If class and file names are different then we will get run time" +
                "exception as Could not find or load main class, if there class and file." +
                "If both class and file names are different do not use public keyword before" +
                "class then it will execute");
        System.out.println("If main method does not exists --> " +
                "Main method not found in class, please define the main method as:\n" +
                "   public static void main(String[] args)");
    }
}
