package String_Question;

public class RemoveSpaceOnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s = "i am the best";
          char [] c=s.toCharArray();
          StringBuffer sb = new StringBuffer();
          for(int i=0;i<c.length;i++) {
        	  if((c[i]!=' ')&& (c[i]!='\t')) {
        		  sb.append(c[i]);
        		  
        	  }
          }
          System.out.println(sb);
	}

}
