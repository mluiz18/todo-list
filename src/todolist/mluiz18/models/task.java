package todolist.mluiz18.models;

public class task {
    private String title;
    private String description;
    private String initialDate;
    private String finalDate;

    public void Imprimir() {
        System.out.println("Titulo: " + this.title);
        System.out.println("Descrição: " + this.description);
        System.out.println("Data Inicial: " + this.initialDate);
        System.out.println("Data Final: " + this.finalDate);
    }

    public task(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }
}
