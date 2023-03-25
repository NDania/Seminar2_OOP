import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class ReadWriteFile {

    private String fileName;
    private String note;
    Notes notes;

    public ReadWriteFile(String fileName) {
        this.fileName = fileName;

    }

    public List<String> readListNotes()  throws IOException{        //Выводим весь перечень записок
        List<String> lines = new ArrayList<>();
        File file = new File(fileName);
        FileReader br = new FileReader(file);
        BufferedReader reader = new BufferedReader(br);
        String line = reader.readLine();
        while (line != null) {
            lines.add(line);
            System.out.printf("%s\n", lines);
        }
        reader.close();
        return lines;
    }

    @Override
    public String toString()  {
        return String.format("Список записок:\n %s, \n", fileName);
    }

    public List<String> readNote(String newNoteId) throws IOException {        //Читаем записку
        List<String> lines = new ArrayList<>();
        File file = new File(fileName);
        FileReader br = new FileReader(file);
        BufferedReader reader = new BufferedReader(br);
        String line = reader.readLine();
        String newHeader;
        String newFilling;
        while (line != null) {
            if(line == newNoteId) {
                newHeader = notes.getHeader();
                newFilling = notes.getFilling();
                String note = String.join("\n", newNoteId, newHeader, newFilling);
                System.out.printf("%s\n", note);
            }
        }
        reader.close();
        return lines;
    }

    public List<String> changeNote(String newNoteId, String newFilling) throws IOException {    //Меняем текст записки
        List<String> lines = new ArrayList<>();
        File file = new File(fileName);
        FileReader br = new FileReader(file);
        BufferedReader reader = new BufferedReader(br);
        String line = reader.readLine();
        String str = null;
        while (line != null) {
            if (notes.getNoteId().equals(newNoteId)) {
                String oldFilling = notes.getFilling();
                str = oldFilling.replace(notes.getFilling(), newFilling);
            }
        }
        notes.setFilling(str);
        reader.close();
        return lines;
    }

    public List<String> deleteNote(String newNoteId) throws IOException {        //Удаляем записку
        List<String> lines = new ArrayList<>();
        File file = new File(fileName);
        FileReader br = new FileReader(file);
        BufferedReader reader = new BufferedReader(br);
        String line = reader.readLine();
        while (line != null) {
            if(line != newNoteId){
                lines.add(line);
                System.out.printf("%s\n", lines);
            }
        }
        reader.close();
        return lines;
    }

    public void writeNoteFile(String note) {
        try(FileWriter fw = new FileWriter(fileName, true)) {
            fw.append(note);
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
