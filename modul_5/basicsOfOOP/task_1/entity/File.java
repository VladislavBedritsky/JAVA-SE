package modul_5.basicsOfOOP.task_1.entity;

import java.util.Objects;

abstract public class File {

    private String name;
    private Directory directory;

    public File (Directory directory,String name) {
        this.name = name;
        this.directory = directory;
    }

    abstract public void changeName(String name);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return name.equals(file.name) &&
                directory.equals(file.directory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, directory);
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", directory=" + directory +
                '}';
    }
}
