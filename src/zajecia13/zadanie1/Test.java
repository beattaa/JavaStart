package zajecia13.zadanie1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Participant> participants = Utils.getParticipantsList();
        Collections.sort(participants);
        System.out.println(participants.toString());
        Utils.saveParticipantsToFile("stats.csv", participants);
    }


}
