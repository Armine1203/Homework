package hw20_LinkedList;

import java.util.LinkedList;

public class State {
    private String name;
    public String capital;
    private String hymn;
    private String coatOfArms;
    private String flag;
    private String language;
    private int population;
    private int area;

    public State(String name, String capital, String hymn, String coatOfArms, String flag, String language, int population, int area) {
        this.name = name;
        this.capital = capital;
        this.hymn = hymn;
        this.coatOfArms = coatOfArms;
        this.flag = flag;
        this.language = language;
        this.population = population;
        this.area = area;
    }

    public boolean equals(State obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        return this.hymn.equals(obj.hymn) &
                this.coatOfArms.equals(obj.coatOfArms) &
                this.flag.equals(obj.flag);
    }

    public static LinkedList<State> removeDuplicate(LinkedList<State> states){
        LinkedList<State> newLinkedList = new LinkedList<>();
            for (State state: states){
                if (!newLinkedList.contains(state)){
                    newLinkedList.add(state);
                }
            }

        return newLinkedList;
    }


    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", hymn='" + hymn + '\'' +
                ", coatOfArms='" + coatOfArms + '\'' +
                ", flag='" + flag + '\'' +
                ", language='" + language + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }
}