package main;

public class StringOperation {
	
	public String convertToDigits(String input){
		if (input.length() > 0) {
			boolean separator = false;
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < input.length(); i++) {
				if(Character.isDigit(input.charAt(i))) {
					if(separator) {
						sb.append(",");
					}
					sb.append(input.charAt(i));
					separator = true;
				}
			}
			System.out.println(sb.toString());
			return sb.toString();
		} else {
			return "";
		}
	}

}
