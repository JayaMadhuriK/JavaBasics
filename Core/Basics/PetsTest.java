class PetsTest{
  public static void main(String args[]){
    Pets [] petsArray = new Pets[3];
    petsArray[0] = new Pets();
    petsArray[0].name = "Browny";
    petsArray[0].type = "golden retriever";
    System.out.println(petsArray[0].name);
    System.out.println(petsArray[0].type);
  }
}