import java.util.Scanner;
class SinkTheDotComTest{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    SinkTheDotCom sink = new SinkTheDotCom();
    int numOfGuess = 0;
    String result = "";
    String finalResult = "";
    int[] locations = {1,2,3};
    sink.setLocationCells(locations);
    while(sink.getNumOfHits() < locations.length){
      System.out.println("Please enter a number from 0-6 to check");
      int guess = sc.nextInt();
      numOfGuess++;
      result = sink.checker(guess);
      System.out.println(result);
    }
      if(result.equals("Kill")){
        finalResult = "Completed";
        System.out.println("Number of guesses:"+numOfGuess);
      }
      System.out.println(finalResult);
  }
}