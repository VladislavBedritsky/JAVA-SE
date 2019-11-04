package modul_5.basicsOfOOP.task_1.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {

    private String nameDir;
    private List<TextFile> textFiles;

    public Directory (String nameDir) {
        this.nameDir = nameDir;
        textFiles = new ArrayList<>();
    }
    public void add (TextFile newTFile) {
        textFiles.add(newTFile);
    }
    public void setNameDir (String nameDir) {
        this.nameDir = nameDir;
    }
    public void setTextFiles (List<TextFile> textFiles) {
        this.textFiles = textFiles;
    }
    public String getNameDir () {
        return nameDir;
    }
    public List<TextFile> getTextFiles () {
        return textFiles;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return nameDir.equals(directory.nameDir) &&
                textFiles.equals(directory.textFiles);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameDir, textFiles);
    }
    @Override
    public String toString() {
        return "Directory{" +
                "nameDir='" + nameDir + '\'' +
                ", textFiles=" + textFiles +
                '}';
    }
}

