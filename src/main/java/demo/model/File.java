package demo.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "file_generator")
    @SequenceGenerator(name="file_generator", sequenceName = "file_seq", allocationSize=1)
    private Integer id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "type",nullable = false)
    private String type;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    @Column(name = "file", nullable = false)
    private byte[] data;

    public File() {
    }

    public File(String name, String type, byte[] data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

}
