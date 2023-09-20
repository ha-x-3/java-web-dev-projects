package org.launchcode;

public class CD extends Media implements Rewritable{

    private boolean isMusicCD;

    public CD(String name, boolean isMusicCD) {
        super(name, "", 800, 700);
        this.isMusicCD = isMusicCD;
        setDiskType(isMusicCD ? "Music CD" : "CD-ROM");
    }

    public CD(String name) {
        this(name, false);
    }

    public boolean isMusicCD() {
        return isMusicCD;
    }

    public void setMusicCD(boolean musicCD) {
        isMusicCD = musicCD;
    }

    @Override
    public String toString() {
        String header = isMusicCD ? "Tracks" : "Files";
        return super.toString() + getFormattedFileList(header);
    }


    @Override
    public void writeFile(File file) {
        spinDisc();
        String fileType = isMusicCD ? "track" : "file";
        if (getFiles().contains(file)) {
            System.out.println("The " + fileType + " " + file.getName() + " has already been added.");
        } else if (getSpaceUsed() + file.getSize() > getCapacity()) {
            System.out.println("WARNING! There is not enough space on the " + getDiskType() + " for " + file.getName() + ".");
        } else {
            getFiles().add(file);
            System.out.println("The " + fileType + " " + file.getName() + " has been added to " + getName() + ".");
        }
    }

    @Override
    public void removeFile(File file) {
        if (isMusicCD) {
            System.out.println("Individual files cannot be removed from a music CD once written.");
        } else {
            spinDisc();
            if (filePresent(file)) {
                getFiles().remove(file);
                System.out.println("The file " + file.getName() + " has been removed from the " + getDiskType() + ".");
            }
        }
    }

    @Override
    public void reformatDisc() {
        spinDisc();
        getFiles().clear();
        setMusicCD(false);
        setDiskType("CD-RW");
        setName("Unnamed CD-RW");
    }

    @Override
    public void runFile(File file) {
        if (filePresent(file)) {
            spinDisc();
            String verb = isMusicCD ? "Playing " : "Opening file ";
            System.out.println(verb + file.getName() + "...");
        }
    }
}
