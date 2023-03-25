import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotesActions {

    Notes notes = new Notes();
    ReadWriteFile readWriteFile;
    Scanner iNoteId = new Scanner(System.in);
    Scanner iHeader = new Scanner(System.in);
    Scanner iFilling = new Scanner(System.in);
    private String str;




    public void createNote()   {     //Создаем записку
        System.out.println("Введите ID новой записки: \n");
        String noteId = iNoteId.nextLine();
        notes.setNoteId(noteId);
        System.out.println("Введите заголовок новой записки: \n");
        String newHeader = iHeader.nextLine();
        notes.setHeader(newHeader);
        System.out.println("Введите текст новой записки: \n");
        String newFilling = iFilling.nextLine();
        notes.setFilling(newFilling);
        String note = String.join("\n", noteId, newHeader, newFilling);
        readWriteFile.writeNoteFile(note);
    }

    @Override
    public String toString()  {
        return String.format("ID новой записки: %s, \n Заголовок: %s, \n Текст: %s \n", iNoteId, iHeader, iFilling);
    }

    public void changeNote() {     //Вносим изменения в записку
        System.out.println("Введите ID записки для изменения: ");
        String newNoteId = iNoteId.nextLine();
        System.out.print("Введите новый текст:\n");
        String newFilling = iFilling.nextLine();
        try {
            readWriteFile.changeNote(newNoteId, newFilling);
        } catch (Exception e) {
            System.out.println("Note not found");
        }
    }

    public void deleteNote() throws IOException {     //Удаляем записку
        System.out.println("Введите ID записки для удаления: ");
        String newNoteId = iNoteId.nextLine();
        readWriteFile.deleteNote(newNoteId);
    }


    public void readNote()  {      //Читаем записку
        System.out.println("Введите ID записки для чтения: ");
        String newNoteId = notes.getNoteId();
        try {
            readWriteFile.readNote(newNoteId);
        } catch (Exception e) {
            System.out.println("Note not found");
        }
    }

    public void readListNotes() throws Exception {   //Выводим весь перечень записок
        readWriteFile.readListNotes();
    }
}

