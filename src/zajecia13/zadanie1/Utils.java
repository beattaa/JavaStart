package zajecia13.zadanie1;

import zajecia11.zadanie1.Employee;
import zajecia11.zadanie1.EmployeeStatistics;

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
        do {
            System.out.println("Podaj wynik kolejnego gracza (lub stop)");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            } else {
                String[] tabInput = input.split(" ");
                Participant participant = new Participant(tabInput[0], tabInput[1], Integer.valueOf(tabInput[2]));
                participants.add(participant);
            }
        }
        while (true);
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
