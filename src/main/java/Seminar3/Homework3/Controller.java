package Seminar3.Homework3;

public class Controller {

    public Controller(StudyGroup group) {
        this.controller= new StudyGroupService(group);
    }

    private final StudyGroupService controller;

    public void removeStudentByName(String name){
        this.controller.removeStudentByName(name);
    }

}
