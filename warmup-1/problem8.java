public boolean posNeg(int a, int b, boolean negative) {
    boolean anegative = a < 0;
    boolean bnegative = b < 0;
    
     if (negative){
       return (anegative && bnegative);
     }
   
   if ((!anegative && bnegative) || (anegative && !bnegative)){
     return true;
   }
   
   return false;
   }