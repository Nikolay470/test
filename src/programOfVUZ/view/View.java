package programOfVUZ.view;

import programOfVUZ.model.classes.*;
import programOfVUZ.model.abstractClasses.Human;

import java.util.ArrayList;
import java.util.Scanner;

public class View implements ViewInterface {
    private Scanner in = new Scanner(System.in);
    private int command;

    @Override
    public int getCategory() {
        System.out.println("Выберите категорию");
        System.out.println(
                "1. Учителя\n"
                        + "2. Студенты\n"
                        + "3. Группы\n"
                        + "4. Факультеты"
        );

        command = in.nextInt();
        in.nextLine();
        return command;
    }

    @Override
    public int choiceMoveOfTeachers() {
        System.out.println("Выберите действие");
        System.out.println(
                "1. Добавить учителя\n"
                        + "2. Удалить учителя\n"
                        + "3. Найти учителя\n"
                        + "4. Информация об учителе\n"
        );

        command = in.nextInt();
        in.nextLine();
        return command;
    }

    @Override
    public int choiceMoveOfStudents() {
        System.out.println("Выберите действие");
        System.out.println(
                "1. Добавить студента\n"
                        + "2. Удалить студента\n"
                        + "3. Найти студента\n"
                        + "4. Информация об студенте\n"
        );

        command = in.nextInt();
        in.nextLine();
        return command;
    }

    @Override
    public int choiceMoveOfGroups() {
        // написать логику
        return 0;
    }

    @Override
    public String printList(ArrayList<? extends Human> list) {
        // написать логику
        return null;
    }

    @Override
    public String printListGroups(ArrayList<StudyGroup> groups) {
        // написать логику
        return null;
    }

    @Override
    public void addStudent() {
        // написать логику
    }

    @Override
    public void addTeacher() {
        // написать логику
    }

    @Override
    public void addGroup() {
        // написать логику
    }

    @Override
    public Student removeStudent(Student student) {
        // написать логику
        return null;
    }

    @Override
    public Teacher removeTeacher(Teacher teacher) {
        // написать логику
        return null;
    }

    @Override
    public void moveGroupInArchive(StudyGroup group) {
        // написать логику
    }

    @Override
    public String surnameStudent() {
        // написать логику
        return null;
    }

    @Override
    public String surnameTeacher() {
        // написать логику
        return null;
    }
}
