package dividing;

public class IntDivider {
	/*
	 * Pabaikite raðyti programà IntDivider public class IntDivider { public int
	 * divide(String[] skaiciai) { ... }
	 * 
	 * metodo divide signatûrà (vardà, gràþinamà tipà, parametrø skaièiø ar
	 * tipà) keisti draudþiama! Reikalavimai programai: Kaip programos
	 * parametrai bus perduodami tekstiniai duomenys, kuriuose bus sveikieji
	 * skaièiai. Programos paskirtis - atlikti skaièiø dalybà, kur pirmas masyvo
	 * skaièius turi bûti padalintas ið antrojo. Jeigu metodui perduoti
	 * nekorektiðki duomenys - programa turi mesti IllegalArgumentException tipo
	 * exception'à.
	 * 
	 * Programa negali nulûþti jokiu atveju (nepriklausomai nuo perduotø
	 * duomenø)!
	 * 
	 * Norint tekstiná skaièiø paversti skaièiaus tipo duomenimis (su kuriais
	 * galime atlikti aritmetines operacijas), galima pasitelkti:
	 * Integer.parseInt(...)
	 * 
	 * Taigi, jeigu bus perduoti skaièiai 6 ir 3, tokiu atveju, programa turi
	 * iðvesti: 6 / 3 = 2
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