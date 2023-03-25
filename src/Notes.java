import java.util.Scanner;


public class Notes {
    private String noteId;
    private String header;
    private String filling;

    private Loggable logger;


    public Notes(String noteId, String header, String filling, Loggable logger) {
        this.noteId = noteId;
        this.header = header;
        this.filling = filling;

        this.logger = logger;
    }

    public Notes() {

    }

   public String getNoteId() {
        logger.saveToNotebook("Получаем ID записки" + noteId);
        return noteId;
    }

   public String getHeader() {
        logger.saveToNotebook("Получаем заголовок " + header);
        return header;
   }

   public String getFilling() {
       logger.saveToNotebook("Получаем текст " + filling);
       return filling;
   }
   public void setNoteId(String noteId) {
       logger.saveToNotebook("Записываем ID записки " + noteId);
       this.noteId = noteId;
   }

   public void setHeader(String header) {
       logger.saveToNotebook("Записываем заголовок записки "+ header);
       this.header = header;
   }

   public void setFilling(String filling) {
       logger.saveToNotebook("Записываем текст записки "+ filling);
       this.filling = filling;
   }


    @Override
    public String toString()  {
        return String.format("ID записки: %s, \n Заголовок: %s, \n Текст: %s \n", noteId, header, filling);
    }
}
