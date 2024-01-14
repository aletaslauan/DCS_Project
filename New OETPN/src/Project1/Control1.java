package Project1;


import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Control1 {
    public static void main(String[] args) {

        PetriNet pn = new PetriNet();
        pn.PetriNetName = "control1";
        pn.SetName("control1");
        pn.NetworkPort = 1081;

        DataString ini = new DataString();
        ini.SetName("ini");
        ini.SetValue("red");
        pn.ConstantPlaceList.add(ini);

        DataString red = new DataString();
        red.SetName("red");
        red.SetValue("red");
        pn.ConstantPlaceList.add(red);

        DataString green = new DataString();
        green.SetName("green");
        green.SetValue("green");
        pn.ConstantPlaceList.add(green);

        DataString yellow = new DataString();
        yellow.SetName("yellow");
        yellow.SetValue("yellow");
        pn.ConstantPlaceList.add(yellow);

        DataString p_rrr = new DataString();
        p_rrr.SetName("p_rrr");
        p_rrr.SetValue("signal");
        pn.PlaceList.add(p_rrr);

        DataString p_grr = new DataString();
        p_grr.SetName("p_grr");
        // p_grr.SetValue("signal");
        pn.PlaceList.add(p_grr);

        DataString p_yrr = new DataString();
        p_yrr.SetName("p_yrr");
        // p_yrr.SetValue("signal");
        pn.PlaceList.add(p_yrr);

        DataString p_rgr = new DataString();
        p_rgr.SetName("p_rgr");
        // p_rgr.SetValue("signal");
        pn.PlaceList.add(p_rgr);

        DataString p_ryr = new DataString();
        p_ryr.SetName("p_ryr");
        // p_ryr.SetValue("signal");
        pn.PlaceList.add(p_ryr);

        DataString p_rrg = new DataString();
        p_rrg.SetName("p_rrg");
        // p_rrg.SetValue("signal");
        pn.PlaceList.add(p_rrg);

        DataString p_rry = new DataString();
        p_rry.SetName("p_rry");
        // p_rry.SetValue("signal");
        pn.PlaceList.add(p_rry);

        // attach aux locations to send over the network
        DataTransfer p_f1 = new DataTransfer();
        p_f1.SetName("p_f1");
        p_f1.Value = new TransferOperation("localhost", "1080", "p2");
        pn.PlaceList.add(p_f1);
        
        DataTransfer p_f2 = new DataTransfer();
        p_f2.SetName("p_f2");
        p_f2.Value = new TransferOperation("localhost", "1080", "p6");
        pn.PlaceList.add(p_f2);
        
        DataTransfer p_f3 = new DataTransfer();
        p_f3.SetName("p_f3");
        p_f3.Value = new TransferOperation("localhost", "1080", "p10");
        pn.PlaceList.add(p_f3);
        
        // initialize
        PetriTransition iniT = new PetriTransition(pn);
        iniT.TransitionName = "iniT";

        Condition iniTCt1 = new Condition(iniT, "ini", TransitionCondition.NotNull);
        GuardMapping grdiniT = new GuardMapping();
        grdiniT.condition = iniTCt1;

        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "p_f1"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "p_f2"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "p_f3"));
        grdiniT.Activations.add(new Activation(iniT, "", TransitionOperation.MakeNull, "ini"));
        iniT.GuardMappingList.add(grdiniT);
        iniT.Delay = 1;
        pn.Transitions.add(iniT);

        // #########################
        // t0
        // #########################
        PetriTransition t0 = new PetriTransition(pn);
        t0.TransitionName = "t0";
        t0.InputPlaceName.add("p_rrr");

        Condition t0c1 = new Condition(t0, "p_rrr", TransitionCondition.NotNull);

        GuardMapping grd_t0 = new GuardMapping();
        grd_t0.condition = t0c1;
        grd_t0.Activations.add(new Activation(t0, "p_rrr", TransitionOperation.Move, "p_grr"));
        grd_t0.Activations.add(new Activation(t0, "green", TransitionOperation.SendOverNetwork, "p_f1"));
        // grd_t0.Activations.add(new Activation(t0, "red", TransitionOperation.SendOverNetwork, "p_f2"));
        // grd_t0.Activations.add(new Activation(t0, "red", TransitionOperation.SendOverNetwork, "p_f3"));
        t0.GuardMappingList.add(grd_t0);
        t0.Delay = 5;
        pn.Transitions.add(t0);

        // #########################
        // t1
        // #########################
        PetriTransition t1 = new PetriTransition(pn);
        t1.TransitionName = "t1";
        t1.InputPlaceName.add("p_grr");

        Condition t1c1 = new Condition(t1, "p_grr", TransitionCondition.NotNull);

        GuardMapping grd_t1 = new GuardMapping();
        grd_t1.condition = t1c1;
        grd_t1.Activations.add(new Activation(t1, "p_grr", TransitionOperation.Move, "p_yrr"));
        grd_t1.Activations.add(new Activation(t1, "yellow", TransitionOperation.SendOverNetwork, "p_f1"));
        // grd_t1.Activations.add(new Activation(t1, "red", TransitionOperation.SendOverNetwork, "p_f2"));
        // grd_t1.Activations.add(new Activation(t1, "red", TransitionOperation.SendOverNetwork, "p_f3"));
        t1.GuardMappingList.add(grd_t1);
        t1.Delay = 5;
        pn.Transitions.add(t1);

        // #########################
        // t2
        // #########################
        PetriTransition t2 = new PetriTransition(pn);
        t2.TransitionName = "t2";
        t2.InputPlaceName.add("p_yrr");

        Condition t2c1 = new Condition(t2, "p_yrr", TransitionCondition.NotNull);

        GuardMapping grd_t2 = new GuardMapping();
        grd_t2.condition = t2c1;
        grd_t2.Activations.add(new Activation(t2, "p_yrr", TransitionOperation.Move, "p_rgr"));
        grd_t2.Activations.add(new Activation(t2, "red", TransitionOperation.SendOverNetwork, "p_f1"));
        grd_t2.Activations.add(new Activation(t2, "green", TransitionOperation.SendOverNetwork, "p_f2"));
        // grd_t2.Activations.add(new Activation(t2, "red", TransitionOperation.SendOverNetwork, "p_f3"));
        t2.GuardMappingList.add(grd_t2);
        t2.Delay = 5;
        pn.Transitions.add(t2);

        // #########################
        // t3
        // #########################
        PetriTransition t3 = new PetriTransition(pn);
        t3.TransitionName = "t3";
        t3.InputPlaceName.add("p_rgr");

        Condition t3c1 = new Condition(t3, "p_rgr", TransitionCondition.NotNull);

        GuardMapping grd_t3 = new GuardMapping();
        grd_t3.condition = t3c1;
        grd_t3.Activations.add(new Activation(t3, "p_rgr", TransitionOperation.Move, "p_ryr"));
        // grd_t3.Activations.add(new Activation(t3, "red", TransitionOperation.SendOverNetwork, "p_f1"));
        grd_t3.Activations.add(new Activation(t3, "yellow", TransitionOperation.SendOverNetwork, "p_f2"));
        // grd_t3.Activations.add(new Activation(t3, "red", TransitionOperation.SendOverNetwork, "p_f3"));
        t3.GuardMappingList.add(grd_t3);
        t3.Delay = 5;
        pn.Transitions.add(t3);

        // #########################
        // t4
        // #########################
        PetriTransition t4 = new PetriTransition(pn);
        t4.TransitionName = "t4";
        t4.InputPlaceName.add("p_ryr");

        Condition t4c1 = new Condition(t4, "p_ryr", TransitionCondition.NotNull);

        GuardMapping grd_t4 = new GuardMapping();
        grd_t4.condition = t4c1;
        grd_t4.Activations.add(new Activation(t4, "p_ryr", TransitionOperation.Move, "p_rrg"));
        // grd_t4.Activations.add(new Activation(t4, "red", TransitionOperation.SendOverNetwork, "p_f1"));
        grd_t4.Activations.add(new Activation(t4, "red", TransitionOperation.SendOverNetwork, "p_f2"));
        grd_t4.Activations.add(new Activation(t4, "green", TransitionOperation.SendOverNetwork, "p_f3"));
        t4.GuardMappingList.add(grd_t4);
        t4.Delay = 5;
        pn.Transitions.add(t4);

        // #########################
        // t5
        // #########################
        PetriTransition t5 = new PetriTransition(pn);
        t5.TransitionName = "t5";
        t5.InputPlaceName.add("p_rrg");

        Condition t5c1 = new Condition(t5, "p_rrg", TransitionCondition.NotNull);

        GuardMapping grd_t5 = new GuardMapping();
        grd_t5.condition = t5c1;
        grd_t5.Activations.add(new Activation(t5, "p_rrg", TransitionOperation.Move, "p_rry"));
        // grd_t5.Activations.add(new Activation(t5, "red", TransitionOperation.SendOverNetwork, "p_f1"));
        // grd_t5.Activations.add(new Activation(t5, "red", TransitionOperation.SendOverNetwork, "p_f2"));
        grd_t5.Activations.add(new Activation(t5, "yellow", TransitionOperation.SendOverNetwork, "p_f3"));
        t5.GuardMappingList.add(grd_t5);
        t5.Delay = 5;
        pn.Transitions.add(t5);

        // #########################
        // t6
        // #########################
        PetriTransition t6 = new PetriTransition(pn);
        t6.TransitionName = "t6";
        t6.InputPlaceName.add("p_rry");

        Condition t6c1 = new Condition(t6, "p_rry", TransitionCondition.NotNull);

        GuardMapping grd_t6 = new GuardMapping();
        grd_t6.condition = t6c1;
        grd_t6.Activations.add(new Activation(t6, "p_rry", TransitionOperation.Move, "p_rrr"));
        // grd_t6.Activations.add(new Activation(t6, "red", TransitionOperation.SendOverNetwork, "p_f1"));
        // grd_t6.Activations.add(new Activation(t6, "red", TransitionOperation.SendOverNetwork, "p_f2"));
        grd_t6.Activations.add(new Activation(t6, "red", TransitionOperation.SendOverNetwork, "p_f3"));
        t6.GuardMappingList.add(grd_t6);
        t6.Delay = 5;
        pn.Transitions.add(t6);

		// -------------------------------------------------------------------------------------
		// ----------------------------PN Start-------------------------------------------------
		// -------------------------------------------------------------------------------------

		System.out.println("control1 started\n ------------------------------");
		pn.Delay = 2000;

		PetriNetWindow frame = new PetriNetWindow(false);
		frame.petriNet = pn;
		frame.setVisible(true);
    }
}

