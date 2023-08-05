import java.util.Scanner;
public class ManavKasa {

	public static void main(String[] args) {
		double ArmutunKilosu = 2.14, DomatesinKilosu = 1.11, PatlicaninKilosu = 5.00, ElmaninKilosu= 3.67, MuzunKilosu = 0.95,
			    armut,domates,patlican,elma,muz,total;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Kac kilo armut: ");
		armut = inp.nextDouble();
		double armutFiyat = ArmutunKilosu*armut;
		
		System.out.print("Kac kilo domates: ");
		domates = inp.nextDouble();
		double domatesFiyat = DomatesinKilosu*domates;
		
		System.out.print("Kac kilo patlican: ");
		patlican = inp.nextDouble();
		double patlicanFiyat = PatlicaninKilosu*patlican;
		
		System.out.print("Kac kilo elma: ");
		elma = inp.nextDouble();
		double elmaFiyat = ElmaninKilosu*elma;
		
		System.out.print("Kac kilo muz: ");
		muz = inp.nextDouble();
		double muzFiyat = MuzunKilosu*muz;
		
		total = armutFiyat + domatesFiyat + patlicanFiyat + elmaFiyat + muzFiyat;
		System.out.print("Odenecek tutar: "+total);
	}

}
