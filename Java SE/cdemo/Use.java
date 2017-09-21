class Use{

public static  void main(String[] args){

  try{

  for(String cname:args){
	Class.forName(cname);
  }

  }catch(Exception e){

  }


}

}