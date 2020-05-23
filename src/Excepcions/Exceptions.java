package Excepcions;

public class Exceptions {


	public static class OnlyCharacters extends RuntimeException{
		
		

		public  OnlyCharacters() {
			super("You have to use only characters!");
			
		}

		public OnlyCharacters(String message) {
			super(message);
			
		}
		
		
	}
	

}
