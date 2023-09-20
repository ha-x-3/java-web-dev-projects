package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD lateralus = new CD("Lateralus", true);
        CD javaProjects = new CD("Java Projects");
        DVD theOfficeSeason1 = new DVD("The Office: Season 1");

        //Add Files to each object
        File grudge = new File("The Grudge", 50);
        File eon = new File("Eon Blue Apocalypse", 61);
        File patient = new File("The Patient", 57);
        lateralus.writeFile(grudge);
        lateralus.writeFile(eon);
        lateralus.writeFile(patient);

        File quiz = new File("Java Quiz Runner", 240);
        File projects = new File("Java-Web-Dev-Projects", 52);
        javaProjects.writeFile(quiz);
        javaProjects.writeFile(projects);

        File s1e1 = new File("S1E1 - Pilot", 420);
        File s1e2 = new File("S1E2 - Diversity Day", 420);
        File s1e3 = new File("S1E3 - Health Care", 420);
        File s1e4 = new File("S1E4 - The Alliance", 420);
        theOfficeSeason1.writeFile(s1e1);
        theOfficeSeason1.writeFile(s1e2);
        theOfficeSeason1.writeFile(s1e3);
        theOfficeSeason1.writeFile(s1e4);

        //Print each CD and DVD object
        System.out.println(lateralus);
        System.out.println(javaProjects);
        System.out.println(theOfficeSeason1);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        //Use runFile
        lateralus.runFile(grudge);
        javaProjects.runFile(quiz);
        theOfficeSeason1.runFile(s1e4);

        //Try to write a file already present
        theOfficeSeason1.writeFile(s1e1);

        //Use eraseData to remove a file then try to run it
        javaProjects.removeFile(projects);
        javaProjects.runFile(projects);

        //Use reformatDisc then try to run
        lateralus.reformatDisc();
        lateralus.runFile(patient);

        //Create file that's too big and try to add
        File tooBigFile = new File("too-big-file.mp3", 720);
        lateralus.writeFile(tooBigFile);




    }
}