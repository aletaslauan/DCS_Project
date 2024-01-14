package Project1;


import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class project_lanes_intersections2 {
    public static void main(String[] args) {

        PetriNet pn = new PetriNet();
        pn.PetriNetName = "lanes intersections project";
        pn.NetworkPort = 1080;

        DataString green = new DataString();
        green.Printable = false;
        green.SetName("green");
        green.SetValue("green");
        pn.ConstantPlaceList.add(green);

        // #############################
        // lane with cars exitting BPH street
        // #############################
        DataCar p0 = new DataCar();
        p0.SetName("p0");
        pn.PlaceList.add(p0);

        DataCarQueue p1 = new DataCarQueue();
        p1.Value.Size = 3;
        p1.SetName("p1");
        pn.PlaceList.add(p1);

        DataString p2 = new DataString();
        p2.SetName("p2");
        pn.PlaceList.add(p2);

        DataCar p3 = new DataCar();
        p3.SetName("p3");
        pn.PlaceList.add(p3);

        // #############################
        // lane with cars exitting united nations boulevard
        // #############################
        DataCarQueue p5 = new DataCarQueue();
        p5.Value.Size = 3;
        p5.SetName("p5");
        pn.PlaceList.add(p5);

        DataString p6 = new DataString();
        p6.SetName("p6");
        pn.PlaceList.add(p6);

        DataCar p7 = new DataCar();
        p7.SetName("p7");
        pn.PlaceList.add(p7);

        // #############################
        // lane with cars exitting Izvorului street
        // #############################
        DataCar p8 = new DataCar();
        p8.SetName("p8");
        pn.PlaceList.add(p8);

        DataCarQueue p9 = new DataCarQueue();
        p9.Value.Size = 3;
        p9.SetName("p9");
        pn.PlaceList.add(p9);

        DataString p10 = new DataString();
        p10.SetName("p10");
        pn.PlaceList.add(p10);

        DataCar p11 = new DataCar();
        p11.SetName("p11");
        pn.PlaceList.add(p11);

        // #############################
        // lane with cars entering BPH street
        // #############################
        DataCarQueue p13 = new DataCarQueue();
        p13.Value.Size = 3;
        p13.SetName("p13");
        pn.PlaceList.add(p13);

        // #############################
        // lane with cars entering united nations boulevard
        // #############################
        DataCarQueue p17 = new DataCarQueue();
        p17.Value.Size = 3;
        p17.SetName("p17");
        pn.PlaceList.add(p17);

        DataString p18 = new DataString();
        p18.SetName("p18");
        pn.PlaceList.add(p18);

        DataCar p19 = new DataCar();
        p19.SetName("p19");
        pn.PlaceList.add(p19);

        // #############################
        // lane with cars entering Izvorului street
        // #############################
        DataCarQueue p21 = new DataCarQueue();
        p21.Value.Size = 3;
        p21.SetName("p21");
        pn.PlaceList.add(p21);

        // #############################
        // lane with cars exitting bulevardul libertatii 1
        // #############################
        DataCar p24 = new DataCar();
        p24.SetName("p24");
        pn.PlaceList.add(p24);

        DataCarQueue p25 = new DataCarQueue();
        p25.Value.Size = 3;
        p25.SetName("p25");
        pn.PlaceList.add(p25);

        DataString p26 = new DataString();
        p26.SetName("p26");
        pn.PlaceList.add(p26);

        DataCar p27 = new DataCar();
        p27.SetName("p27");
        pn.PlaceList.add(p27);

        // #############################
        // lane with cars exitting bulevardul libertatii 2
        // #############################
        DataCar p28 = new DataCar();
        p28.SetName("p28");
        pn.PlaceList.add(p28);

        DataCarQueue p29 = new DataCarQueue();
        p29.Value.Size = 3;
        p29.SetName("p29");
        pn.PlaceList.add(p29);

        DataString p30 = new DataString();
        p30.SetName("p30");
        pn.PlaceList.add(p30);

        DataCar p31 = new DataCar();
        p31.SetName("p31");
        pn.PlaceList.add(p31);

        // #############################
        // lane with cars exitting united nations boulevard 2
        // #############################
        DataCar p32 = new DataCar();
        p32.SetName("p32");
        pn.PlaceList.add(p32);

        DataCarQueue p33 = new DataCarQueue();
        p33.Value.Size = 3;
        p33.SetName("p33");
        pn.PlaceList.add(p33);

        DataString p34 = new DataString();
        p34.SetName("p34");
        pn.PlaceList.add(p34);

        DataCar p35 = new DataCar();
        p35.SetName("p35");
        pn.PlaceList.add(p35);

        // #############################
        // lane with cars entering bulevardul libertatii 1
        // #############################
        DataCarQueue p38 = new DataCarQueue();
        p38.Value.Size = 3;
        p38.SetName("p38");
        pn.PlaceList.add(p38);

        // #############################
        // lane with cars entering bulevardul libertatii 2
        // #############################
        DataCarQueue p42 = new DataCarQueue();
        p42.Value.Size = 3;
        p42.SetName("p42");
        pn.PlaceList.add(p42);

        // #############################
        // lane with cars entering united nations boulevard 2
        // #############################
        DataCarQueue p46 = new DataCarQueue();
        p46.Value.Size = 3;
        p46.SetName("p46");
        pn.PlaceList.add(p46);

        // #############################
        // intersection BPH, izvor, united nations
        // #############################
        DataCarQueue p36 = new DataCarQueue();
        p36.Value.Size = 3;
        p36.SetName("p36");
        pn.PlaceList.add(p36);

        // #############################
        // intersection bulevardul libertatii, united nations
        // #############################
        DataCarQueue p49 = new DataCarQueue();
        p49.Value.Size = 3;
        p49.SetName("p49");
        pn.PlaceList.add(p49);

        // #############################
        // t0
        // #############################
        PetriTransition t0 = new PetriTransition(pn);
        t0.TransitionName = "t0";
        t0.InputPlaceName.add("p0");
        t0.InputPlaceName.add("p1");

        Condition t0c1 = new Condition(t0, "p0", TransitionCondition.NotNull);
        Condition t0c2 = new Condition(t0, "p1", TransitionCondition.CanAddCars);
        t0c1.SetNextCondition(LogicConnector.AND, t0c2);

        GuardMapping grd_t0 = new GuardMapping();
        grd_t0.condition = t0c1;
        grd_t0.Activations.add(new Activation(t0, "p0", TransitionOperation.AddElement, "p1"));
        t0.GuardMappingList.add(grd_t0);

        t0.Delay = 0;
        pn.Transitions.add(t0);

        // #############################
        // t1
        // #############################
        PetriTransition t1 = new PetriTransition(pn);
        t1.TransitionName = "t1";
        t1.InputPlaceName.add("p1");
        t1.InputPlaceName.add("p2");

        Condition t1c1 = new Condition(t1, "p2", TransitionCondition.Equal, "green");
        Condition t1c2 = new Condition(t1, "p1", TransitionCondition.HaveCar);
        t1c1.SetNextCondition(LogicConnector.AND, t1c2);

        GuardMapping grd_t1 = new GuardMapping();
        grd_t1.condition = t1c1;
        grd_t1.Activations.add(new Activation(t1, "p1", TransitionOperation.PopElementWithoutTarget, "p3"));
        grd_t1.Activations.add(new Activation(t1, "p2", TransitionOperation.Move, "p2"));

        t1.GuardMappingList.add(grd_t1);

        t1.Delay = 0;
        pn.Transitions.add(t1);

        // #############################
        // t3
        // #############################
        PetriTransition t3 = new PetriTransition(pn);
        t3.TransitionName = "t3";
        t3.InputPlaceName.add("p5");
        t3.InputPlaceName.add("p6");

        Condition t3c1 = new Condition(t3, "p6", TransitionCondition.Equal, "green");
        Condition t3c2 = new Condition(t3, "p5", TransitionCondition.HaveCar);
        t3c1.SetNextCondition(LogicConnector.AND, t3c2);

        GuardMapping grd_t3 = new GuardMapping();
        grd_t3.condition = t3c1;
        grd_t3.Activations.add(new Activation(t3, "p5", TransitionOperation.PopElementWithoutTarget, "p7"));
        grd_t3.Activations.add(new Activation(t3, "p6", TransitionOperation.Move, "p6"));

        t3.GuardMappingList.add(grd_t3);

        t3.Delay = 0;
        pn.Transitions.add(t3);

        // #############################
        // t4
        // #############################
        PetriTransition t4 = new PetriTransition(pn);
        t4.TransitionName = "t4";
        t4.InputPlaceName.add("p8");
        t4.InputPlaceName.add("p9");

        Condition t4c1 = new Condition(t4, "p8", TransitionCondition.NotNull);
        Condition t4c2 = new Condition(t4, "p9", TransitionCondition.CanAddCars);
        t4c1.SetNextCondition(LogicConnector.AND, t4c2);

        GuardMapping grd_t4 = new GuardMapping();
        grd_t4.condition = t4c1;
        grd_t4.Activations.add(new Activation(t4, "p8", TransitionOperation.AddElement, "p9"));
        t4.GuardMappingList.add(grd_t4);

        t4.Delay = 0;
        pn.Transitions.add(t4);

        // #############################
        // t5
        // #############################
        PetriTransition t5 = new PetriTransition(pn);
        t5.TransitionName = "t5";
        t5.InputPlaceName.add("p9");
        t5.InputPlaceName.add("p10");

        Condition t5c1 = new Condition(t5, "p10", TransitionCondition.Equal, "green");
        Condition t5c2 = new Condition(t5, "p9", TransitionCondition.HaveCar);
        t5c1.SetNextCondition(LogicConnector.AND, t5c2);

        GuardMapping grd_t5 = new GuardMapping();
        grd_t5.condition = t5c1;
        grd_t5.Activations.add(new Activation(t5, "p9", TransitionOperation.PopElementWithoutTarget, "p11"));
        grd_t5.Activations.add(new Activation(t5, "p10", TransitionOperation.Move, "p10"));

        t5.GuardMappingList.add(grd_t5);

        t5.Delay = 0;
        pn.Transitions.add(t5);

        // #############################
        // t9
        // #############################
        PetriTransition t9 = new PetriTransition(pn);
        t9.TransitionName = "t9";
        t9.InputPlaceName.add("p17");
        t9.InputPlaceName.add("p18");

        Condition t9c1 = new Condition(t9, "p18", TransitionCondition.Equal, "green");
        Condition t9c2 = new Condition(t9, "p17", TransitionCondition.HaveCar);
        t9c1.SetNextCondition(LogicConnector.AND, t9c2);

        GuardMapping grd_t9 = new GuardMapping();
        grd_t9.condition = t9c1;
        grd_t9.Activations.add(new Activation(t9, "p17", TransitionOperation.PopElementWithoutTarget, "p19"));
        grd_t9.Activations.add(new Activation(t9, "p18", TransitionOperation.Move, "p18"));

        t9.GuardMappingList.add(grd_t9);

        t9.Delay = 0;
        pn.Transitions.add(t9);

        // #############################
        // t12
        // #############################
        PetriTransition t12 = new PetriTransition(pn);
        t12.TransitionName = "t12";
        t12.InputPlaceName.add("p24");
        t12.InputPlaceName.add("p25");

        Condition t12c1 = new Condition(t12, "p24", TransitionCondition.NotNull);
        Condition t12c2 = new Condition(t12, "p25", TransitionCondition.CanAddCars);
        t12c1.SetNextCondition(LogicConnector.AND, t12c2);

        GuardMapping grd_t12 = new GuardMapping();
        grd_t12.condition = t12c1;
        grd_t12.Activations.add(new Activation(t12, "p24", TransitionOperation.AddElement, "p25"));
        t12.GuardMappingList.add(grd_t12);

        t12.Delay = 0;
        pn.Transitions.add(t12);

        // #############################
        // t13
        // #############################
        PetriTransition t13 = new PetriTransition(pn);
        t13.TransitionName = "t13";
        t13.InputPlaceName.add("p25");
        t13.InputPlaceName.add("p26");

        Condition t13c1 = new Condition(t13, "p26", TransitionCondition.Equal, "green");
        Condition t13c2 = new Condition(t13, "p25", TransitionCondition.HaveCar);
        t13c1.SetNextCondition(LogicConnector.AND, t13c2);

        GuardMapping grd_t13 = new GuardMapping();
        grd_t13.condition = t13c1;
        grd_t13.Activations.add(new Activation(t13, "p25", TransitionOperation.PopElementWithoutTarget, "p27"));
        grd_t13.Activations.add(new Activation(t13, "p26", TransitionOperation.Move, "p26"));

        t13.GuardMappingList.add(grd_t13);

        t13.Delay = 0;
        pn.Transitions.add(t13);

        // #############################
        // t14
        // #############################
        PetriTransition t14 = new PetriTransition(pn);
        t14.TransitionName = "t14";
        t14.InputPlaceName.add("p28");
        t14.InputPlaceName.add("p29");

        Condition t14c1 = new Condition(t14, "p28", TransitionCondition.NotNull);
        Condition t14c2 = new Condition(t14, "p29", TransitionCondition.CanAddCars);
        t14c1.SetNextCondition(LogicConnector.AND, t14c2);

        GuardMapping grd_t14 = new GuardMapping();
        grd_t14.condition = t14c1;
        grd_t14.Activations.add(new Activation(t14, "p28", TransitionOperation.AddElement, "p29"));
        t14.GuardMappingList.add(grd_t14);

        t14.Delay = 0;
        pn.Transitions.add(t14);

        // #############################
        // t15
        // #############################
        PetriTransition t15 = new PetriTransition(pn);
        t15.TransitionName = "t15";
        t15.InputPlaceName.add("p29");
        t15.InputPlaceName.add("p30");

        Condition t15c1 = new Condition(t15, "p30", TransitionCondition.Equal, "green");
        Condition t15c2 = new Condition(t15, "p29", TransitionCondition.HaveCar);
        t15c1.SetNextCondition(LogicConnector.AND, t15c2);

        GuardMapping grd_t15 = new GuardMapping();
        grd_t15.condition = t15c1;
        grd_t15.Activations.add(new Activation(t15, "p29", TransitionOperation.PopElementWithoutTarget, "p31"));
        grd_t15.Activations.add(new Activation(t15, "p30", TransitionOperation.Move, "p30"));

        t15.GuardMappingList.add(grd_t15);

        t15.Delay = 0;
        pn.Transitions.add(t15);

        // #############################
        // t16
        // #############################
        PetriTransition t16 = new PetriTransition(pn);
        t16.TransitionName = "t16";
        t16.InputPlaceName.add("p32");
        t16.InputPlaceName.add("p33");

        Condition t16c1 = new Condition(t16, "p32", TransitionCondition.NotNull);
        Condition t16c2 = new Condition(t16, "p33", TransitionCondition.CanAddCars);
        t16c1.SetNextCondition(LogicConnector.AND, t16c2);

        GuardMapping grd_t16 = new GuardMapping();
        grd_t16.condition = t16c1;
        grd_t16.Activations.add(new Activation(t16, "p32", TransitionOperation.AddElement, "p33"));
        t16.GuardMappingList.add(grd_t16);

        t16.Delay = 0;
        pn.Transitions.add(t16);

        // #############################
        // t17
        // #############################
        PetriTransition t17 = new PetriTransition(pn);
        t17.TransitionName = "t17";
        t17.InputPlaceName.add("p33");
        t17.InputPlaceName.add("p34");

        Condition t17c1 = new Condition(t17, "p34", TransitionCondition.Equal, "green");
        Condition t17c2 = new Condition(t17, "p33", TransitionCondition.HaveCar);
        t17c1.SetNextCondition(LogicConnector.AND, t17c2);

        GuardMapping grd_t17 = new GuardMapping();
        grd_t17.condition = t17c1;
        grd_t17.Activations.add(new Activation(t17, "p33", TransitionOperation.PopElementWithoutTarget, "p35"));
        grd_t17.Activations.add(new Activation(t17, "p34", TransitionOperation.Move, "p34"));

        t17.GuardMappingList.add(grd_t17);

        t17.Delay = 0;
        pn.Transitions.add(t17);

        // #############################
        // t18
        // #############################
        PetriTransition t18 = new PetriTransition(pn);
        t18.TransitionName = "t18";
        t18.InputPlaceName.add("p3");
        t18.InputPlaceName.add("p36");

        Condition t18c1 = new Condition(t18, "p3", TransitionCondition.NotNull);
        Condition t18c2 = new Condition(t18, "p36", TransitionCondition.CanAddCars);
        t18c1.SetNextCondition(LogicConnector.AND, t18c2);

        GuardMapping grd_t18 = new GuardMapping();
        grd_t18.condition = t18c1;
        grd_t18.Activations.add(new Activation(t18, "p3", TransitionOperation.AddElement, "p36"));
        t18.GuardMappingList.add(grd_t18);

        t18.Delay = 0;
        pn.Transitions.add(t18);

        // #############################
        // t19
        // #############################
        PetriTransition t19 = new PetriTransition(pn);
        t19.TransitionName = "t19";
        t19.InputPlaceName.add("p7");
        t19.InputPlaceName.add("p36");

        Condition t19c1 = new Condition(t19, "p7", TransitionCondition.NotNull);
        Condition t19c2 = new Condition(t19, "p36", TransitionCondition.CanAddCars);
        t19c1.SetNextCondition(LogicConnector.AND, t19c2);

        GuardMapping grd_t19 = new GuardMapping();
        grd_t19.condition = t19c1;
        grd_t19.Activations.add(new Activation(t19, "p7", TransitionOperation.AddElement, "p36"));
        t19.GuardMappingList.add(grd_t19);

        t19.Delay = 0;
        pn.Transitions.add(t19);

        // #############################
        // t20
        // #############################
        PetriTransition t20 = new PetriTransition(pn);
        t20.TransitionName = "t20";
        t20.InputPlaceName.add("p11");
        t20.InputPlaceName.add("p36");

        Condition t20c1 = new Condition(t20, "p11", TransitionCondition.NotNull);
        Condition t20c2 = new Condition(t20, "p36", TransitionCondition.CanAddCars);
        t20c1.SetNextCondition(LogicConnector.AND, t20c2);

        GuardMapping grd_t20 = new GuardMapping();
        grd_t20.condition = t20c1;
        grd_t20.Activations.add(new Activation(t20, "p11", TransitionOperation.AddElement, "p36"));
        t20.GuardMappingList.add(grd_t20);

        t20.Delay = 0;
        pn.Transitions.add(t20);

        // #############################
        // t21
        // #############################
        PetriTransition t21 = new PetriTransition(pn);
        t21.TransitionName = "t21";
        t21.InputPlaceName.add("p36");
        t21.InputPlaceName.add("p13");

        Condition t21c1 = new Condition(t21, "p13", TransitionCondition.CanAddCars);
        Condition t21c2 = new Condition(t21, "p36", TransitionCondition.HaveCarForMe);
        t21c1.SetNextCondition(LogicConnector.AND, t21c2);

        GuardMapping grd_t21 = new GuardMapping();
        grd_t21.condition = t21c1;
        grd_t21.Activations.add(new Activation(t21, "p36", TransitionOperation.PopElementWithTargetToQueue, "p13"));
        t21.GuardMappingList.add(grd_t21);

        t21.Delay = 0;
        pn.Transitions.add(t21);

        // #############################
        // t22
        // #############################
        PetriTransition t22 = new PetriTransition(pn);
        t22.TransitionName = "t22";
        t22.InputPlaceName.add("p36");
        t22.InputPlaceName.add("p17");

        Condition t22c1 = new Condition(t22, "p17", TransitionCondition.CanAddCars);
        Condition t22c2 = new Condition(t22, "p36", TransitionCondition.HaveCarForMe);
        t22c1.SetNextCondition(LogicConnector.AND, t22c2);

        GuardMapping grd_t22 = new GuardMapping();
        grd_t22.condition = t22c1;
        grd_t22.Activations.add(new Activation(t22, "p36", TransitionOperation.PopElementWithTargetToQueue, "p17"));
        t22.GuardMappingList.add(grd_t22);

        t22.Delay = 0;
        pn.Transitions.add(t22);

        // #############################
        // t23
        // #############################
        PetriTransition t23 = new PetriTransition(pn);
        t23.TransitionName = "t23";
        t23.InputPlaceName.add("p36");
        t23.InputPlaceName.add("p21");

        Condition t23c1 = new Condition(t23, "p21", TransitionCondition.CanAddCars);
        Condition t23c2 = new Condition(t23, "p36", TransitionCondition.HaveCarForMe);
        t23c1.SetNextCondition(LogicConnector.AND, t23c2);

        GuardMapping grd_t23 = new GuardMapping();
        grd_t23.condition = t23c1;
        grd_t23.Activations.add(new Activation(t23, "p36", TransitionOperation.PopElementWithTargetToQueue, "p21"));
        t23.GuardMappingList.add(grd_t23);

        t23.Delay = 0;
        pn.Transitions.add(t23);

        // #############################
        // t30
        // #############################
        PetriTransition t30 = new PetriTransition(pn);
        t30.TransitionName = "t30";
        t30.InputPlaceName.add("p27");
        t30.InputPlaceName.add("p49");

        Condition t30c1 = new Condition(t30, "p27", TransitionCondition.NotNull);
        Condition t30c2 = new Condition(t30, "p49", TransitionCondition.CanAddCars);
        t30c1.SetNextCondition(LogicConnector.AND, t30c2);

        GuardMapping grd_t30 = new GuardMapping();
        grd_t30.condition = t30c1;
        grd_t30.Activations.add(new Activation(t30, "p27", TransitionOperation.AddElement, "p49"));
        t30.GuardMappingList.add(grd_t30);

        t30.Delay = 0;
        pn.Transitions.add(t30);

        // #############################
        // t31
        // #############################
        PetriTransition t31 = new PetriTransition(pn);
        t31.TransitionName = "t31";
        t31.InputPlaceName.add("p19");
        t31.InputPlaceName.add("p49");

        Condition t31c1 = new Condition(t31, "p19", TransitionCondition.NotNull);
        Condition t31c2 = new Condition(t31, "p49", TransitionCondition.CanAddCars);
        t31c1.SetNextCondition(LogicConnector.AND, t31c2);

        GuardMapping grd_t31 = new GuardMapping();
        grd_t31.condition = t31c1;
        grd_t31.Activations.add(new Activation(t31, "p19", TransitionOperation.AddElement, "p49"));
        t31.GuardMappingList.add(grd_t31);

        t31.Delay = 0;
        pn.Transitions.add(t31);

        // #############################
        // t32
        // #############################
        PetriTransition t32 = new PetriTransition(pn);
        t32.TransitionName = "t32";
        t32.InputPlaceName.add("p31");
        t32.InputPlaceName.add("p49");

        Condition t32c1 = new Condition(t32, "p31", TransitionCondition.NotNull);
        Condition t32c2 = new Condition(t32, "p49", TransitionCondition.CanAddCars);
        t32c1.SetNextCondition(LogicConnector.AND, t32c2);

        GuardMapping grd_t32 = new GuardMapping();
        grd_t32.condition = t32c1;
        grd_t32.Activations.add(new Activation(t32, "p31", TransitionOperation.AddElement, "p49"));
        t32.GuardMappingList.add(grd_t32);

        t32.Delay = 0;
        pn.Transitions.add(t32);

        // #############################
        // t33
        // #############################
        PetriTransition t33 = new PetriTransition(pn);
        t33.TransitionName = "t33";
        t33.InputPlaceName.add("p35");
        t33.InputPlaceName.add("p49");

        Condition t33c1 = new Condition(t33, "p35", TransitionCondition.NotNull);
        Condition t33c2 = new Condition(t33, "p49", TransitionCondition.CanAddCars);
        t33c1.SetNextCondition(LogicConnector.AND, t33c2);

        GuardMapping grd_t33 = new GuardMapping();
        grd_t33.condition = t33c1;
        grd_t33.Activations.add(new Activation(t33, "p35", TransitionOperation.AddElement, "p49"));
        t33.GuardMappingList.add(grd_t33);

        t33.Delay = 0;
        pn.Transitions.add(t33);

        // #############################
        // t34
        // #############################
        PetriTransition t34 = new PetriTransition(pn);
        t34.TransitionName = "t34";
        t34.InputPlaceName.add("p49");
        t34.InputPlaceName.add("p5");

        Condition t34c1 = new Condition(t34, "p5", TransitionCondition.CanAddCars);
        Condition t34c2 = new Condition(t34, "p49", TransitionCondition.HaveCarForMe);
        t34c1.SetNextCondition(LogicConnector.AND, t34c2);

        GuardMapping grd_t34 = new GuardMapping();
        grd_t34.condition = t34c1;
        grd_t34.Activations.add(new Activation(t34, "p49", TransitionOperation.PopElementWithTargetToQueue, "p5"));
        t34.GuardMappingList.add(grd_t34);

        t34.Delay = 0;
        pn.Transitions.add(t34);

        // #############################
        // t35
        // #############################
        PetriTransition t35 = new PetriTransition(pn);
        t35.TransitionName = "t35";
        t35.InputPlaceName.add("p49");
        t35.InputPlaceName.add("p38");

        Condition t35c1 = new Condition(t35, "p38", TransitionCondition.CanAddCars);
        Condition t35c2 = new Condition(t35, "p49", TransitionCondition.HaveCarForMe);
        t35c1.SetNextCondition(LogicConnector.AND, t35c2);

        GuardMapping grd_t35 = new GuardMapping();
        grd_t35.condition = t35c1;
        grd_t35.Activations.add(new Activation(t35, "p49", TransitionOperation.PopElementWithTargetToQueue, "p38"));
        t35.GuardMappingList.add(grd_t35);

        t35.Delay = 0;
        pn.Transitions.add(t35);

        // #############################
        // t36
        // #############################
        PetriTransition t36 = new PetriTransition(pn);
        t36.TransitionName = "t36";
        t36.InputPlaceName.add("p49");
        t36.InputPlaceName.add("p42");

        Condition t36c1 = new Condition(t36, "p42", TransitionCondition.CanAddCars);
        Condition t36c2 = new Condition(t36, "p49", TransitionCondition.HaveCarForMe);
        t36c1.SetNextCondition(LogicConnector.AND, t36c2);

        GuardMapping grd_t36 = new GuardMapping();
        grd_t36.condition = t36c1;
        grd_t36.Activations.add(new Activation(t36, "p49", TransitionOperation.PopElementWithTargetToQueue, "p42"));
        t36.GuardMappingList.add(grd_t36);

        t36.Delay = 0;
        pn.Transitions.add(t36);

        // #############################
        // t37
        // #############################
        PetriTransition t37 = new PetriTransition(pn);
        t37.TransitionName = "t37";
        t37.InputPlaceName.add("p49");
        t37.InputPlaceName.add("p46");

        Condition t37c1 = new Condition(t37, "p46", TransitionCondition.CanAddCars);
        Condition t37c2 = new Condition(t37, "p49", TransitionCondition.HaveCarForMe);
        t37c1.SetNextCondition(LogicConnector.AND, t37c2);

        GuardMapping grd_t37 = new GuardMapping();
        grd_t37.condition = t37c1;
        grd_t37.Activations.add(new Activation(t37, "p49", TransitionOperation.PopElementWithTargetToQueue, "p46"));
        t37.GuardMappingList.add(grd_t37);

        t37.Delay = 0;
        pn.Transitions.add(t37);

        // start petrinet
        System.out.println("project lanes intersections started");
        pn.Delay = 2000;
        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }
}
