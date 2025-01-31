class SinkTheDotCom{
  private int[] locationCells;
  private int numOfHits;
  void setNumOfHits(){
    numOfHits++;
  }
  int getNumOfHits(){
    return numOfHits;
  }
  void setLocationCells(int[] locations){
    locationCells = locations;
  }
  int[] getLocationCells(){
    return locationCells;
  }
  public String checker(int guess){
    String result = "Miss";
    for(int cell : locationCells){
      if(guess == cell){
        result = "Hit";
        setNumOfHits();
        break;
      }
    }
    if(numOfHits == locationCells.length){
      result = "Kill";
    }
    return result;
  }
}