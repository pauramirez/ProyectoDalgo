package problemaA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaA {
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("Ingrese las cadenas z separando cada dijito por espacio ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ln = br.readLine();
		while(ln != null)
		{
			System.out.println(ln.length());
			//Numeros
			//int sp = Integer.parseInt(ln);
			int sp = 0;
			int[] z = new int[ln.length()];
			for(int i = 0; i < ln.length(); i++) {
				sp = Integer.parseInt(ln.split(" ")[i]);
				z[i] = sp;
				if(sp == 0)
					break;
			}
			
			System.out.println(sp);
			
			//SE TIENE EL VECTOR Z EN UN ARREGLO
			//SE DEBE ENCONTRAR EL ARREGLO P QUE HAGA QUE EL PRODUCTO PUNTO DE 1
			
			//EL ARREGLO P SE GENERA COMO [0,0,...,1/z[n-1]]:
			int[] p= new int[z.length];
			int cont = 0;
			if(z[cont]>0)
				p[cont]= Math.negateExact(z[cont]);
			
		}
	}
}
