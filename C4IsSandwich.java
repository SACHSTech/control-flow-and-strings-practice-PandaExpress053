
class C4IsSandwich extends ConsoleProgram {

    /**
    * Description A sandwich is two pieces of bread with something in between. 
    * Return the string that is between the first and last appearance of "bread" 
    * in the given string, or output the empty string "" if there are not two 
    * pieces of bread.
    * @author: E. Fung
    */
    
    public void run() {
      int intFirstBread, intSecondBread;
      String stringInput = readLine((""));

      intFirstBread = stringInput.indexOf("bread");
      if (intFirstBread != -1){
        intSecondBread = stringInput.indexOf("bread", intFirstBread + 5);
        if (intSecondBread != -1){
            String result = stringInput.substring(intFirstBread + 5, intSecondBread);
            System.out.println(result);
        }
        else{}
      }
      else{}
      
    }
  }
  