package reversestr;

 class reverseAstring {

	public static void main(String[] args) {
	String name="anshumaan";
	System.out.println(" :"+name);
		int length=name.length();
		String reverse="  ";
		for(int i=length-1;i>=0;i--)
		{ 
			reverse=reverse+name.charAt(i);
		
			System.out.println("  "+reverse);
			
			// TODO Auto-generated method stub
		}
		}
	}
