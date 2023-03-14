class Method{
    public <T> void display(T elem){
        System.out.println("data"+elem);

    }
}

class GenFun {
    
    public static void main(String args[]){
        Method m = new Method();
    
        m.<Integer>display(12);
        m.<Double>display(12.5);
        m.<String>display("madhuri");
    }

    
}
