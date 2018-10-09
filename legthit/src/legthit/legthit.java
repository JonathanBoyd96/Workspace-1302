package legthit;

public class legthit 
{
	public static void main(String[] arg)
	{
		String s = "HotDog";
				System.out.println("The word "+ s+ " has "+ StringLength(s)+ " characters");
	}
	
	public static int StringLength(String word)
	{
		if(word.equals("")|| word == null)
			return 0;
		else
			return StringLength(word.substring(1)) +1;
	}
}
