public boolean startHi(String str) {
  
  if(str.length() <2){
    return false;
  }
  String a = str.substring(0, 2);
  String b = "hi";
  if(a.equals(b))
  {
    return true;
  }
  else {
    return false;
  }
}
