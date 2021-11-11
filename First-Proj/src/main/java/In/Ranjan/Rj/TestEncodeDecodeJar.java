package In.Ranjan.Rj;

import in.Ranjan.rj.EncodeDecode;

public class TestEncodeDecodeJar {

  public static void main(String[] args) {
	 EncodeDecode end=new EncodeDecode();
	 String encode=end.Encode("Ranjan");
	 System.out.println(encode);
	 String Decode=end.Decode(encode);
	 System.out.println(Decode);
}	
}
