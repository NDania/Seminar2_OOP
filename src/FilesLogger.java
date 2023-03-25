import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FilesLogger implements Loggable {

    private String filenameLog;

    public FilesLogger(String filenameLog) {
        this.filenameLog = filenameLog;

    }

    @Override
    public void saveToNotebook(String incident) {
        try{
            FileWriter writer = new FileWriter(filenameLog, true);
            LocalDateTime incidentTime = LocalDateTime.now();
            writer.write(String.format("%s  %s \n", incidentTime, incident));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
