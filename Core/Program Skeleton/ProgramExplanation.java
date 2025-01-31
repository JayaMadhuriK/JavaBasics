class ProgramExplanation {
    public static void main(String []args){
        System.out.println("->If there is no public before class" +
                " --> no change, there is no need of private access modifier" +
                "because bydefault class acts as private if not mentioned as public");
        System.out.println("->main method with parameter as string is mandatory," +
                " we can have many number of main methods but main with string " +
                "array will be called while running");
        System.out.println("->static keyword is used to call a method without" +
                "creating object it's mandatory, when we run program it will check for" +
                "class.main() method without object we are calling using class name");
        System.out.println("->main method will not return anything hence it's void type");
        System.out.println("->main is a method name that will be automatically checked" +
                "while running a program, if we run a program it will call class.main method");
        System.out.println("main method with string array arguments will be checked while" +
                "running a program hence string and array are important and for array" +
                "we can have any name");
        System.out.println("for displaying output we use println method which is in " +
                "system call using out object and it will accept arguments" +
                "System class is in lang package by default it will import");
    }
//    public static void main(){
//        System.out.println("dummy main");
//    }
//    public void main(String []args){
//        System.out.println("without static --> in IDE it's not running");
//    }
//      public static void main(String []arr){
//        System.out.println("array name is different");
//      }
}
