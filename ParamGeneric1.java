class ParamGeneric <T,U> {           //parameterized classes
    T obj1;
    U obj2;
    ParamGeneric(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void getObject(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
class ParamGeneric1{
    public static void main(String args[]){
        ParamGeneric<String,Integer> obj = new ParamGeneric<String,Integer>("madhuri",12);
        obj.getObject();
    }
}
