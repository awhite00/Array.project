
public class Polos
	{

		public static void main(String[] args)
			{
				whatcolorpolo();

			}
		public static void whatcolorpolo()
		{
			int randomNumber=(int)(Math.random()*5);
			String [] polo={"dark blue","light blue","yellow","white", "grey"};
			System.out.println(polo[randomNumber]);
		}

	}
