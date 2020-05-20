package zajecia13.zadanie1;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Utils {
    public static List<Participant> getParticipantsList() {
        List<Participant> participants = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wynik kolejnego gracza (lub stop)");
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("stop")) {
            String[] tabInput = input.split(" ");
            Participant participant = new Participant(tabInput[0], tabInput[1], Integer.valueOf(tabInput[2]));
            participants.add(participant);
            System.out.println("Podaj wynik kolejnego gracza (lub stop)");
            input = scanner.nextLine();
        }
        return participants;
    }

    public static void saveParticipantsToFile(String fileName, List<Participant> participantList) {
        try (
                FileWriter fileWriter = new FileWriter(fileName, true);
                BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {
            for (Participant participant : participantList) {
                writer.write(participant.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
