package pl.codegym.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
OOP: książki
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " jest detektywem";
            String markTwainOutput = getBook().getTitle() + " została napisana przez " + author;
            String output = null;

            if (author.equals("Agatha Christie")){
                output = agathaChristieOutput;
            }else if (author.equals("Mark Twain")){
                output = markTwainOutput;
            }

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book{

        public String title;
        
        public MarkTwainBook(String BookTitle){
            super("Mark Twain");
            this.title = BookTitle;
        }

        public MarkTwainBook getBook(){
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

    public static class AgathaChristieBook extends Book {

        public String title;
        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }

        public AgathaChristieBook(String BookTitle){
            super("Agatha Christie");
            this.title = BookTitle;
        }
    }
}
