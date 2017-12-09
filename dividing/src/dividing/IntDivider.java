package dividing;

public class IntDivider {
	/*
	 * Pabaikite ra�yti program� IntDivider public class IntDivider { public int
	 * divide(String[] skaiciai) { ... }
	 * 
	 * metodo divide signat�r� (vard�, gr��inam� tip�, parametr� skai�i� ar
	 * tip�) keisti draud�iama! Reikalavimai programai: Kaip programos
	 * parametrai bus perduodami tekstiniai duomenys, kuriuose bus sveikieji
	 * skai�iai. Programos paskirtis - atlikti skai�i� dalyb�, kur pirmas masyvo
	 * skai�ius turi b�ti padalintas i� antrojo. Jeigu metodui perduoti
	 * nekorekti�ki duomenys - programa turi mesti IllegalArgumentException tipo
	 * exception'�.
	 * 
	 * Programa negali nul��ti jokiu atveju (nepriklausomai nuo perduot�
	 * duomen�)!
	 * 
	 * Norint tekstin� skai�i� paversti skai�iaus tipo duomenimis (su kuriais
	 * galime atlikti aritmetines operacijas), galima pasitelkti:
	 * Integer.parseInt(...)
	 * 
	 * Taigi, jeigu bus perduoti skai�iai 6 ir 3, tokiu atveju, programa turi
	 * i�vesti: 6 / 3 = 2
	 */
	public int divide(String[] skaiciai) throws IllegalArgumentException {
		if (skaiciai==null)
			throw new IllegalArgumentException("array not found");
		if (skaiciai.length < 2)
			throw new IllegalArgumentException("array is too short");
		if (skaiciai.length > 2)
			throw new IllegalArgumentException("array is too long");
		
		int num1 = Integer.parseInt(skaiciai[0].trim());
		int num2 = Integer.parseInt(skaiciai[1].trim());

		if (num2 == 0)
			throw new IllegalArgumentException("division by zero");

		return num1 / num2;
	}
}