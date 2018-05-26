package co.edu.udea.codeBreaker;

public class CodeBreaker {

	private int[] secretCode= {1,2,3,4};
	
	public String game(int numero) {
		String equis="";
		String guion="";
		String numeroIngresado=Integer.toString(numero);
		System.out.println(numeroIngresado.length());
		if(numeroIngresado.length()!=4)return "Tamaño de numero erroneo";
		for(int i=0;i< secretCode.length;i++) {
			for(int j=0;j< numeroIngresado.length();j++) {
				if(Integer.toString(secretCode[i]).equals(numeroIngresado.substring(j,j+1))) {
					if(i==j) {
						equis+="X";
					}else {
						guion+="_";
					}
				}
			}
		}
		return equis+guion;
	}
	
	
}
