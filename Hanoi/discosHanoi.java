import java.util.Scanner;
public class discosHanoi {
static int cont=1;
public static void Hanoi(int n,int origen,int auxiliar,int destino){

		if(n==1){
		System.out.println("Mover de "+origen+" a "+destino);
		}
		else{
			Hanoi(n-1, origen, destino, auxiliar);
			System.out.println("Mover de "+origen+" a "+destino);
			Hanoi(n-1,auxiliar, origen, destino);
		}
//Primer Contador de movimientos
		cont++;
	}

		public static void contar(int n){
		//Segundo contador de movimientos
			int c=0;
			c=(int)Math.pow(2, n);
			c=c-1;
			System.out.println(cont-1+" - "+"Cantidad de movimientos - "+c);
		}

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Ingrese numero de discos");
				int n = sc.nextInt();
				Hanoi(n, 1, 2, 3);
				contar(n);
			}
	}