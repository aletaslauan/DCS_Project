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

public class Control2 {
    public static void main(String[] args) {

        PetriNet pn = new PetriNet();
        pn.PetriNetName = "control2";
        pn.SetName("control2");
        pn.NetworkPort = 1082;

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

        DataString p_rrrr = new DataString();
        p_rrrr.SetName("p_rrrr");
        p_rrrr.SetValue("signal");
        pn.PlaceList.add(p_rrrr);

        DataString p_grrr = new DataString();
        p_grrr.SetName("p_grrr");
        // p_grrr.SetValue("signal");
        pn.PlaceList.add(p_grrr);

        DataString p_yrrr = new DataString();
        p_yrrr.SetName("p_yrrr");
        // p_yrrr.SetValue("signal");
        pn.PlaceList.add(p_yrrr);

        DataString p_rgrr = new DataString();
        p_rgrr.SetName("p_rgrr");
        // p_rgrr.SetValue("signal");
        pn.PlaceList.add(p_rgrr);

        DataString p_ryrr = new DataString();
        p_ryrr.SetName("p_ryrr");
        // p_ryrr.SetValue("signal");
        pn.PlaceList.add(p_ryrr);

        DataString p_rrgr = new DataString();
        p_rrgr.SetName("p_rrg");
        // p_rrgr.SetValue("signal");
        pn.PlaceList.add(p_rrgr);

        DataString p_rryr = new DataString();
        p_rryr.SetName("p_rryr");
        // p_rryr.SetValue("signal");
        pn.PlaceList.add(p_rryr);

        DataString p_rrrg = new DataString();
        p_rrrg.SetName("p_rrrg");
        // p_rrrg.SetValue("signal");
        pn.PlaceList.add(p_rrrg);

        DataString p_rrry = new DataString();
        p_rrry.SetName("p_rrry");
        // p_rrry.SetValue("signal");
        pn.PlaceList.add(p_rrry);

        // attach aux locations to send over the network
        DataTransfer p_f1 = new DataTransfer();
        p_f1.SetName("p_f1");
        p_f1.Value = new TransferOperation("localhost", "1080", "p26");
        pn.PlaceList.add(p_f1);
        
        DataTransfer p_f2 = new DataTransfer();
        p_f2.SetName("p_f2");
        p_f2.Value = new TransferOperation("localhost", "1080", "p18");
        pn.PlaceList.add(p_f2);
        
        DataTransfer p_f3 = new DataTransfer();
        p_f3.SetName("p_f3");
        p_f3.Value = new TransferOperation("localhost", "1080", "p30");
        pn.PlaceList.add(p_f3);
        
        DataTransfer p_f4 = new DataTransfer();
        p_f4.SetName("p_f4");
        p_f4.Value = new TransferOperation("localhost", "1080", "p34");
        pn.PlaceList.add(p_f4);
        
        // initialize
        PetriTransition iniT = new PetriTransition(pn);
        iniT.TransitionName = "iniT";

        Condition iniTCt1 = new Condition(iniT, "ini", TransitionCondition.NotNull);
        GuardMapping grdiniT = new GuardMapping();
        grdiniT.condition = iniTCt1;

        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "p_f1"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "p_f2"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "p_f3"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "p_f4"));
        grdiniT.Activations.add(new Activation(iniT, "", TransitionOperation.MakeNull, "ini"));
        iniT.GuardMappingList.add(grdiniT);
        iniT.Delay = 1;
        pn.Transitions.add(iniT);

        // #########################
        // t0
        // #########################
        PetriTransition t0 = new PetriTransition(pn);
        t0.TransitionName = "t0";
        t0.InputPlaceName.add("p_rrrr");

        Condition t0c1 = new Condition(t0, "p_rrrr", TransitionCondition.NotNull);

        GuardMapping grd_t0 = new GuardMapping();
        grd_t0.condition = t0c1;
        grd_t0.Activations.add(new Activation(t0, "p_rrrr", TransitionOperation.Move, "p_grrr"));
        grd_t0.Activations.add(new Activation(t0, "green", TransitionOperation.SendOverNetwork, "p_f1"));
        t0.GuardMappingList.add(grd_t0);
        t0.Delay = 5;
        pn.Transitions.add(t0);

        // #########################
        // t1
        // #########################
        PetriTransition t1 = new PetriTransition(pn);
        t1.TransitionName = "t1";
        t1.InputPlaceName.add("p_grrr");

        Condition t1c1 = new Condition(t1, "p_grrr", TransitionCondition.NotNull);

        GuardMapping grd_t1 = new GuardMapping();
        grd_t1.condition = t1c1;
        grd_t1.Activations.add(new Activation(t1, "p_grrr", TransitionOperation.Move, "p_yrrr"));
        grd_t1.Activations.add(new Activation(t1, "yellow", TransitionOperation.SendOverNetwork, "p_f1"));
        t1.GuardMappingList.add(grd_t1);
        t1.Delay = 5;
        pn.Transitions.add(t1);

        // #########################
        // t2
        // #########################
        PetriTransition t2 = new PetriTransition(pn);
        t2.TransitionName = "t2";
        t2.InputPlaceName.add("p_yrrr");

        Condition t2c1 = new Condition(t2, "p_yrrr", TransitionCondition.NotNull);

        GuardMapping grd_t2 = new GuardMapping();
        grd_t2.condition = t2c1;
        grd_t2.Activations.add(new Activation(t2, "p_yrrr", TransitionOperation.Move, "p_rgrr"));
        grd_t2.Activations.add(new Activation(t2, "red", TransitionOperation.SendOverNetwork, "p_f1"));
        grd_t2.Activations.add(new Activation(t2, "green", TransitionOperation.SendOverNetwork, "p_f2"));
        t2.GuardMappingList.add(grd_t2);
        t2.Delay = 5;
        pn.Transitions.add(t2);

        // #########################
        // t3
        // #########################
        PetriTransition t3 = new PetriTransition(pn);
        t3.TransitionName = "t3";
        t3.InputPlaceName.add("p_rgrr");

        Condition t3c1 = new Condition(t3, "p_rgrr", TransitionCondition.NotNull);

        GuardMapping grd_t3 = new GuardMapping();
        grd_t3.condition = t3c1;
        grd_t3.Activations.add(new Activation(t3, "p_rgrr", TransitionOperation.Move, "p_ryrr"));
        grd_t3.Activations.add(new Activation(t3, "yellow", TransitionOperation.SendOverNetwork, "p_f2"));
        t3.GuardMappingList.add(grd_t3);
        t3.Delay = 5;
        pn.Transitions.add(t3);

        // #########################
        // t4
        // #########################
        PetriTransition t4 = new PetriTransition(pn);
        t4.TransitionName = "t4";
        t4.InputPlaceName.add("p_ryrr");

        Condition t4c1 = new Condition(t4, "p_ryrr", TransitionCondition.NotNull);

        GuardMapping grd_t4 = new GuardMapping();
        grd_t4.condition = t4c1;
        grd_t4.Activations.add(new Activation(t4, "p_ryrr", TransitionOperation.Move, "p_rrgr"));
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
        t5.InputPlaceName.add("p_rrgr");

        Condition t5c1 = new Condition(t5, "p_rrgr", TransitionCondition.NotNull);

        GuardMapping grd_t5 = new GuardMapping();
        grd_t5.condition = t5c1;
        grd_t5.Activations.add(new Activation(t5, "p_rrgr", TransitionOperation.Move, "p_rryr"));
        grd_t5.Activations.add(new Activation(t5, "yellow", TransitionOperation.SendOverNetwork, "p_f3"));
        t5.GuardMappingList.add(grd_t5);
        t5.Delay = 5;
        pn.Transitions.add(t5);

        // #########################
        // t6
        // #########################
        PetriTransition t6 = new PetriTransition(pn);
        t6.TransitionName = "t6";
        t6.InputPlaceName.add("p_rryr");

        Condition t6c1 = new Condition(t6, "p_rryr", TransitionCondition.NotNull);

        GuardMapping grd_t6 = new GuardMapping();
        grd_t6.condition = t6c1;
        grd_t6.Activations.add(new Activation(t6, "p_rryr", TransitionOperation.Move, "p_rrrg"));
        grd_t6.Activations.add(new Activation(t6, "red", TransitionOperation.SendOverNetwork, "p_f3"));
        grd_t6.Activations.add(new Activation(t6, "green", TransitionOperation.SendOverNetwork, "p_f4"));
        t6.GuardMappingList.add(grd_t6);
        t6.Delay = 5;
        pn.Transitions.add(t6);

        // #########################
        // t7
        // #########################
        PetriTransition t7 = new PetriTransition(pn);
        t7.TransitionName = "t7";
        t7.InputPlaceName.add("p_rrrg");

        Condition t7c1 = new Condition(t7, "p_rrrg", TransitionCondition.NotNull);

        GuardMapping grd_t7 = new GuardMapping();
        grd_t7.condition = t7c1;
        grd_t7.Activations.add(new Activation(t7, "p_rrrg", TransitionOperation.Move, "p_rrry"));
        grd_t7.Activations.add(new Activation(t7, "yellow", TransitionOperation.SendOverNetwork, "p_f4"));
        t7.GuardMappingList.add(grd_t7);
        t7.Delay = 5;
        pn.Transitions.add(t7);

        // #########################
        // t8
        // #########################
        PetriTransition t8 = new PetriTransition(pn);
        t8.TransitionName = "t8";
        t8.InputPlaceName.add("p_rrry");

        Condition t8c1 = new Condition(t8, "p_rrry", TransitionCondition.NotNull);

        GuardMapping grd_t8 = new GuardMapping();
        grd_t8.condition = t8c1;
        grd_t8.Activations.add(new Activation(t8, "p_rrry", TransitionOperation.Move, "p_rrrr"));
        grd_t8.Activations.add(new Activation(t8, "red", TransitionOperation.SendOverNetwork, "p_f4"));
        t8.GuardMappingList.add(grd_t8);
        t8.Delay = 5;
        pn.Transitions.add(t8);


		// -------------------------------------------------------------------------------------
		// ----------------------------PN Start-------------------------------------------------
		// -------------------------------------------------------------------------------------

		System.out.println("control2 started\n ------------------------------");
		pn.Delay = 2000;

		PetriNetWindow frame = new PetriNetWindow(false);
		frame.petriNet = pn;
		frame.setVisible(true);
    }
}
