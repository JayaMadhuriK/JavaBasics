class Hobbies{
  String name;
  public static void main(String args[]){
    Hobbies[] hobby = new Hobbies[2];
    int x = 0;
    while(x < hobby.length){
      hobby[x] = new Hobbies();
      hobby[x].name = "Playing";
      if(x == 1){
        hobby[x].name = "Gardening";
      }
      x = x+1;
    }
    int y = 0;
    while(y<hobby.length){
      System.out.println(hobby[y].name);
      y = y + 1;
    }
  }
}