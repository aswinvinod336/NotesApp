package service;

import model.Note;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class NoteService {
    ArrayList<Note> notes=new ArrayList<>();
Scanner s=new Scanner(System.in);
    public void addNote(){
        System.out.println("Enter name:");
        String title=s.next();
        System.out.println("Enter description:");
        String description=s.next();
        String id= UUID.randomUUID().toString();
        LocalDate date=LocalDate.now();
        Note note=new Note(id,title,description,date);
        notes.add(note);
        System.out.println("Note created successfully!");
    }

    public void updateNote(){

    }
    public void delNote(){

    }
    public void findNote(){

    }
    public void findAllNotes(){

    }
    public void clearAllNotes(){

    }

}
