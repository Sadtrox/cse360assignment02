package cse360assignment02;

public class AddingMachine {
  private int total; //the integer that'll be updated
  private String output; //output string
  private String temp; //temp string used to add on to output
  
  public AddingMachine () {
    total = 0;  
    output = "0"; //sets a starting point for the string
  }
  
  public int getTotal () {
    return total; //
  }
  
  public void add (int value) {
	  total = total + value; //change the total by adding value to it
	  temp = String.format(" + %d", value); //creating a string to add to output
	  output = output + temp; //adding the created string to output
  }

  //does the same thing as add but with subtract
  public void subtract (int value) {
	  total = total - value;
	  temp = String.format(" - %d", value);
	  output = output + temp;
  }

  public String toString () {
	  return output; //give output string
  }

  public void clear() {
	  output = "0"; //reset output string to be empty
  }
  
  public static void main(String args[]) 
  {
	  AddingMachine myCalculator = new AddingMachine();
	  myCalculator.add (4); 
	  myCalculator.subtract (2); 
	  myCalculator.add(5);
	  System.out.println(myCalculator.toString());
	  System.out.println(myCalculator.getTotal());
  }
}