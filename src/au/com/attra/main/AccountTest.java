package au.com.attra.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import au.com.attra.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("-----Welcome to Project----");
		Scanner in = new Scanner(System.in);
		List<Account> accountList = new ArrayList<Account>();
		Account account;
		while (true) {
			account = new Account();
			System.out.println("\n########################################################################");

			System.out.println("\n-----Please Enter Account Type (Saving / Current)----");

			String accountType = in.nextLine();
			if (accountType != null
					&& (accountType.equalsIgnoreCase("Saving") || accountType.equalsIgnoreCase("Current"))) {
				System.out.println("You entered Account Type is :: " + accountType);
				account.setAccountType(accountType);
			} else {
				System.out.println(" You entered wrong Account Type, please type Again ");
				continue;
			}

			System.out.println("\n-----Please Enter Account Holder Name ----");
			String accountHolderName = in.nextLine();
			if (accountHolderName != null && accountHolderName.length() > 0) {
				System.out.println("You entered Account Holder Name is :: " + accountHolderName);
				account.setAccountHolderName(accountHolderName);
			} else {
				System.out.println(" You entered wrong Account Holder Name , please type Again ");
				continue;
			}

			System.out.println(
					"\n-----Please Enter Account Number (Length should be More than 15 and numbers only )----");
			String accountNumber = in.nextLine();
			if (accountNumber != null && accountNumber.length() > 15) {
				System.out.println("You entered Account Number is :: " + accountNumber);
				try {
					account.setAccountNumber(Long.parseLong(accountNumber));
				} catch (NumberFormatException e) {
					System.out.println(" Wrong Account Number, please type number only ");
					continue;
				}

			} else {
				System.out.println(" You entered wrong Account Number, please type Again ");
				continue;
			}

			System.out.println("\n-----Please Enter Amount ----");
			String amount = in.nextLine();
			if (amount != null) {
				System.out.println("You entered Account Type is :: " + amount);
				try {
					account.setAmount(Float.parseFloat(amount));
				} catch (NumberFormatException e) {
					System.out.println(" Wrong amount, please type number or decimal only ");
					continue;
				}
			} else {
				System.out.println(" You entered wrong amount, please type Again ");
				continue;
			}

			System.out.println("\n-----Please Enter Currency Type (INR/AUD/USD)----");
			String currency = in.nextLine();
			if (currency != null && (currency.equalsIgnoreCase("INR") || currency.equalsIgnoreCase("AUD")
					|| currency.equalsIgnoreCase("USD"))) {
				System.out.println("You entered Currency is :: " + currency);
				account.setCurrency(currency);
			} else {
				System.out.println(" You entered wrong currency, please type Again ");
				continue;
			}

			System.out.println("\n\n\n Thank You For giving account details ");
			accountList.add(account);
			System.out.println(
					"\n ****************** To add more account details please press 1 ************************ ");
			if (!in.nextLine().equalsIgnoreCase("1")) {
				break;
			}

		}
		
		System.out.println(" Total Acount added is/are :::::: "+accountList.size());

	}

}
