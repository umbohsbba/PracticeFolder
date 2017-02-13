import java.text.DecimalFormat;

import java.util.Scanner;

public class restaurant {
	
	public static void main(String args[]) {
		// how much was the total bill split 4 ways
	
		Scanner input = new Scanner(System.in);
        
		System.out.println("How many guests are at the table?");
		float diners = input.nextFloat();

		System.out.println("How much is each bill?");
		float bill = input.nextFloat();
		float ttlbill = diners * bill;
		
		System.out.println("Total bill is " + ttlbill);

		System.out.println("What percentage would you like to tip?");
		float tip = input.nextInt();
		float gratuity = (tip / 100f) * ttlbill;
		System.out.println("Tip is  " + gratuity);
		
		System.out.println("Are you a member of our rewards program?");
		boolean member = input.nextBoolean();
		System.out.println(member);
	    
		if (member == true) {
			float discount = ttlbill * .15f;
			float discountedBill = ttlbill - discount;
			System.out.println("Total bill with member discount is $" + discountedBill);
			System.out.println("Total bill with gratuity is $" + (gratuity + discountedBill));
		}
		// if bill is at least $50 apply a 10% discount
		    else if (ttlbill >= 50) {
            float discount = ttlbill * .10f;
            
			float discountedBill = ttlbill - discount;
			System.out.println("Total bill with  10% discount is  $" + discountedBill);
			System.out.println("Total bill with gratuity is $" + (gratuity + discountedBill));
		
		} else {
			float discount = ttlbill * .05f;
		    float discountedBill = ttlbill - discount;
		    //String numberAsString = String.format("% ,.2f",discountedBill);
		    System.out.println("Total bill with  5% discount is $" + (ttlbill - discount) );
			System.out.println("Total bill with gratuity is $" + (gratuity + discountedBill));
            
		
		}        
		

	// how much money did the guy have before he bought his salad
	
		float moneyAfter = 27.10f;
	float moneySpent = 5.12f;
	DecimalFormat twoPlaces = new DecimalFormat();
	float moneyBefore = moneyAfter + moneySpent;
	System.out.println("He had $ " + twoPlaces.format(moneyBefore) +  " before he bought the salad");

	// how many packs of diapers can he buy with 40$ if they are 8$each
	int dMoney = 40;
	int oneDiaper = 8;
	int totalDiapers = dMoney / oneDiaper;
	System.out.println("He can buy " + totalDiapers + " packs of diapers with $40.00.");
	
	// if trevon has 29$ before he cleaned the attic and 41 after, how much did he make?
     float tMonb4 = 29f;
     float tMonafter = 41f;
     float moneyMade = tMonafter - tMonb4;
     System.out.println("Trevon made $" + moneyMade + ".");
	
	}

	

	
	
}
	
