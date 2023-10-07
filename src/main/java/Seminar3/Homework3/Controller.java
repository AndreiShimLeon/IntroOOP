package Seminar3.Homework3;

import java.sql.Array;
import java.util.ArrayList;

public class Controller {


//    public Controller(StudyGroup group) {
//        this.controller= new StudyGroupService(group);
//    }
//
//    private final StudyGroupService controller;
//
//    public void removeStudentByName(String name){
//        this.controller.removeStudentByLastName(name);
//    }
//    public void sortStudentsByIDs(){
//        this.controller.sortGroupByIDs();
//    }
//
//    public void sortStudentsByNameLength(){
//        this.controller.sortGroupByNameLength();
//    }
//    public void sortStudentsByName(){
//        this.controller.sortGroupByName();
//    }
//    public void sortStudentsByAge(){
//        this.controller.sortGroupByAge();
//    }
//
//    public void sortStream(ArrayList<Stream> streamList){
//        streamList.sort(new StreamComparator());
//    }
//
    private  StreamService streamService;
    private StudyGroupService studyGroupService;

    public void addGroupToControl(StudyGroup group){
        this.studyGroupService= new StudyGroupService(group);
    }
    public void addStreams( ArrayList<Stream> streams){
        this.streamService = new StreamService(streams);
    }


    public void removeStudentByLastName(String lastName){
        this.studyGroupService.removeStudentByLastName(lastName);
    }
    public void sortStudentsByIDs(){
        this.studyGroupService.sortGroupByIDs();
    }

    public void sortStudentsByNameLength(){
        this.studyGroupService.sortGroupByNameLength();
    }
    public void sortStudentsByName(){
        this.studyGroupService.sortGroupByName();
    }
    public void sortStudentsByAge(){
        this.studyGroupService.sortGroupByAge();
    }

    public void sortStream(){
        streamService.sortStream();
    }

}
