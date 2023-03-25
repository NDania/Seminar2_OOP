import java.io.IOException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException {

        ReadWriteFile readWriteFile = new ReadWriteFile("NotesCollection.txt");
        FilesLogger filesLogger = new FilesLogger("ChangesJournal.txt");
        NotesActions notesActions = new NotesActions();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Если Вы хотите создать записку, введите '1' \n если изменить записку, введите '2' \n если прочитать записку, введите '3'\n если удалить записку, введите '4' \n если хотите получить все записки, введите '5': \n");

        int choice = iScanner.nextInt();

        switch(choice)  {
            case 1:
                notesActions.createNote();
                break;
            case 2:
                notesActions.changeNote();
                break;
            case 3:
                notesActions.readNote();
                break;
            case 4:
                notesActions.deleteNote();
                break;
            case 5:
                try {
                    notesActions.readListNotes();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                System.out.println("Ошибка при вводе. Пожалуйста, повторите ввод.");
                break;
        }
        iScanner.close();
    }
}
