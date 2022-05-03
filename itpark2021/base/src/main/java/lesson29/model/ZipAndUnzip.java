package lesson29.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name = "ZIP")
public class ZipAndUnzip {
    @Id
    @Column(name = "ZIP")
    private String zip;
    @Nullable
    @Column(name = "UNZIP")
    private String unzip;

    public ZipAndUnzip(String zip, String unzip) {
        this.zip = zip;
        this.unzip = unzip;
    }
}

