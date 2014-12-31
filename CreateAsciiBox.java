public class CreateAsciiBox {
  /* CreateAsciiBox.printBox(9,3);
  *   #------------------#
  *   |\                  \
  *   | \                  \
  *   |  \                  \
  *   #   #------------------#
  *    \  |                  |
  *     \ |                  |
  *      \|                  |
  *       #------------------#
  *
  * Facebook.com/KernelCode 
  * AbdullahAltahery@gmail.com
  * facebook.com/kernelcode
  */
  static String spaces(int num){
  	if(num<0)
  		num*=-1;
  	char [] f= new  char [num];
  	for(int i=0;i<num;i++){
  		f[i]=' ';
  	}
  	
  	return new String(f);
  }
  
  static String setDash(int num){
  	if(num<0)
  		num*=-1;
  	char [] f= new  char [num];
  	for(int i=0;i<num;i++){
  		f[i]='-';
  	}
  	
  	return new String(f);
  }
  static void printBox(int x,int y){
  
  	System.out.println("#"+setDash(x*2)+"#");
  	int f=0;
  	int i=0;
  	for(f=0;f<y;f++){
  	System.out.print("|"+spaces(f)+"\\");
  
  		System.out.println(spaces((x*2))+"\\");
  	}
  	System.out.print("#");
  	System.out.println(spaces(f)+"#"+setDash(x*2)+"#");
  	
  	for(f=1;f<y+1;f++){
  		
  		
  		System.out.println(spaces(f)+"\\"+spaces(y-f)+"|"+spaces(x*2)+"|");
  	}
  	System.out.println(spaces(f)+"#"+setDash(x*2)+"#");
  
  }
  
  public static void main(String args[]){
      printBox(9,3);
  }
}
