package hw20_LinkedList;

import java.util.LinkedList;

public class StateDemo {
    public static void main(String[] args) {
        State state1 = new State("Armenia","Yerevan","Mer Hayreniq","","Red, blue, orange","Armenian",2_778_000,29_743);
        State state2 = new State("Germany", "Berlin", "Das Lied der Deutschen", "", "Black, red, yellow", "German", 83100000, 357022);
        State state3 = new State("France", "Paris", "La Marseillaise", "", "Blue, white, red", "French", 67390000, 551695);
        State state4 = new State("Japan", "Tokyo", "Kimigayo", "", "White, red", "Japanese", 125800000, 377975);
        State state5 = new State("India", "New Delhi", "Jana Gana Mana", "", "Saffron, white, green, blue", "Hindi, English", 1393000000, 3287263);
        State state6 = new State("Brazil", "Brasília", "Hino Nacional Brasileiro", "", "Green, yellow, blue, white", "Portuguese", 214300000, 8515767);
        State state7 = new State("USA", "Washington, D.C.", "The Star-Spangled Banner", "", "Red, white, blue", "English", 331900000, 9833517);

        LinkedList<State> states = new LinkedList<>();
        states.add(state1);
        states.add(state2);
        states.add(state3);
        states.add(state6);
        states.add(state3);
        states.add(state4);
        states.add(state1);
        states.add(state5);
        states.add(state6);
        states.add(state7);

       LinkedList<State> newList =  State.removeDuplicate(states);
       System.out.println(newList);
    }
}
