class Novels {
    public String author;
    public String bookname; 
    public int release;
    
    public Novels(String author, String bookname, int release){
        this.author = author;
        this.bookname = bookname;
        this.release = release;
    }

    public void getAuthor(String author){
        this.author = author; 
    }

    public void getBookName(String bookname){
        this.bookname = bookname; 
    }

    public void getYear(int release){
        this.release = release;
    }

    public void display(){
        System.out.println("Author : " + this.author);
        System.out.println("Book Name : " + this.bookname);
        System.out.println("Release year : " + this.release);
    }
}


public class Main{
    public static void main(String[]args){

        Novels novels = new Novels("Half Girlfriend", "Chethan bhagath", 2014);
        novels.display();

        novels.getAuthor("Paulo Cohelo");
        novels.getBookName("The Alchemist");
        novels.getYear(2016); 

        novels.display();
    }
}
