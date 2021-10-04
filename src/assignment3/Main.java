package assignment3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		StarPerformers s = new StarPerformers();
		List<Agent> listAgents = s.getAgentList();
		//Map<String><String> star = listAgents.stream().filter(l->l.getGeneratedFund()>2000000).collect(Collectors.)
		//Map<String, String> star = listAgents.stream()
				  // .collect(Collectors.toMap(Agent::getName, agn->giveStars(agn.getGeneratedFund())));

	}
	public static String giveStars(long generatedFund) {
	    if (generatedFund >= 2000000)
	        return "*****";
	    else if (generatedFund >=1500000 && generatedFund < 2000000)
	        return "****";
	    else if (generatedFund >= 1000000 && generatedFund< 1500000)
	        return "*";
	    return "";
	}

}
