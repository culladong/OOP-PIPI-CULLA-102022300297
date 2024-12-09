import java.time.LocalDate;

public class Task {
    // TO DO: Lengkapi atribut-atribut private kelas Task
    private LocalDate dueDate;
    private String title, priority, status;
    LocalDate duedate;
    

    // TO DO: Buat constructor untuk kelas Task
    public Task(String title, String priority, String status, LocalDate duedate){
        this.title = title;
        this.priority = priority;
        this.status = status;
        this.duedate = duedate;
    }
    // TO DO: Buat getter untuk title
    public String getTitle() {
        return title;
    }
    // TO DO: Buat getter untuk priority
    public String getPriority() {
        return priority;
    }
    // TO DO: Buat getter untuk dueDate
    public String getStatus() {
        return status;
    }
    // TO DO: Buat getter untuk status
    public LocalDate getDueDate() {
        return duedate;
    }
    // TO DO: Buat setter untuk status
    public void setStatus(String status) {
        this.status = status;
    }
    

  


    

    

}