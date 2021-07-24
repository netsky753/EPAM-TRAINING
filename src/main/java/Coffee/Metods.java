package Coffee;

import java.util.Scanner;
public class Metods {
Scanner keyboard = new Scanner(System.in);
void Coffee_choose(Coffee object) {
System.out.println("Choose Condition: ");
System.out.println("1.Coffee_grain" );
System.out.println("2.Coffee_ground" );
System.out.println("3.Coffee_pack" );
System.out.println("4.Coffee_bag" );
System.out.println("5.Coffee_soluble" );
switch(keyboard.next().charAt(0)) {
case '1' : 
	object.setCondition ("grain");
	System.out.println("Choose Type: "); break;
}
}	
	
}
