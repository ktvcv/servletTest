package demo.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "file_generator")
    @SequenceGenerator(name="file_generator", sequenceName = "file_seq", allocationSize=50)
    private Integer id;

    @Column(name = "creation_date", updatable = false)
    private Calendar calendar;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    @Column(name = "file", nullable = false)
    private byte[] file;

    public File() {
    }

    public File(Calendar calendar, byte[] file) {
        this.calendar = calendar;
        this.file = file;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}
