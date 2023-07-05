public boolean parrotTrouble(boolean talking, int hour) {
    if ((talking) && (hour<7)){
      return true;
    }
    if ((talking) && (hour>20)){
      return true;
    }
    return false;
 }
 