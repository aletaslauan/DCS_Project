package proj3;


import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataString;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Receiver {
	public static void main(String[] args) {
	
		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Main Petri";
		pn.NetworkPort = 1081;
		
		
		DataString p1r = new DataString();
		p1r.SetName("P_a1r");
		p1r.SetValue("1");
		pn.PlaceList.add(p1r);
		DataString p2r = new DataString();
		p2r.SetName("P_a2r");
		pn.PlaceList.add(p2r);
		DataString p3r = new DataString();
		p3r.SetName("P_a3r");
		pn.PlaceList.add(p3r);


		// T1 ------------------------------------------------
		PetriTransition t1 = new PetriTransition(pn);
		t1.TransitionName = "T1";
		t1.InputPlaceName.add("P_a1r");
		t1.InputPlaceName.add("P_a3r");

		
		Condition T1Ct1 = new Condition(t1, "P_a1r", TransitionCondition.NotNull);
		Condition T1Ct2 = new Condition(t1, "P_a3r", TransitionCondition.NotNull);
		T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);

		GuardMapping grdT1 = new GuardMapping();
		grdT1.condition= T1Ct1;
		grdT1.Activations.add(new Activation(t1, "P_a3r", TransitionOperation.Move, "P_a2r"));
		
		t1.GuardMappingList.add(grdT1);
		
		t1.Delay = 0;
		pn.Transitions.add(t1);
		
		// T2 ------------------------------------------------
		PetriTransition t2 = new PetriTransition(pn);
		t2.TransitionName = "T2";
		t2.InputPlaceName.add("P_a2r");

		
		Condition T2Ct1 = new Condition(t2, "P_a2r", TransitionCondition.NotNull);

		GuardMapping grdT2 = new GuardMapping();
		grdT2.condition= T2Ct1;
		grdT2.Activations.add(new Activation(t2, "P_a2r", TransitionOperation.Move, "P_a1r"));
		
		t2.GuardMappingList.add(grdT2);
		
		t2.Delay = 0;
		pn.Transitions.add(t2);
		
		
		
		System.out.println("Exp1 started \n ------------------------------");
		pn.Delay = 2000;
		//pn.Start();
		
		PetriNetWindow frame = new PetriNetWindow(false);
		frame.petriNet = pn;
		frame.setVisible(true);
		
		
	}
}


