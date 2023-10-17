package com.sunbeam;

public class Test {

	public static void main(String[] args) {

		try {
			StringLength  s1=new StringLength("adnafuhaflmlffnmlnflkwjflwdnlnfkjhefnjnfjebfnbkejdnejnbjebjenbcehbdajcbakjddkadasbbckabdjkabdjkadnkajdakjdhjkad");
			}
			catch(ExceptionLineTooLong e) //we catch exception thrown by StringLength class ctor
			{
				System.out.println(e);
			}
		}
	
}
