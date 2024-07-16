package conversion;

public class Conversor {

	private final static double KM_A_MILLAS = 0.621371;
	private final static double MB_A_ATM = 0.000986923;
	private final static double CAL_A_JULIOS = 4.184;

	public static double millas(double km) {
		return km * KM_A_MILLAS;
	}

	public static double km(double millas) {
		return KM_A_MILLAS / millas;
	}

	public static double atmosferas(double milibares) {
		return milibares * MB_A_ATM;
	}

	public static double milibares(double atmosferas) {
		return MB_A_ATM / atmosferas;
	}

	public static double julios(double calorias) {
		return calorias * CAL_A_JULIOS;
	}

	public static double calorias(double julios) {
		return CAL_A_JULIOS / julios;
	}

}
