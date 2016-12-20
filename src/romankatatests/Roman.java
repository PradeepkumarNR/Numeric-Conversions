package romankatatests;

import java.util.ArrayList;
import java.util.List;

public class Roman {

	private static final List<Par> Equalency_table;

	static {
		Equalency_table = new ArrayList<Par>();
		Equalency_table.add(new Par(1000, "M"));
		Equalency_table.add(new Par(900, "CM"));
		Equalency_table.add(new Par(500, "D"));
		Equalency_table.add(new Par(400, "CD"));
		Equalency_table.add(new Par(100, "C"));
		Equalency_table.add(new Par(90, "XC"));
		Equalency_table.add(new Par(50, "L"));
		Equalency_table.add(new Par(40, "XL"));
		Equalency_table.add(new Par(10, "X"));
		Equalency_table.add(new Par(9, "IX"));
		Equalency_table.add(new Par(5, "V"));
		Equalency_table.add(new Par(4, "IV"));
		Equalency_table.add(new Par(1, "I"));

	}

	public String ToRoman(int i) {
		String roman = "";
		for (Par par : Equalency_table) {
			while (i >= par.geti()) {
				roman += par.getRoman();
				i -= par.geti();
			}
		}

		return roman;
	}

}
