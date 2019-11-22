public String front22(String str) {
  if(str.length()<=0){
    return str;
  }
  else if(str.length()==1){
    String front =str.substring(0,1);
    return front+str+front;
  }
  else{
  String front = str.substring(0,2);
  return front+str+front;
  }
}
