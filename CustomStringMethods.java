public class CustomStringMethods {

  public CustomStringMethods() { 
  }
   
  

      public boolean longerThan(String myString, int maxLength) {
         return (myString.length() > maxLength); 
      }
    
      /* Client provides str and idx and method returns a new String created by appending
                the character located at index idx of str to the beginning of str and the end of str
    
                 Example:  If str is apples and idx is 4, this method returns the string eapplese
                 Example:  If str is apples and idx is 0, this method returns the string aapplesa
       */
      public String funnyString(String str, int idx) {
        return str.substring(idx, idx +1) + str + str.substring(idx, idx +1) ; 
      }
    
      /**Client provides myString and the method returns a String that represents mystring
                with its halves reversed; strings of odd length should have the extra character be a part
                of the second half when initially halved (and appear in the first half in the returned String).
    
                Example:  If myString is computers, this method should return the string uterscomp
                Example:  If myString is "reverse me!", this method should return "e me!revers"; 
      */
      public String halvesReversed(String myString) {
      int halfIdx = (myString.length())/2;
      return myString.substring(halfIdx) + myString.substring(0, halfIdx);
}
}
