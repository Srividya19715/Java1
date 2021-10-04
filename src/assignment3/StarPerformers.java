package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StarPerformers {
	public static List<Agent> getAgentList() {
		List<Agent> agentlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me the number of agents list");
		int n = sc.nextInt();
		while (n != 0) {
			System.out.print("Enter the number of name:");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("Enter the fundamount");
			Long amt = sc.nextLong();
			agentlist.add(new Agent(name, amt));
			n--;
		}
		return agentlist;
	}
}
