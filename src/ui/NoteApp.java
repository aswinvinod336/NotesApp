package ui;

import service.NoteService;

import java.time.LocalDate;
import java.util.Scanner;

public class NoteApp {
   public static void displayMenu(){
       System.out.println(
               """
               1.Add a note.
               2.Update note.
               3.Find a note.
               4.Find all notes.
               5.Delete a note.
               6.Clear all notes.
               7.Exit application.
               ---------------------------
               Choose an option above:
               """
       );
   }

    public static void main(String[] args) {
        NoteService service=new NoteService();
       Scanner s=new Scanner(System.in);
       while(true){
           displayMenu();
           int option=s.nextInt();
           switch (option){
               case 1-> service.addNote();
               case 2->service.updateNote();
               case 3->service.findNote();
               case 4->service.findAllNotes();
               case 5->service.delNote();
               case 6->service.clearAllNotes();
               case 7->{
                   System.out.println("Application terminated");
                   System.exit(0);
               }
               default -> System.out.println("please enter a valid option");
           }
       }
    }

}
